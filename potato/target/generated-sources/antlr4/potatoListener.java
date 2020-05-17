// Generated from potato.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link potatoParser}.
 */
public interface potatoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link potatoParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(potatoParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(potatoParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(potatoParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(potatoParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(potatoParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(potatoParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(potatoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(potatoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(potatoParser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(potatoParser.UsesUnitsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(potatoParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(potatoParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(potatoParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(potatoParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(potatoParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(potatoParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(potatoParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(potatoParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(potatoParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(potatoParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(potatoParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(potatoParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(potatoParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(potatoParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(potatoParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(potatoParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(potatoParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(potatoParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(potatoParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(potatoParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(potatoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(potatoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(potatoParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(potatoParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(potatoParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(potatoParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(potatoParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(potatoParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(potatoParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(potatoParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(potatoParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(potatoParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(potatoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(potatoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(potatoParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(potatoParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(potatoParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(potatoParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(potatoParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(potatoParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(potatoParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(potatoParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(potatoParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(potatoParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(potatoParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(potatoParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(potatoParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(potatoParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(potatoParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(potatoParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(potatoParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(potatoParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(potatoParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(potatoParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(potatoParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(potatoParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(potatoParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(potatoParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(potatoParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(potatoParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(potatoParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(potatoParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(potatoParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(potatoParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(potatoParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(potatoParser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(potatoParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(potatoParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(potatoParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(potatoParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(potatoParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(potatoParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(potatoParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(potatoParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#fileType}.
	 * @param ctx the parse tree
	 */
	void enterFileType(potatoParser.FileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#fileType}.
	 * @param ctx the parse tree
	 */
	void exitFileType(potatoParser.FileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(potatoParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(potatoParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(potatoParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(potatoParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(potatoParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(potatoParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(potatoParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(potatoParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(potatoParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(potatoParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(potatoParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(potatoParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(potatoParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(potatoParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(potatoParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(potatoParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(potatoParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(potatoParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(potatoParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(potatoParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(potatoParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(potatoParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(potatoParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(potatoParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(potatoParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(potatoParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(potatoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(potatoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(potatoParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(potatoParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(potatoParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(potatoParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(potatoParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(potatoParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(potatoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(potatoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(potatoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(potatoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(potatoParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(potatoParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(potatoParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(potatoParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(potatoParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(potatoParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(potatoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(potatoParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(potatoParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(potatoParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(potatoParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(potatoParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(potatoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(potatoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(potatoParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(potatoParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(potatoParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(potatoParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(potatoParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(potatoParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(potatoParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(potatoParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(potatoParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(potatoParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(potatoParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(potatoParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(potatoParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(potatoParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(potatoParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(potatoParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(potatoParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(potatoParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(potatoParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(potatoParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(potatoParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(potatoParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(potatoParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(potatoParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(potatoParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(potatoParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(potatoParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(potatoParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(potatoParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(potatoParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(potatoParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(potatoParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(potatoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(potatoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(potatoParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(potatoParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(potatoParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(potatoParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(potatoParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(potatoParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(potatoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(potatoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(potatoParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(potatoParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(potatoParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(potatoParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(potatoParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(potatoParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(potatoParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(potatoParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(potatoParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(potatoParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(potatoParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(potatoParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link potatoParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(potatoParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link potatoParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(potatoParser.RecordVariableListContext ctx);
}