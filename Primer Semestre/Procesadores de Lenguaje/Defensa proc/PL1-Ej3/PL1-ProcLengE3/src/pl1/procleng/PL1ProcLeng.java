/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl1.procleng;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class PL1ProcLeng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salida = 0;
        EstructuraDeDatos edd = new EstructuraDeDatos();
        EstrucDeControl edc = new EstrucDeControl(edd);
        Scanner sc = new Scanner(System.in);
        
        while(salida == 0) {
            System.out.println("1 - Comprobar cadena. ");
            System.out.println("2 - Generar cadenas. ");
            System.out.println("3 - Salir del programa. ");
            System.out.print("Elija su opcion: ");
            int num = sc.nextInt();
        
            switch (num) {
                case 1:
                    System.out.print("Introduzca la cadena a comprobar: ");
                    String cad = sc.next();
                    if(edc.compruebaCadena(cad)) System.out.println("La cadena es válida.");
                    else System.out.println("La cadena no es válida.");
                    break;
                case 2:
                    System.out.print("Introduzca el numero de palabras válidas a crear: ");
                    int cant = sc.nextInt();
                    System.out.print("Introduzca la longitud de las palabras a crear: ");
                    int longitud = sc.nextInt();
                    List<String> palabras = edc.generarCadenas(cant, longitud);
                    for(int i = 1; i <= palabras.size(); i++) System.out.println(i + " - " + palabras.get(i-1));
                    break;
                case 3:
                    salida = 1;
                    break;
                default:
                    System.out.println("Entrada no valida.");
                    break;
            }
        }
    }
    
}
