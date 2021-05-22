import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.lang.Math;
public class EjecucionListener extends gramFibParserBaseListener {

    int contadorFunciones = 0;
    int multiplicadorPuntuacion=0;
    int contadorLlamada = 0;
    int counterParentesisIzquierdo = 0;
    int counterParentesisDerecho = 0;
    int contadorPF=0;
    Stack pilaLlamadas = new Stack();
    Stack pilaFunciones = new Stack();
    ArrayList<String> arrayList = new ArrayList<>();
    String func = "";
    TablaSimbolosProg tabla;
    String funcionAnalizada = "";
    String funcionLlamada = "";
    boolean dentroLlamada = false;
    boolean dentroWhile = false;
    boolean dentroCondicional = false;
    boolean dentroCabecera = false;
    boolean dentroCuerpo = false;
    boolean dentroParametro = false;

    public EjecucionListener(TablaSimbolosProg t, PrintStream ps) {
        this.tabla = t;
    }
    //El número de sentencias efectivas es el de todas aquellas operaciones que pueden deshacerse en otras más sencillas
    //Por tanto, por cada operador, asignación, return (Elses y Whiles los dejo fuera no?) Sumo 1
    @Override
    public void enterCabecera(gramFibParser.CabeceraContext ctx) {
        dentroCabecera = true;
    }
    //El grafo es tu puto problema
    @Override
    public void enterInterior(gramFibParser.InteriorContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setComplejidadCiclomatica(funcion.getComplejidadCiclomatica() + 1);
    }

    @Override
    public void exitCabecera(gramFibParser.CabeceraContext ctx) {
    }

    @Override
    public void enterCuerpo(gramFibParser.CuerpoContext ctx) {
        dentroCuerpo = true;
    }
    //ELDELPUTOWHILEEEEEEEEMECAGOENVUESTRAVIEJAAAAAAAA
    @Override
    public void exitCuerpo(gramFibParser.CuerpoContext ctx) {
        
    }
    @Override
    public void enterCuerpoFunc(gramFibParser.CuerpoFuncContext ctx) {
        dentroCuerpo = true;
    }
    @Override
    public void exitCuerpoFunc(gramFibParser.CuerpoFuncContext ctx) {
        dentroCuerpo = false;
        funcionAnalizada = "";
        contadorFunciones = 0;
    }

    @Override
    public void enterLlamar_funcion(gramFibParser.Llamar_funcionContext ctx) {
        dentroLlamada = true;
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setFuncionesLlamadas(funcion.getFuncionesLlamadas()+1);
        if(multiplicadorPuntuacion==0){
            funcion.setPuntosFuncion(funcion.getPuntosFuncion() + 2);
        }
        else{
            contadorPF=contadorPF+2;
        }
    }

    @Override
    public void exitLlamar_funcion(gramFibParser.Llamar_funcionContext ctx) {
        dentroLlamada = false;
        funcionLlamada = "";
        contadorLlamada = 0;
    }

    @Override
    public void enterExpr(gramFibParser.ExprContext ctx) {
    }

    @Override
    public void exitExpr(gramFibParser.ExprContext ctx) {
    }

    @Override
    public void enterBegin(gramFibParser.BeginContext ctx) {
        // Imprimo la cabecera de la función en cuanto encuentro un begin
        // Ejemplo de como pollas se imprime una regla
        if (dentroCabecera) {
            //System.out.println("La función donde estoy: " + funcionAnalizada);
            pilaFunciones.push(func);
            counterParentesisDerecho = 0;
            counterParentesisIzquierdo = 0;
            String auxiliar = "";
            auxiliar = auxiliar + pilaFunciones.peek();
           //System.out.println(auxiliar);
        }
    }

    @Override
    public void exitBegin(gramFibParser.BeginContext ctx) {
        // La cabecera termina cuando lees un Begin
        // Y lo imprimes
        dentroCabecera = false;
        func = "";
    }

    @Override
    public void enterEnd(gramFibParser.EndContext ctx) {
    }

    @Override
    public void exitEnd(gramFibParser.EndContext ctx) {
    }

    @Override
    public void enterParametroLlamada(gramFibParser.ParametroLlamadaContext ctx) {
        dentroParametro=true;
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcionPadre = (Funcion) funciones.get(funcionAnalizada);
        // Asumimos que un parámetro puede ser una función también
        funcionPadre.setPuntosFuncion(funcionPadre.getPuntosFuncion() + 1);
        funcionPadre.setLineasCodigoEfectivas(funcionPadre.getLineasCodigoEfectivas() + 1);
    }

    @Override
    public void exitParametroLlamada(gramFibParser.ParametroLlamadaContext ctx) {
        dentroParametro=false;
    }

    // Falta controlar el aumento y disminución de multiplicadorPuntuacion cuando entre y salga de un for
    // En todo lo que pueda lo que pueda estar dentro del cuerpo del while o el if
    // Si multpunt>1, me lo guardo en el contador elevado al exponente que sea
    /* Sería algo rollo
    if(multiplicadorPuntuacion){
        en vez de subirlo al padre guardarlo en el contador
    }
    else{
        lo que ya tenemos hasta ahora de guardarlo en el padre
    }
     */
    @Override public void enterB_while(gramFibParser.B_whileContext ctx) { 
        multiplicadorPuntuacion++;
        if(multiplicadorPuntuacion>1){
            HashMap funciones = tabla.getHashMapFunciones();
            Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
            funcion.setPuntosFuncion(funcion.getPuntosFuncion() + (int) Math.pow(contadorPF, multiplicadorPuntuacion));
        }
    }

    @Override public void exitB_while(gramFibParser.B_whileContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setPuntosFuncion(funcion.getPuntosFuncion() + (int) Math.pow(contadorPF, multiplicadorPuntuacion));
        //System.out.println("PF: "+funcion.getPuntosFuncion());
        
        multiplicadorPuntuacion--;
    }

    @Override public void enterIfi(gramFibParser.IfiContext ctx) { 
        multiplicadorPuntuacion++;
        if(multiplicadorPuntuacion>1){
            HashMap funciones = tabla.getHashMapFunciones();
            Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
            funcion.setPuntosFuncion(funcion.getPuntosFuncion() + (int) Math.pow(contadorPF, multiplicadorPuntuacion));
        }
    }

    @Override public void exitIfi(gramFibParser.IfiContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setPuntosFuncion(funcion.getPuntosFuncion() + (int) Math.pow(contadorPF, multiplicadorPuntuacion));
        multiplicadorPuntuacion--;
    }

    @Override
    public void enterOperaciones(gramFibParser.OperacionesContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setNumeroOperadores(funcion.getNumeroOperadores() + 1);
        funcion.setPuntosFuncion(funcion.getPuntosFuncion() + 1);
        funcion.setLineasCodigoEfectivas(funcion.getLineasCodigoEfectivas()+1);
    }

    @Override
    public void enterDeclaracion(gramFibParser.DeclaracionContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setNumeroVariablesDeclaradas(funcion.getNumeroVariablesDeclaradas() + 1);
        funcion.setPuntosFuncion(funcion.getPuntosFuncion() + 1);
        funcion.setLineasCodigoEfectivas(funcion.getLineasCodigoEfectivas()+1);
    }
    @Override
    public void enterAsignacion(gramFibParser.AsignacionContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setNumeroVariablesDeclaradas(funcion.getNumeroVariablesDeclaradas() + 1);
        funcion.setPuntosFuncion(funcion.getPuntosFuncion() + 1);
        funcion.setLineasCodigoEfectivas(funcion.getLineasCodigoEfectivas()+1);
    }
    @Override
    public void exitAsignacion(gramFibParser.AsignacionContext ctx) {
    }
    @Override
    public void exitDeclaracion(gramFibParser.DeclaracionContext ctx) {
    }

    @Override
    public void enterParametroCreacion(gramFibParser.ParametroCreacionContext ctx) {
        HashMap funciones = tabla.getHashMapFunciones();
        Funcion funcion = (Funcion) funciones.get(funcionAnalizada);
        funcion.setParametrosCreacion(funcion.getParametrosCreacion() + 1);
        funcion.setPuntosFuncion(funcion.getPuntosFuncion() + 2);
    }

    @Override
    public void exitParametroCreacion(gramFibParser.ParametroCreacionContext ctx) {
    }

    @Override
    public void enterParentesis_izquierdo(gramFibParser.Parentesis_izquierdoContext ctx) {

        if (dentroLlamada) {
            counterParentesisIzquierdo++;
        }

    }

    @Override
    public void exitParentesis_izquierdo(gramFibParser.Parentesis_izquierdoContext ctx) {

    }

    @Override
    public void enterParentesis_derecho(gramFibParser.Parentesis_derechoContext ctx) {
        if (dentroLlamada) {
            counterParentesisDerecho++;
        }

    }

    @Override
    public void exitParentesis_derecho(gramFibParser.Parentesis_derechoContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // Llamadas
        if (dentroLlamada) {
            String auxiliar = node.getSymbol().getText();
            contadorLlamada++;
            if (!auxiliar.equals(";")) {
                func += node.getSymbol().getText();
                    // A priori te da igual de qué funciones sean los parámetros, si no
                    // Metemos un ArrayList de declaraciones y otro de Llamadas y pa dentro en la
                    // llamada
            }

            if (dentroLlamada && counterParentesisDerecho >= 1 && counterParentesisIzquierdo >= 1) {
                if (counterParentesisIzquierdo == counterParentesisDerecho) {

                }
                pilaLlamadas.push(func);
                //System.out.println(func);
                func = "";
                counterParentesisDerecho = 0;
                counterParentesisIzquierdo = 0;
                auxiliar = "";
            }
        }
        // Imprimo en la cabecera hasta que encuentro un tipo
        else if (dentroCabecera) {
            String auxiliar = node.getSymbol().getText();
            contadorFunciones++;
            if (!auxiliar.equals("numero") || !auxiliar.equals("cadena") || !auxiliar.equals("void")) {
                func += node.getSymbol().getText();
                if (contadorFunciones == 2) {
                    funcionAnalizada = node.getSymbol().getText();
                    HashMap funciones = tabla.getHashMapFunciones();
                    Funcion funcion = new Funcion(0, 0, 0, 0, 0, 0, 0);
                    funciones.put(funcionAnalizada, funcion);
                }
            }
            auxiliar = "";
        }

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    // Constructor para pasar la tabla por parámetro

    /*
     * public EjecucionListener(TablaSimbolosProg t){ this.tabla=t; }
     * 
     * @Override public void enterFunction(ParserRuleContext ctx){ String
     * nombre=gramaticaParser.ruleNames[ctx.getRuleIndex()].toString(); HashMap
     * funciones=tablaSimbolos.getHashMapFunciones(); Funcion funcion= new
     * Funcion(0,0,0,0,0,0,0); funciones.put(nombre,funcion); } //Aquí viene el
     * fregao del resto de funciones //He puesto los nombres que creo que
     * corresponden en la gramática /*
     * 
     * @Override public void enterBeg_end(ParserRuleContext ctx){
     * 
     * }
     * 
     * @Override public void enterFunctions(ParserRuleContext ctx){ //Entiendo que
     * esto es el cuerpo ParserRuleContext funcionPadre=ctx.getParent(); String
     * nombrePadre=gramaticaParser.ruleNames[funcionPadre.getRuleIndex()].toString()
     * ; funcionAnalizada=nombrePadre; //nos guardamos la función original, si es
     * todo en uno el nombre de tu ctx //Texto íntegro de la regla int a =
     * ctx.start.getStartIndex(); int b = ctx.stop.getStopIndex(); Interval interval
     * = new Interval(a,b); String
     * codigo=ctx.start.getInputStream().getText(interval); //Aquí puedo cogerlos
     * directamente porque se definen tipos y sólo cuento número params String
     * substring=codigo.substring(codigo.indexOf("(")+1,codigo.lastIndexOf(")")-1);
     * String parametros[]=substring.split(","); int numeroParam=0; for(int
     * i=0;i<parametros.length;i++){ numeroParam=i; } Funcion funcion=
     * tablaSimbolos.getHashMapFunciones().get(nombrePadre);
     * funcion.setParametrosRecibidos(numeroParam);
     * funcion.setPuntosFuncion(funcion.getPuntosFuncion()+numeroParam); }
     * 
     * @Override public void enterLlamada_funcion(ParserRuleContext ctx){
     * parametros=true; String
     * nombre=gramaticaParser.ruleNames[ctx.getRuleIndex()].toString(); String
     * nombrePadre=gramaticaParser.ruleNames[funcionPadre.getRuleIndex()].toString()
     * ; pilaLlamadas.push(gramaticaParser.ruleNames[ctx.getRuleIndex()]); //Qué
     * leches haces con la pilaLlamadas //Aquí además tendrás que cogerte el nombre
     * de la propia y sumar al nº veces que se la llama Funcion funcion=
     * tablaSimbolos.getHashMapFunciones().get(nombrePadre);
     * funcion.setFuncionesLlamadas(funcion.getFuncionesLlamadas()+1); } public void
     * enterParametro(ParserRuleContext ctx){ //Este es un parametro de la cabecera
     * o del cuerpo? como diferenciamos? if(estamosDentro o el padre de mi padre que
     * será la funcion que me llama es el nombre){ String
     * nombre=gramaticaParser.ruleNames[ctx.getRuleIndex()].toString();
     * pilaLlamadas.push(gramaticaParser.ruleNames[ctx.getRuleIndex()]); //Ahora
     * hacemos aquí cosas con la tabla de simbolos cogiendo la función llamada}
     * else{wtf} //Si es parámetro de llamada tienes que contar los param para
     * puntos función ergo //Meter el bucle, llegar al padre, cogerle y setearle a
     * un +1 el número de parametros //Si es llamadafunción imagino que ya lo cogerá
     * tu gramatica y solo hacer falta setear un 2 ParseTreeContext
     * aux=ctx.getParent();
     * while(gramaticaParser.ruleNames[funcionPadre.getRuleIndex()].toString()
     * !=funcionAnalizada){ aux=aux.getParent(); } Funcion funcion=
     * tablaSimbolos.getHashMapFunciones().get(gramaticaParser.ruleNames[
     * funcionPadre.getRuleIndex()].toString());
     * funcion.setFuncionesLlamadas(funcion.getFuncionesLlamadas()+1);
     * funcion.setPuntosFuncion(funcion.getPuntosFuncion()+1); //o 2 si el name es
     * llamada } public void exitLlamadaFuncion(ParserRuleContext ctx){ //sabemos
     * que ahora estamos fuera funcionLlamada=""; parametros=false; }
     * 
     * @Override public void enterEveryRule(ParserRuleContext ctx) {
     * 
     * String aux=gramFibParser.ruleNames[ctx.getRuleIndex()].toString(); if(aux ==
     * "parametro"){ System.out.println("Eres Una lechuga"); }
     * 
     * arrayList.add(gramFibParser.ruleNames[ctx.getRuleIndex()]);
     * 
     * func = ""; for(int i = 0; i < arrayList.size();i++) {
     * 
     * func = func.concat("/").concat(arrayList.get(i)); //concatenacion constante
     * del estado actual y el proximo -> /prog // -> /prog/include....
     * 
     * } System.out.println(func); }
     * 
     * @Override public void exitEveryRule(ParserRuleContext ctx) {
     * arrayList.remove(arrayList.size()-1); // Removemos el ultimo estado que ha
     * entrado en la pilaLlamadas. func = ""; for(int i = 0;
     * i<arrayList.size()-1;i++) { func = func.concat("/").concat(arrayList.get(i));
     * }
     * 
     * }
     * 
     * @Override public void visitTerminal(TerminalNode node) { func += " : " +
     * node.getSymbol().getText(); System.out.println(func); }
     * 
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
