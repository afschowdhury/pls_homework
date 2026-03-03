# Verification Condition Generator (VCG) for IMP

CSC 7101 - Spring 2026 - Project 1

## Building

```bash
make
```

## Running

```bash
java -cp ".:Parse/antlr-4.13.2-complete.jar" VCG <input_file>.vcg
```

Or build the jar first:
```bash
make jar
java -jar VCG.jar <input_file>.vcg
```

## Structure

- `VCG.java` - Main entry point. Sets up ANTLR lexer/parser and invokes parsing.
- `Parse/IMP.g4` - ANTLR4 grammar for IMP with embedded actions that build ASTs and compute verification conditions.
- `Tree/` - AST node classes using the Composite Design Pattern:
  - **Expressions** (`Exp` hierarchy): `Ident`, `IntLit`, `OpExp`, `BoolLit`, `ForAll`, `Exists`, `FuncApp`
  - **Statements** (`Stmt` hierarchy): `Skip`, `Assign`, `Seq`, `IfThenElse`, `While`, `AssertStmt`

## Design

The VCG uses the Weakest Liberal Precondition (WLP) predicate transformer semantics.
Expression trees support `print()` (with precedence-based parenthesization) and `substitute()` (variable substitution).
Statement trees support `wlp()` which computes the weakest precondition given a postcondition.

For while loops, intermediate verification conditions are printed during the WLP traversal.
The final VC (`precondition => wlp(statements, postcondition)`) is printed by the grammar's `program` rule.

## AI Tool Usage

An AI assistant (Cursor with Claude) was used to help implement this project.
The AI was given the project specification and skeleton code, and assisted with:
- Designing the AST class hierarchy (Exp subclasses and Stmt subclasses)
- Implementing the substitute and wlp methods
- Completing the ANTLR grammar actions
- Debugging build issues (e.g., ANTLR label conflicts)
