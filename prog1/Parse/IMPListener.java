// Generated from IMP.g4 by ANTLR 4.13.2

    package Parse;
    import Tree.*;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IMPParser}.
 */
public interface IMPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IMPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IMPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IMPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void enterStatementlist(IMPParser.StatementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void exitStatementlist(IMPParser.StatementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IMPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IMPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(IMPParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(IMPParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void enterBoolexp(IMPParser.BoolexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#boolexp}.
	 * @param ctx the parse tree
	 */
	void exitBoolexp(IMPParser.BoolexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#boolterm}.
	 * @param ctx the parse tree
	 */
	void enterBoolterm(IMPParser.BooltermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#boolterm}.
	 * @param ctx the parse tree
	 */
	void exitBoolterm(IMPParser.BooltermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#boolterm2}.
	 * @param ctx the parse tree
	 */
	void enterBoolterm2(IMPParser.Boolterm2Context ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#boolterm2}.
	 * @param ctx the parse tree
	 */
	void exitBoolterm2(IMPParser.Boolterm2Context ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#boolfactor}.
	 * @param ctx the parse tree
	 */
	void enterBoolfactor(IMPParser.BoolfactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#boolfactor}.
	 * @param ctx the parse tree
	 */
	void exitBoolfactor(IMPParser.BoolfactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#compexp}.
	 * @param ctx the parse tree
	 */
	void enterCompexp(IMPParser.CompexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#compexp}.
	 * @param ctx the parse tree
	 */
	void exitCompexp(IMPParser.CompexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#arithexp}.
	 * @param ctx the parse tree
	 */
	void enterArithexp(IMPParser.ArithexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#arithexp}.
	 * @param ctx the parse tree
	 */
	void exitArithexp(IMPParser.ArithexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#arithterm}.
	 * @param ctx the parse tree
	 */
	void enterArithterm(IMPParser.ArithtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#arithterm}.
	 * @param ctx the parse tree
	 */
	void exitArithterm(IMPParser.ArithtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#arithfactor}.
	 * @param ctx the parse tree
	 */
	void enterArithfactor(IMPParser.ArithfactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#arithfactor}.
	 * @param ctx the parse tree
	 */
	void exitArithfactor(IMPParser.ArithfactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#arithexplist}.
	 * @param ctx the parse tree
	 */
	void enterArithexplist(IMPParser.ArithexplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#arithexplist}.
	 * @param ctx the parse tree
	 */
	void exitArithexplist(IMPParser.ArithexplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(IMPParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(IMPParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link IMPParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(IMPParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IMPParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(IMPParser.IntegerContext ctx);
}