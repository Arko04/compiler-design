# Phase 1 – Parser & AST

The first phase of a compiler for **CPY**: C semantics, written with Python-style indentation (`:` opens a block, `end` closes it).

```
void foo():
    int a
end
```

## Pipeline

1. **Preprocessing** (`src/SimpleLang.java`): strips `#` and `//` comments, then `convertCPY()` turns indentation-based blocks into C-style braces while keeping line numbers.
2. **Parsing** (`src/main/grammar/SimpleLang.g4`): a ~1,000-line ANTLR 4 grammar covering declarations, typedefs, pointers, arrays, initialiser lists, `switch`/`do-while`, and the C expression precedence hierarchy. Grammar actions build the AST directly.
3. **AST** (`src/main/ast/nodes/`): typed node classes for declarations, functions, statements, expressions, initialisers and types.
4. **Analysis visitor** (`src/main/visitor/TestVisitor.java`): walks the AST and reports:
   - the number of statements directly inside each scope (functions, loops, `if`/`else`, blocks)
   - each expression node (operator, identifier or constant), in order

   ```
   Line 2: Stmt function reverseNumber = 3
   Line 4: Expr >
   Line 4: Stmt while = 2
   ```

## Run

```bash
# build
javac -cp utilities/antlr-4.13.1-complete.jar -d out $(find src gen -name '*.java')
# run on a program
java -cp out:utilities/antlr-4.13.1-complete.jar SimpleLang tests/11-program.cpy
# run the test suite
./run_tests.sh
```

`gen/` contains the ANTLR-generated lexer and parser. To regenerate it after changing the grammar:
`java -jar utilities/antlr-4.13.1-complete.jar -visitor -o gen src/main/grammar/SimpleLang.g4`

## Status

All **11/11** autograder tests pass (functions, `for`, `if`, `while`, nesting, unary and binary expressions, and a complete program).
