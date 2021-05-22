/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1.procleng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author alvar
 */
public class EstrucDeControl {
    private Integer estadoActual;
    private final EstructuraDeDatos edd;
    
    public EstrucDeControl(EstructuraDeDatos edd) {
        this.edd = edd;
        estadoActual = edd.getEstadoInicial();
    }
    
    public void pasoEstado(Character caracter) throws Exception {
        Integer estadoTmp = edd.getSigEstado(estadoActual, caracter);
        if(estadoTmp != null) estadoActual = estadoTmp;
        else throw new Exception("Caracter no valido.");
    }
    
    public boolean esFinal() {
        return edd.esFinal(estadoActual);
    }
    
    public boolean compruebaCadena(String cadena) {
        int i = 0, flag = 0;
        estadoActual = edd.getEstadoInicial();
        while(i < cadena.length() && flag == 0) {        // Uso el flag para detener la comprobación si hay un carácter no válido.
            Character carTemp = cadena.charAt(i);
            i++;
            try {
                this.pasoEstado(carTemp);
            } catch(Exception exception){
                System.out.println(exception);
                flag = 1;
            }
        }
        
        if(flag == 1) return false;
        return this.esFinal();
    }
    
    public ArrayList<String> generarCadenas(int cantidad,int longitud){
        estadoActual = edd.getEstadoInicial();
        ArrayList<String> listaPalabras = new ArrayList<>();
        return generarCadenasR(edd.getAlfabeto(), listaPalabras, "", estadoActual, cantidad, longitud);
    }
    
    public boolean compNextEstado(char caracter, int estadoActual){
        Integer estadoTemp = edd.getSigEstado(estadoActual, caracter);
        return estadoTemp > -1;
    }

    public ArrayList generarCadenasR(List<Character> alfabeto, ArrayList<String> listaPalabras, String palabra, int estadoActual, int cant, int longit) {
        int i = 0;
        
        while(i < alfabeto.size() && listaPalabras.size() < cant){
            if(this.compNextEstado(alfabeto.get(i), estadoActual) && !edd.esFinal(estadoActual)){
                if (palabra.length() < longit){
                    String palabraTmp = palabra + alfabeto.get(i);
                    Integer estadoTemp = edd.getSigEstado(estadoActual, alfabeto.get(i));
                    listaPalabras = generarCadenasR(alfabeto, listaPalabras, palabraTmp, estadoTemp, cant, longit);
                }
            } else if(this.compNextEstado(alfabeto.get(i), estadoActual) && edd.esFinal(estadoActual)){
                if(palabra.length() < longit){
                    if(!listaPalabras.contains(palabra)){
                        listaPalabras.add(palabra);
                    }
                    String palabraTemp = palabra + alfabeto.get(i);
                    Integer estadoTemp = edd.getSigEstado(estadoActual, alfabeto.get(i));
                    listaPalabras = generarCadenasR(alfabeto, listaPalabras, palabraTemp, estadoTemp, cant, longit);
                }
            } else if(!this.compNextEstado(alfabeto.get(i), estadoActual) && edd.esFinal(estadoActual)){
                if(!listaPalabras.contains(palabra)){
                    listaPalabras.add(palabra);
                }
            }
            i++;
        }
        return listaPalabras;
    }
}
