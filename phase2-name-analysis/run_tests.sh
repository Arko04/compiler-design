#!/usr/bin/env bash
# Builds the compiler and runs every test that has an expected output in tests/expected/.
# A test passes when the compiler's output contains the expected lines (same rule as the
# course's GitHub Classroom autograder). Requires JDK 21+.
set -u
cd "$(dirname "$0")"
CP="utilities/antlr-4.13.1-complete.jar"
javac -cp "$CP" -d out $(find src gen -name '*.java') || exit 1
pass=0; total=0
for exp in tests/expected/*.expected; do
  name=$(basename "$exp" .expected)
  input=$(find tests -name "$name.cpy" -not -path '*/expected/*' | head -1)
  total=$((total + 1))
  got=$(java -cp "out:$CP" SimpleLang "$input" | sort -t':' -k1.6n -k2)
  if python3 -c 'import sys; e=open(sys.argv[1]).read().strip(); sys.exit(0 if e in sys.stdin.read() else 1)' "$exp" <<< "$got"; then
    echo "PASS  $name"; pass=$((pass + 1))
  else
    echo "FAIL  $name"
  fi
done
echo "$pass/$total tests passed"
[ "$pass" -eq "$total" ]
