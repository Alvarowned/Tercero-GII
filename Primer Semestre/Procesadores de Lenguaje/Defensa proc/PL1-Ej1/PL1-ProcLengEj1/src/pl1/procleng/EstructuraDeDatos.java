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
public class EstructuraDeDatos {
    private List<Character> alfabeto = new ArrayList<>();
    private List<Integer> estados = new ArrayList<>();
    private Integer estadoInicial;
    private List<Integer> estadosFinales = new ArrayList<>();
    private HashMap<Integer, HashMap<Character, Integer>> matriz = new HashMap<>();

    public EstructuraDeDatos() {
        this.cargarAlfabeto();
        this.cargarEstados();
        this.setEstadoInicial();
        this.setEstadosFinales();
        this.inicializarMatriz();
    }
    
    public void cargarAlfabeto() { 
        alfabeto.add('a');
        alfabeto.add('b');
        alfabeto.add('d');
    }
    
    public void cargarEstados() { 
        for(int i = 0; i < 5; i++) estados.add(i);
    }
    
    public void setEstadoInicial() {
        estadoInicial = 0;
    }
    
    public void setEstadosFinales() {
        estadosFinales.add(3);
        estadosFinales.add(4);
    }
    
    public void inicializarMatriz() {
        for(int i = 0; i < 5; i++) matriz.put(i, new HashMap<>());
        this.cargarMatriz();
    }
    
    public void cargarMatriz() {
        matriz.get(0).put('a', 1);
        matriz.get(1).put('b', 2);
        matriz.get(2).put('b', 4);
        matriz.get(2).put('d', 3);
    }
    
    public Integer getSigEstado(Integer estado, Character caracter) {
        if(matriz.get(estado).get(caracter) != null) return matriz.get(estado).get(caracter);
        else return -1;
    }
    
    public boolean esFinal(Integer estado) {
        return estadosFinales.contains(estado);
    }
    
    public Integer getEstadoInicial() {
        return estadoInicial;
    }
    
    public HashMap<Integer, HashMap<Character, Integer>> getMatriz() {
        return matriz;
    }
    
    public List<Character> getAlfabeto() {
        return alfabeto;
    }
}
