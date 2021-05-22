import java.util.*;
public class Llamada {
    //Atributos
    Integer numeroParametros;
    //Getters y Setters
    public Llamada(Integer numeroParam){
        this.numeroParametros=numeroParam;
    }
    public Integer getNumeroParametros(){
        return this.numeroParametros;
    }
    public void setNumeroParametros(Integer numero){
        this.numeroParametros=numero;
    }
    public void imprimir(){
        System.out.println("Número de parámetros: "+numeroParametros);
    }
}