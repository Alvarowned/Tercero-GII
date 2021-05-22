import java.io.PrintStream;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
public class Funcion {
    //Atributos
    Integer lineasCodigoEfectivas;
    Integer puntosFuncion;
    Integer complejidadCiclomatica;
    Integer parametrosCreacion;
    Integer numeroVariablesDeclaradas;
    Integer funcionesLlamadas;
    Integer numeroOperadores;
    //Metodos
    public Funcion(Integer lineas, Integer puntos, Integer comp, Integer para, Integer num, Integer func,Integer veces){
        this.lineasCodigoEfectivas=lineas;
        this.puntosFuncion=puntos;
        this.complejidadCiclomatica=comp;
        this.parametrosCreacion=para;
        this.numeroVariablesDeclaradas=num;
        this.funcionesLlamadas=func;
        this.numeroOperadores=veces;
    }
    public void imprimir(PrintStream ps){
        ps.print("<p> Lineas de codigo efectivas: " +lineasCodigoEfectivas +"</p>");
        ps.print("<p> Puntos de Función: " +puntosFuncion +"</p>");
        ps.print("<p> Complejidad Ciclomatica: " +complejidadCiclomatica +"</p>");
        ps.print("<p> Variables Declaradas: " +numeroVariablesDeclaradas +"</p>");
        ps.print("<p> Numero de Parametros Recibidos: " +parametrosCreacion +"</p>");
        ps.print("<p> Funciones llamadas: " +funcionesLlamadas +"</p>");
        ps.print("<p> Numero Operadores: " +numeroOperadores +"</p>");
        
        System.out.println("Lineas de codigo efectivas: "+lineasCodigoEfectivas);
        System.out.println("Puntos de Función: "+puntosFuncion);
        System.out.println("Complejidad Ciclomatica: "+complejidadCiclomatica);
        System.out.println("Variables Declaradas: "+numeroVariablesDeclaradas);
        //"Netos", una función recibida sigue siendo un sólo parámetro
        System.out.println("Numero de Parametros Recibidos: "+parametrosCreacion);
        System.out.println("Funciones llamadas: "+funcionesLlamadas);
        System.out.println("Numero Operadores: "+numeroOperadores);
    }
    public Integer getFuncionesLlamadas(){
        return this.lineasCodigoEfectivas;
    }
    public Integer getLineasCodigoEfectivas(){
        return this.lineasCodigoEfectivas;
    }
    public Integer getPuntosFuncion(){
        return this.puntosFuncion;
    }
    public Integer getComplejidadCiclomatica(){
        return this.complejidadCiclomatica;
    }
    public Integer getParametrosCreacion(){
        return this.parametrosCreacion;
    }
    public Integer getNumeroVariablesDeclaradas(){
        return this.numeroVariablesDeclaradas;
    }
    public void setLineasCodigoEfectivas(Integer lineas){
        this.lineasCodigoEfectivas=lineas;
    }
    public Integer getNumeroOperadores(){
        return this.numeroOperadores;
    }
    public void setNumeroOperadores(Integer op){
        this.numeroOperadores=op;
    }
    public void setFuncionesLlamadas(Integer numero){
        this.funcionesLlamadas=numero;
    }
    public void setPuntosFuncion(Integer puntos){
        this.puntosFuncion=puntos;
    }
    public void setComplejidadCiclomatica(Integer comp){
        this.complejidadCiclomatica=comp;
    }
    public void setParametrosCreacion(Integer numero){
        this.parametrosCreacion=numero;
    }
    public void setNumeroVariablesDeclaradas(Integer numero){
        this.numeroVariablesDeclaradas=numero;
    }
}