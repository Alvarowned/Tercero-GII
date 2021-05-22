// Generated from .\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(ExprParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(ExprParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#punto_coma}.
	 * @param ctx the parse tree
	 */
	void enterPunto_coma(ExprParser.Punto_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#punto_coma}.
	 * @param ctx the parse tree
	 */
	void exitPunto_coma(ExprParser.Punto_comaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_include}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_include(ExprParser.Palabra_reservada_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_include}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_include(ExprParser.Palabra_reservada_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nombre_variable}.
	 * @param ctx the parse tree
	 */
	void enterNombre_variable(ExprParser.Nombre_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nombre_variable}.
	 * @param ctx the parse tree
	 */
	void exitNombre_variable(ExprParser.Nombre_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variable_numerica}.
	 * @param ctx the parse tree
	 */
	void enterVariable_numerica(ExprParser.Variable_numericaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variable_numerica}.
	 * @param ctx the parse tree
	 */
	void exitVariable_numerica(ExprParser.Variable_numericaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#cadena_de_texto}.
	 * @param ctx the parse tree
	 */
	void enterCadena_de_texto(ExprParser.Cadena_de_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#cadena_de_texto}.
	 * @param ctx the parse tree
	 */
	void exitCadena_de_texto(ExprParser.Cadena_de_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipo_de_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_dato(ExprParser.Tipo_de_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipo_de_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_dato(ExprParser.Tipo_de_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_and}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_and(ExprParser.Palabra_reservada_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_and}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_and(ExprParser.Palabra_reservada_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_or}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_or(ExprParser.Palabra_reservada_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_or}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_or(ExprParser.Palabra_reservada_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_begin}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_begin(ExprParser.Palabra_reservada_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_begin}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_begin(ExprParser.Palabra_reservada_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_end}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_end(ExprParser.Palabra_reservada_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_end}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_end(ExprParser.Palabra_reservada_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_function}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_function(ExprParser.Palabra_reservada_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_function}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_function(ExprParser.Palabra_reservada_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_main}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_main(ExprParser.Palabra_reservada_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_main}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_main(ExprParser.Palabra_reservada_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_while}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_while(ExprParser.Palabra_reservada_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_while}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_while(ExprParser.Palabra_reservada_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_if}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_if(ExprParser.Palabra_reservada_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_if}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_if(ExprParser.Palabra_reservada_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_for}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_for(ExprParser.Palabra_reservada_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_for}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_for(ExprParser.Palabra_reservada_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(ExprParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(ExprParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(ExprParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(ExprParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_suma}.
	 * @param ctx the parse tree
	 */
	void enterOp_suma(ExprParser.Op_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_suma}.
	 * @param ctx the parse tree
	 */
	void exitOp_suma(ExprParser.Op_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_resta}.
	 * @param ctx the parse tree
	 */
	void enterOp_resta(ExprParser.Op_restaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_resta}.
	 * @param ctx the parse tree
	 */
	void exitOp_resta(ExprParser.Op_restaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacion(ExprParser.Op_multiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacion(ExprParser.Op_multiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#op_division}.
	 * @param ctx the parse tree
	 */
	void enterOp_division(ExprParser.Op_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#op_division}.
	 * @param ctx the parse tree
	 */
	void exitOp_division(ExprParser.Op_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(ExprParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(ExprParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(ExprParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(ExprParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void enterNombre_funcion(ExprParser.Nombre_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void exitNombre_funcion(ExprParser.Nombre_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(ExprParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(ExprParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_asignar}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_asignar(ExprParser.Palabra_reservada_asignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_asignar}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_asignar(ExprParser.Palabra_reservada_asignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_void}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_void(ExprParser.Palabra_reservada_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_void}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_void(ExprParser.Palabra_reservada_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ExprParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_cadena}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_cadena(ExprParser.Palabra_reservada_cadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_cadena}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_cadena(ExprParser.Palabra_reservada_cadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#palabra_reservada_numero}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_numero(ExprParser.Palabra_reservada_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#palabra_reservada_numero}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_numero(ExprParser.Palabra_reservada_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tipo_de_variable}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_variable(ExprParser.Tipo_de_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tipo_de_variable}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_variable(ExprParser.Tipo_de_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(ExprParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(ExprParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comparacion(ExprParser.Expr_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comparacion(ExprParser.Expr_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr_condicional}.
	 * @param ctx the parse tree
	 */
	void enterExpr_condicional(ExprParser.Expr_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr_condicional}.
	 * @param ctx the parse tree
	 */
	void exitExpr_condicional(ExprParser.Expr_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#while_cab}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cab(ExprParser.While_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#while_cab}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cab(ExprParser.While_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#while_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cuerpo(ExprParser.While_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#while_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cuerpo(ExprParser.While_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(ExprParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(ExprParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ExprParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ExprParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#for_cab}.
	 * @param ctx the parse tree
	 */
	void enterFor_cab(ExprParser.For_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#for_cab}.
	 * @param ctx the parse tree
	 */
	void exitFor_cab(ExprParser.For_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#for_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterFor_cuerpo(ExprParser.For_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#for_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitFor_cuerpo(ExprParser.For_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#if_funct}.
	 * @param ctx the parse tree
	 */
	void enterIf_funct(ExprParser.If_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#if_funct}.
	 * @param ctx the parse tree
	 */
	void exitIf_funct(ExprParser.If_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#if_cab}.
	 * @param ctx the parse tree
	 */
	void enterIf_cab(ExprParser.If_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#if_cab}.
	 * @param ctx the parse tree
	 */
	void exitIf_cab(ExprParser.If_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#if_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterIf_cuerpo(ExprParser.If_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#if_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitIf_cuerpo(ExprParser.If_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#function_cab}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cab(ExprParser.Function_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#function_cab}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cab(ExprParser.Function_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#function_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cuerpo(ExprParser.Function_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#function_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cuerpo(ExprParser.Function_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ExprParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ExprParser.FunctionContext ctx);
}