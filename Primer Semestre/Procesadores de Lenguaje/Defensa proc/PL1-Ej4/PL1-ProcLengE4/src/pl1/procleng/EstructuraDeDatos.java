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
        alfabeto.add('c');
        alfabeto.add('m');
        alfabeto.add('n');
        alfabeto.add('o');
        alfabeto.add('p');
        alfabeto.add('q');
    }
    
    public void cargarEstados() { 
        for(int i = 0; i < 17; i++) estados.add(i);
    }
    
    public void setEstadoInicial() {
        estadoInicial = 0;
    }
    
    public void setEstadosFinales() {
        estadosFinales.add(5);
        estadosFinales.add(6);
        estadosFinales.add(7);
        estadosFinales.add(8);
        estadosFinales.add(9);
        estadosFinales.add(12);
        estadosFinales.add(13);
        estadosFinales.add(14);
        estadosFinales.add(15);
        estadosFinales.add(16);
    }
    
    public void inicializarMatriz() {
        for(int i = 0; i < 17; i++) matriz.put(i, new HashMap<>());
        this.cargarMatriz();
    }
    
    public void cargarMatriz() {
        matriz.get(0).put('a', 1);
        matriz.get(1).put('a', 3);
        matriz.get(1).put('b', 2);
        matriz.get(2).put('c', 4);
        matriz.get(2).put('m', 9);
        matriz.get(2).put('n', 8);
        matriz.get(2).put('o', 7);
        matriz.get(2).put('p', 6);
        matriz.get(2).put('q', 5);
        matriz.get(3).put('a', 3);
        matriz.get(3).put('b', 2);
        matriz.get(4).put('c', 4);
        matriz.get(4).put('m', 9);
        matriz.get(4).put('n', 8);
        matriz.get(4).put('o', 7);
        matriz.get(4).put('p', 6);
        matriz.get(4).put('q', 5);
        matriz.get(5).put('b', 10);
        matriz.get(6).put('b', 10);
        matriz.get(7).put('b', 10);
        matriz.get(8).put('b', 10);
        matriz.get(9).put('b', 10);
        matriz.get(10).put('c', 11);
        matriz.get(10).put('m', 16);
        matriz.get(10).put('n', 15);
        matriz.get(10).put('o', 14);
        matriz.get(10).put('p', 13);
        matriz.get(10).put('q', 12);
        matriz.get(11).put('c', 11);
        matriz.get(11).put('m', 16);
        matriz.get(11).put('n', 15);
        matriz.get(11).put('o', 14);
        matriz.get(11).put('p', 13);
        matriz.get(11).put('q', 12);
        matriz.get(12).put('b', 10);
        matriz.get(13).put('b', 10);
        matriz.get(14).put('b', 10);
        matriz.get(15).put('b', 10);
        matriz.get(16).put('b', 10);
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
