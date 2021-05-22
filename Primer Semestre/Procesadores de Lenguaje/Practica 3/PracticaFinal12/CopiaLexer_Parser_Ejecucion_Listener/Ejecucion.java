import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.Marshaller.Listener;


public class Ejecucion{

    public static void main(String[] args) throws Exception{

        String inputFile = null;
        if(args.length>0) inputFile = args[0];
        InputStream is = System.in;
        if(inputFile != null)
        {
            is = new FileInputStream(inputFile);   
        }

        CharStream input = CharStreams.fromStream(is);
        
         
        //Creacion de lexer.
        gramFibLexer lexer = new gramFibLexer(input);
        
        //Creacion de los tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //generar parser
        gramFibParser parser = new gramFibParser(tokens);

        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog();

        //configuracion del Listener
        EjecucionListener listener = new EjecucionListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //recorremos el arbol
        walker.walk(listener,tree);

    }
}
