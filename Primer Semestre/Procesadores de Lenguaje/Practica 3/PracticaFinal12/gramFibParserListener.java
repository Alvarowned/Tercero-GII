// Generated from gramFibParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramFibParser}.
 */
public interface gramFibParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramFibParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gramFibParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gramFibParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#includ}.
	 * @param ctx the parse tree
	 */
	void enterInclud(gramFibParser.IncludContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#includ}.
	 * @param ctx the parse tree
	 */
	void exitInclud(gramFibParser.IncludContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(gramFibParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(gramFibParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(gramFibParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(gramFibParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cuerpoFunc}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoFunc(gramFibParser.CuerpoFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cuerpoFunc}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoFunc(gramFibParser.CuerpoFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(gramFibParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(gramFibParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#interior}.
	 * @param ctx the parse tree
	 */
	void enterInterior(gramFibParser.InteriorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#interior}.
	 * @param ctx the parse tree
	 */
	void exitInterior(gramFibParser.InteriorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#b_while}.
	 * @param ctx the parse tree
	 */
	void enterB_while(gramFibParser.B_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#b_while}.
	 * @param ctx the parse tree
	 */
	void exitB_while(gramFibParser.B_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_variable(gramFibParser.Declaracion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#declaracion_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_variable(gramFibParser.Declaracion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(gramFibParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(gramFibParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gramFibParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gramFibParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cabecera_switch}.
	 * @param ctx the parse tree
	 */
	void enterCabecera_switch(gramFibParser.Cabecera_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cabecera_switch}.
	 * @param ctx the parse tree
	 */
	void exitCabecera_switch(gramFibParser.Cabecera_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cuerpo_switch}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo_switch(gramFibParser.Cuerpo_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cuerpo_switch}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo_switch(gramFibParser.Cuerpo_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#return_fun}.
	 * @param ctx the parse tree
	 */
	void enterReturn_fun(gramFibParser.Return_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#return_fun}.
	 * @param ctx the parse tree
	 */
	void exitReturn_fun(gramFibParser.Return_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(gramFibParser.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(gramFibParser.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(gramFibParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(gramFibParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cuerpoIf}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoIf(gramFibParser.CuerpoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cuerpoIf}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoIf(gramFibParser.CuerpoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(gramFibParser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(gramFibParser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterExpr_comparacion(gramFibParser.Expr_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#expr_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitExpr_comparacion(gramFibParser.Expr_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#expr_condicional}.
	 * @param ctx the parse tree
	 */
	void enterExpr_condicional(gramFibParser.Expr_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#expr_condicional}.
	 * @param ctx the parse tree
	 */
	void exitExpr_condicional(gramFibParser.Expr_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#declaracion_array}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_array(gramFibParser.Declaracion_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#declaracion_array}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_array(gramFibParser.Declaracion_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#op_array}.
	 * @param ctx the parse tree
	 */
	void enterOp_array(gramFibParser.Op_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#op_array}.
	 * @param ctx the parse tree
	 */
	void exitOp_array(gramFibParser.Op_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#b_for}.
	 * @param ctx the parse tree
	 */
	void enterB_for(gramFibParser.B_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#b_for}.
	 * @param ctx the parse tree
	 */
	void exitB_for(gramFibParser.B_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(gramFibParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(gramFibParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void enterNombre_funcion(gramFibParser.Nombre_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#nombre_funcion}.
	 * @param ctx the parse tree
	 */
	void exitNombre_funcion(gramFibParser.Nombre_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(gramFibParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(gramFibParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#parametroLlamada}.
	 * @param ctx the parse tree
	 */
	void enterParametroLlamada(gramFibParser.ParametroLlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#parametroLlamada}.
	 * @param ctx the parse tree
	 */
	void exitParametroLlamada(gramFibParser.ParametroLlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#parametroCreacion}.
	 * @param ctx the parse tree
	 */
	void enterParametroCreacion(gramFibParser.ParametroCreacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#parametroCreacion}.
	 * @param ctx the parse tree
	 */
	void exitParametroCreacion(gramFibParser.ParametroCreacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadas}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadas(gramFibParser.P_reservadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadas}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadas(gramFibParser.P_reservadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaWhile}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaWhile(gramFibParser.P_reservadaWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaWhile}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaWhile(gramFibParser.P_reservadaWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaFor}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaFor(gramFibParser.P_reservadaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaFor}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaFor(gramFibParser.P_reservadaForContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaFuncion(gramFibParser.P_reservadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaFuncion(gramFibParser.P_reservadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(gramFibParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(gramFibParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(gramFibParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(gramFibParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#pr_switch}.
	 * @param ctx the parse tree
	 */
	void enterPr_switch(gramFibParser.Pr_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#pr_switch}.
	 * @param ctx the parse tree
	 */
	void exitPr_switch(gramFibParser.Pr_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#pr_endswitch}.
	 * @param ctx the parse tree
	 */
	void enterPr_endswitch(gramFibParser.Pr_endswitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#pr_endswitch}.
	 * @param ctx the parse tree
	 */
	void exitPr_endswitch(gramFibParser.Pr_endswitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#pr_breack}.
	 * @param ctx the parse tree
	 */
	void enterPr_breack(gramFibParser.Pr_breackContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#pr_breack}.
	 * @param ctx the parse tree
	 */
	void exitPr_breack(gramFibParser.Pr_breackContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#ifi}.
	 * @param ctx the parse tree
	 */
	void enterIfi(gramFibParser.IfiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#ifi}.
	 * @param ctx the parse tree
	 */
	void exitIfi(gramFibParser.IfiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#elsei}.
	 * @param ctx the parse tree
	 */
	void enterElsei(gramFibParser.ElseiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#elsei}.
	 * @param ctx the parse tree
	 */
	void exitElsei(gramFibParser.ElseiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(gramFibParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(gramFibParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#endifi}.
	 * @param ctx the parse tree
	 */
	void enterEndifi(gramFibParser.EndifiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#endifi}.
	 * @param ctx the parse tree
	 */
	void exitEndifi(gramFibParser.EndifiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaAnd}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaAnd(gramFibParser.P_reservadaAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaAnd}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaAnd(gramFibParser.P_reservadaAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaOr}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaOr(gramFibParser.P_reservadaOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaOr}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaOr(gramFibParser.P_reservadaOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(gramFibParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(gramFibParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(gramFibParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(gramFibParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaFrom}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaFrom(gramFibParser.P_reservadaFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaFrom}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaFrom(gramFibParser.P_reservadaFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaStep}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaStep(gramFibParser.P_reservadaStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaStep}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaStep(gramFibParser.P_reservadaStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaTO}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaTO(gramFibParser.P_reservadaTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaTO}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaTO(gramFibParser.P_reservadaTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#p_reservadaDO}.
	 * @param ctx the parse tree
	 */
	void enterP_reservadaDO(gramFibParser.P_reservadaDOContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#p_reservadaDO}.
	 * @param ctx the parse tree
	 */
	void exitP_reservadaDO(gramFibParser.P_reservadaDOContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#cadenachar}.
	 * @param ctx the parse tree
	 */
	void enterCadenachar(gramFibParser.CadenacharContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#cadenachar}.
	 * @param ctx the parse tree
	 */
	void exitCadenachar(gramFibParser.CadenacharContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(gramFibParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(gramFibParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramFibParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramFibParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#n_libreria}.
	 * @param ctx the parse tree
	 */
	void enterN_libreria(gramFibParser.N_libreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#n_libreria}.
	 * @param ctx the parse tree
	 */
	void exitN_libreria(gramFibParser.N_libreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(gramFibParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(gramFibParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#n_funcion}.
	 * @param ctx the parse tree
	 */
	void enterN_funcion(gramFibParser.N_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#n_funcion}.
	 * @param ctx the parse tree
	 */
	void exitN_funcion(gramFibParser.N_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(gramFibParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(gramFibParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#opAsig}.
	 * @param ctx the parse tree
	 */
	void enterOpAsig(gramFibParser.OpAsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#opAsig}.
	 * @param ctx the parse tree
	 */
	void exitOpAsig(gramFibParser.OpAsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#coma}.
	 * @param ctx the parse tree
	 */
	void enterComa(gramFibParser.ComaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#coma}.
	 * @param ctx the parse tree
	 */
	void exitComa(gramFibParser.ComaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#d_puntos}.
	 * @param ctx the parse tree
	 */
	void enterD_puntos(gramFibParser.D_puntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#d_puntos}.
	 * @param ctx the parse tree
	 */
	void exitD_puntos(gramFibParser.D_puntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#end_line}.
	 * @param ctx the parse tree
	 */
	void enterEnd_line(gramFibParser.End_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#end_line}.
	 * @param ctx the parse tree
	 */
	void exitEnd_line(gramFibParser.End_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#parentesis_izquierdo}.
	 * @param ctx the parse tree
	 */
	void enterParentesis_izquierdo(gramFibParser.Parentesis_izquierdoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#parentesis_izquierdo}.
	 * @param ctx the parse tree
	 */
	void exitParentesis_izquierdo(gramFibParser.Parentesis_izquierdoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#parentesis_derecho}.
	 * @param ctx the parse tree
	 */
	void enterParentesis_derecho(gramFibParser.Parentesis_derechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#parentesis_derecho}.
	 * @param ctx the parse tree
	 */
	void exitParentesis_derecho(gramFibParser.Parentesis_derechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#corchete_izquierdo}.
	 * @param ctx the parse tree
	 */
	void enterCorchete_izquierdo(gramFibParser.Corchete_izquierdoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#corchete_izquierdo}.
	 * @param ctx the parse tree
	 */
	void exitCorchete_izquierdo(gramFibParser.Corchete_izquierdoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#corchete_derecho}.
	 * @param ctx the parse tree
	 */
	void enterCorchete_derecho(gramFibParser.Corchete_derechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#corchete_derecho}.
	 * @param ctx the parse tree
	 */
	void exitCorchete_derecho(gramFibParser.Corchete_derechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(gramFibParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(gramFibParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(gramFibParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(gramFibParser.NewlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#puntos}.
	 * @param ctx the parse tree
	 */
	void enterPuntos(gramFibParser.PuntosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#puntos}.
	 * @param ctx the parse tree
	 */
	void exitPuntos(gramFibParser.PuntosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramFibParser#coments}.
	 * @param ctx the parse tree
	 */
	void enterComents(gramFibParser.ComentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramFibParser#coments}.
	 * @param ctx the parse tree
	 */
	void exitComents(gramFibParser.ComentsContext ctx);
}