// Generated from C:/Users/jpagu/IdeaProjects/Interpreter 1/src\Interpreter.g4 by ANTLR 4.7.2
package interpreter;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(InterpreterParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(InterpreterParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(InterpreterParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(InterpreterParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(InterpreterParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(InterpreterParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(InterpreterParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(InterpreterParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#conditionSatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionSatement(InterpreterParser.ConditionSatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#conditionSatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionSatement(InterpreterParser.ConditionSatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(InterpreterParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(InterpreterParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#intAssign}.
	 * @param ctx the parse tree
	 */
	void enterIntAssign(InterpreterParser.IntAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#intAssign}.
	 * @param ctx the parse tree
	 */
	void exitIntAssign(InterpreterParser.IntAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#floatAssign}.
	 * @param ctx the parse tree
	 */
	void enterFloatAssign(InterpreterParser.FloatAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#floatAssign}.
	 * @param ctx the parse tree
	 */
	void exitFloatAssign(InterpreterParser.FloatAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#stringAssign}.
	 * @param ctx the parse tree
	 */
	void enterStringAssign(InterpreterParser.StringAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#stringAssign}.
	 * @param ctx the parse tree
	 */
	void exitStringAssign(InterpreterParser.StringAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#intRes}.
	 * @param ctx the parse tree
	 */
	void enterIntRes(InterpreterParser.IntResContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#intRes}.
	 * @param ctx the parse tree
	 */
	void exitIntRes(InterpreterParser.IntResContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#floatRes}.
	 * @param ctx the parse tree
	 */
	void enterFloatRes(InterpreterParser.FloatResContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#floatRes}.
	 * @param ctx the parse tree
	 */
	void exitFloatRes(InterpreterParser.FloatResContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#stringRes}.
	 * @param ctx the parse tree
	 */
	void enterStringRes(InterpreterParser.StringResContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#stringRes}.
	 * @param ctx the parse tree
	 */
	void exitStringRes(InterpreterParser.StringResContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(InterpreterParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(InterpreterParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(InterpreterParser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#floatValue}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(InterpreterParser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#strLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStrLiteral(InterpreterParser.StrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#strLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStrLiteral(InterpreterParser.StrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#boolVal}.
	 * @param ctx the parse tree
	 */
	void enterBoolVal(InterpreterParser.BoolValContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#boolVal}.
	 * @param ctx the parse tree
	 */
	void exitBoolVal(InterpreterParser.BoolValContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(InterpreterParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(InterpreterParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(InterpreterParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(InterpreterParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(InterpreterParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(InterpreterParser.RvalueContext ctx);
}