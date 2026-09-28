# Compiler Design

Coursework for **Compiler Design** at the University of Tehran, Faculty of Electrical and Computer Engineering (Spring 2025).

The main project is a front end, written with **ANTLR 4** and **Java**, for **SimpleLang/CPY**: a C-like language with Python-style indentation. It was built in phases, from grammar and AST construction to semantic analysis with symbol tables.

## Projects

| Phase | Folder | What it does | Tests |
|-------|--------|--------------|-------|
| 1 | [phase1-parser-and-ast](phase1-parser-and-ast/) | Preprocesses CPY (comment removal, indentation to C-style blocks), parses it with a ~1,000-line ANTLR grammar, builds a typed **AST**, and runs a visitor that reports statements per scope and expression depth | ✅ 11 / 11 |
| 2 | [phase2-name-analysis](phase2-name-analysis/) | **Name analysis** over the AST with a scoped **symbol table**: undeclared variables and functions, and duplicate declarations | ⚠️ 1 / 7 ([details](phase2-name-analysis/#status)) |

Test counts come from the course's autograder test suite, which is reproduced in each folder's `tests/expected/` and run with `./run_tests.sh`.

## Written homework

| | Topics |
|--|--------|
| [HW2](homework/hw2.pdf) | Context-free grammars, ambiguity (dangling else), eliminating left recursion, FIRST/FOLLOW sets, recursive-descent and top-down parsing |
| [HW3](homework/hw3.pdf) | Bottom-up parsing |

(The homework answers are handwritten scans, in Persian.)

## Requirements

- **JDK 21 or newer.** The code uses `List.getLast()`.
- ANTLR 4.13.1. The complete jar is included in each project's `utilities/` folder, so nothing else needs installing.
