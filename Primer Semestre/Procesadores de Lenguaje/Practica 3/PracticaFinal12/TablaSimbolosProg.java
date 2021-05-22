import java.util.*;
import java.lang.StringBuffer;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;

public class TablaSimbolosProg {

    //Colección Hashmaps<String, Objeto>, ej: Hashmap <String, funcion> funciones
    // Tabla Símbolos
    private HashMap<String, Funcion> funciones;
    private HashMap<String, Llamada> llamadas;
    private HashMap<String, Identificador> variables;
    //Salida del Html (No es necesaria interacción con usuario)
    File file;
    FileOutputStream fos;
    PrintStream ps;
    public TablaSimbolosProg(){
        try{
            this.file= new File("resumen.html");
            this.fos = new FileOutputStream(file);
            this.ps = new PrintStream(fos);
        }
        catch(Exception e){

        }
        this.funciones = new HashMap<String, Funcion>();
        this.llamadas = new HashMap<String, Llamada>();
        this.variables  = new HashMap<String, Identificador>();
    }
    public Object obtenerProp(String nombre,HashMap mapa){
        return mapa.get(nombre);
    }
    public void borrar(String nombre, HashMap mapa){
        mapa.remove(nombre);
    }
    public HashMap<String, Funcion> getHashMapFunciones(){
        return funciones;
    }
    public HashMap<String, Llamada> getHashMapLlamadas(){
        return llamadas;
    }
    public HashMap<String, Identificador> getHashMapIdentificadores(){
        return variables;
    }
    public void imprimir(){
        
        //Esto es el esqueleto y lo de arriba lo del imprimir
        ps.print("<html>");
        ps.print(" <head><title>Fichero Resumen</title>");
        ps.print(
                " <style> body{background:lightgray;} .op{color:black; font-weight:bold;} .Asignacion{color:yellow; font-weight:bold;} .Cadena{color:DarkMagenta; font-style:italic;} .Numero{color:blue;} .begend{color:orange; font-weight:bold;} .Terminador{color:blue;} .PalabraReservada {  color:blue;  font-weight:bold; } .tipo{ color:red;} .nomFuncion{ color:white; font-weight:bold;} .comentario {    color:lightgreen;  }  .variable{ color:yellow }   </style> </head>");
        ps.print(" <body>");
        ps.print("<h1>Resumen</h1>");
        ps.print("<code>");
        ps.print("<pre>");
        
        System.out.println("Aquí la información de la tabla de símbolos:");
        //El número de sentencias efectivas es el de todas aquellas operaciones que pueden deshacerse en otras más sencillas
        //Por tanto, por cada operador, asignación, return (Elses y Whiles los dejo fuera no?) Sumo 1
        ArrayList<Funcion> lista=new ArrayList<Funcion>(funciones.values());      
        ArrayList<String> nombres=new ArrayList<String>(funciones.keySet());
        int totalComplejCiclomatica = 0, totalPuntosFuncion = 0, totalLineasCodigo = 0;
        for(int i=0;i<lista.size();i++){
            System.out.println("La función que leo es: "+nombres.get(i));
            ps.print("<h2>"+nombres.get(i)+"</h2>");
            Funcion func=lista.get(i);
            totalComplejCiclomatica=totalComplejCiclomatica+func.getComplejidadCiclomatica();
            totalPuntosFuncion=totalPuntosFuncion+func.getPuntosFuncion();
            totalLineasCodigo=totalLineasCodigo+func.getLineasCodigoEfectivas();
            func.imprimir(ps);
        }
        System.out.println("Total Complejidad Ciclomática: "+totalComplejCiclomatica);
        System.out.println("Total Puntos Función: "+totalPuntosFuncion);
        System.out.println("Total Lineas Código Efectivas: "+totalLineasCodigo);
        ps.print("<h2>"+"Resumen Total"+"</h2>");
        ps.print("<p> Lineas de codigo efectivas: " +totalLineasCodigo +"</p>");
        ps.print("<p> Puntos de Función: " +totalPuntosFuncion +"</p>");
        ps.print("<p> Complejidad Ciclomatica: " +totalComplejCiclomatica +"</p>");
        ps.print("</pre>  </code>  </body> </html>");
        ps.close();
        /*
        ArrayList<Llamada> lista2=new ArrayList<Llamada>(llamadas.values());
        for(int i=0;i<lista2.size();i++){
            Llamada llamada=lista2.get(i);
            llamada.imprimir();
        }*/
    }
} 