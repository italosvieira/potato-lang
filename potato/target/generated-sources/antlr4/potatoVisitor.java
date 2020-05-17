// Generated from potato.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link potatoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface potatoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link potatoParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(potatoParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(potatoParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(potatoParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(potatoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsesUnitsPart(potatoParser.UsesUnitsPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDeclarationPart(potatoParser.LabelDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(potatoParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(potatoParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(potatoParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#constantChr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantChr(potatoParser.ConstantChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(potatoParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#unsignedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumber(potatoParser.UnsignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#unsignedInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedInteger(potatoParser.UnsignedIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#unsignedReal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedReal(potatoParser.UnsignedRealContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(potatoParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(potatoParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(potatoParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinitionPart(potatoParser.TypeDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(potatoParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(potatoParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#procedureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureType(potatoParser.ProcedureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(potatoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(potatoParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#scalarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(potatoParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#subrangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubrangeType(potatoParser.SubrangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(potatoParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#structuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(potatoParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpackedStructuredType(potatoParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#stringtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringtype(potatoParser.StringtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(potatoParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(potatoParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(potatoParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#componentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentType(potatoParser.ComponentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#recordType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordType(potatoParser.RecordTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(potatoParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#fixedPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPart(potatoParser.FixedPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#recordSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSection(potatoParser.RecordSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#variantPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariantPart(potatoParser.VariantPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(potatoParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#variant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariant(potatoParser.VariantContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(potatoParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(potatoParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileType(potatoParser.FileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(potatoParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(potatoParser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(potatoParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(potatoParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(potatoParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(potatoParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(potatoParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(potatoParser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(potatoParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(potatoParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#constList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstList(potatoParser.ConstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(potatoParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(potatoParser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(potatoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlabelledStatement(potatoParser.UnlabelledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(potatoParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(potatoParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(potatoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(potatoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#relationaloperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationaloperator(potatoParser.RelationaloperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(potatoParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#additiveoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveoperator(potatoParser.AdditiveoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(potatoParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeoperator(potatoParser.MultiplicativeoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#signedFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedFactor(potatoParser.SignedFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(potatoParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#unsignedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedConstant(potatoParser.UnsignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#functionDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDesignator(potatoParser.FunctionDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(potatoParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(potatoParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(potatoParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(potatoParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#procedureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureStatement(potatoParser.ProcedureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#actualParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParameter(potatoParser.ActualParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#parameterwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterwidth(potatoParser.ParameterwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(potatoParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(potatoParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(potatoParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#structuredStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredStatement(potatoParser.StructuredStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(potatoParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(potatoParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(potatoParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(potatoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(potatoParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#caseListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseListElement(potatoParser.CaseListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetetiveStatement(potatoParser.RepetetiveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(potatoParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(potatoParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(potatoParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(potatoParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#initialValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialValue(potatoParser.InitialValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#finalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalValue(potatoParser.FinalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#withStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(potatoParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link potatoParser#recordVariableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordVariableList(potatoParser.RecordVariableListContext ctx);
}