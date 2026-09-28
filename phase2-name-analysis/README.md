# Phase 2 – Name Analysis

Semantic analysis for the SimpleLang/CPY compiler. It builds on the Phase 1 grammar and AST and adds a scoped **symbol table** and a `NameAnalyzer` visitor.

## What it does

- Builds nested scopes for the program, functions, blocks and `for` headers (`src/main/symbolTable/`).
- Registers variables, parameters and functions as symbol-table items, and raises `ItemAlreadyExists` / `ItemNotFound` errors.
- Reports errors with line numbers:

  ```
  Line:6-> b not declared
  Line:9-> b not declared
  Line:14-> c not declared
  ```

## Run

```bash
javac -cp utilities/antlr-4.13.1-complete.jar -d out $(find src gen -name '*.java')
java -cp out:utilities/antlr-4.13.1-complete.jar SimpleLang "tests/NameAnalysis/1-Variable Undefined.cpy"
./run_tests.sh      # full autograder suite
```

## Status

This phase is **incomplete**:

| Test | Result |
|------|--------|
| Name: Variable Undefined | ✅ pass |
| Name: Function Undefined | ❌ misses calls to undeclared functions and reports a false "function already declared" |
| Optimisation: unused variables and parameters, statements after `return`, no-effect statements, typedef/constant replacement, main access | ❌ not implemented |

The phase also asked for an optimisation pass that removes dead and no-effect code. `SimpleLang.java` currently runs only the `NameAnalyzer`.
