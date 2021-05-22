// Generated from .\AParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AParser}.
 */
public interface AParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(AParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(AParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#punto_coma}.
	 * @param ctx the parse tree
	 */
	void enterPunto_coma(AParser.Punto_comaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#punto_coma}.
	 * @param ctx the parse tree
	 */
	void exitPunto_coma(AParser.Punto_comaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_include}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_include(AParser.Palabra_reservada_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_include}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_include(AParser.Palabra_reservada_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#nombre_variable}.
	 * @param ctx the parse tree
	 */
	void enterNombre_variable(AParser.Nombre_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#nombre_variable}.
	 * @param ctx the parse tree
	 */
	void exitNombre_variable(AParser.Nombre_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#variable_numerica}.
	 * @param ctx the parse tree
	 */
	void enterVariable_numerica(AParser.Variable_numericaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#variable_numerica}.
	 * @param ctx the parse tree
	 */
	void exitVariable_numerica(AParser.Variable_numericaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#cadena_de_texto}.
	 * @param ctx the parse tree
	 */
	void enterCadena_de_texto(AParser.Cadena_de_textoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#cadena_de_texto}.
	 * @param ctx the parse tree
	 */
	void exitCadena_de_texto(AParser.Cadena_de_textoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#tipo_de_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_dato(AParser.Tipo_de_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#tipo_de_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_dato(AParser.Tipo_de_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_and}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_and(AParser.Palabra_reservada_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_and}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_and(AParser.Palabra_reservada_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_or}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_or(AParser.Palabra_reservada_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_or}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_or(AParser.Palabra_reservada_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_begin}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_begin(AParser.Palabra_reservada_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_begin}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_begin(AParser.Palabra_reservada_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_end}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_end(AParser.Palabra_reservada_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_end}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_end(AParser.Palabra_reservada_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_function}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_function(AParser.Palabra_reservada_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_function}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_function(AParser.Palabra_reservada_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_main}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_main(AParser.Palabra_reservada_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_main}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_main(AParser.Palabra_reservada_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_while}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_while(AParser.Palabra_reservada_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_while}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_while(AParser.Palabra_reservada_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_if}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_if(AParser.Palabra_reservada_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_if}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_if(AParser.Palabra_reservada_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_for}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_for(AParser.Palabra_reservada_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_for}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_for(AParser.Palabra_reservada_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(AParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(AParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(AParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(AParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#op_suma}.
	 * @param ctx the parse tree
	 */
	void enterOp_suma(AParser.Op_sumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#op_suma}.
	 * @param ctx the parse tree
	 */
	void exitOp_suma(AParser.Op_sumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#op_resta}.
	 * @param ctx the parse tree
	 */
	void enterOp_resta(AParser.Op_restaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#op_resta}.
	 * @param ctx the parse tree
	 */
	void exitOp_resta(AParser.Op_restaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#op_multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacion(AParser.Op_multiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#op_multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacion(AParser.Op_multiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#op_division}.
	 * @param ctx the parse tree
	 */
	void enterOp_division(AParser.Op_divisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#op_division}.
	 * @param ctx the parse tree
	 */
	void exitOp_division(AParser.Op_divisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_aritmetico(AParser.Operador_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#operador_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_aritmetico(AParser.Operador_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(AParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(AParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void enterNombre_funcion(AParser.Nombre_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void exitNombre_funcion(AParser.Nombre_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#llamada}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(AParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#llamada}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(AParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_asignar}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_asignar(AParser.Palabra_reservada_asignarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_asignar}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_asignar(AParser.Palabra_reservada_asignarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_void}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_void(AParser.Palabra_reservada_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_void}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_void(AParser.Palabra_reservada_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(AParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(AParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_cadena}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_cadena(AParser.Palabra_reservada_cadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_cadena}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_cadena(AParser.Palabra_reservada_cadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#palabra_reservada_numero}.
	 * @param ctx the parse tree
	 */
	void enterPalabra_reservada_numero(AParser.Palabra_reservada_numeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#palabra_reservada_numero}.
	 * @param ctx the parse tree
	 */
	void exitPalabra_reservada_numero(AParser.Palabra_reservada_numeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#tipo_de_variable}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_variable(AParser.Tipo_de_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#tipo_de_variable}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_variable(AParser.Tipo_de_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(AParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(AParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comparacion(AParser.Expr_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comparacion(AParser.Expr_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#expr_condicional}.
	 * @param ctx the parse tree
	 */
	void enterExpr_condicional(AParser.Expr_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#expr_condicional}.
	 * @param ctx the parse tree
	 */
	void exitExpr_condicional(AParser.Expr_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#while_cab}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cab(AParser.While_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#while_cab}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cab(AParser.While_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#while_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cuerpo(AParser.While_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#while_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cuerpo(AParser.While_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(AParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(AParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(AParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(AParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#for_cab}.
	 * @param ctx the parse tree
	 */
	void enterFor_cab(AParser.For_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#for_cab}.
	 * @param ctx the parse tree
	 */
	void exitFor_cab(AParser.For_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#for_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterFor_cuerpo(AParser.For_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#for_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitFor_cuerpo(AParser.For_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#if_funct}.
	 * @param ctx the parse tree
	 */
	void enterIf_funct(AParser.If_functContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#if_funct}.
	 * @param ctx the parse tree
	 */
	void exitIf_funct(AParser.If_functContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#if_cab}.
	 * @param ctx the parse tree
	 */
	void enterIf_cab(AParser.If_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#if_cab}.
	 * @param ctx the parse tree
	 */
	void exitIf_cab(AParser.If_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#if_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterIf_cuerpo(AParser.If_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#if_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitIf_cuerpo(AParser.If_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#function_cab}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cab(AParser.Function_cabContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#function_cab}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cab(AParser.Function_cabContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#function_cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterFunction_cuerpo(AParser.Function_cuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#function_cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitFunction_cuerpo(AParser.Function_cuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AParser.FunctionContext ctx);
}