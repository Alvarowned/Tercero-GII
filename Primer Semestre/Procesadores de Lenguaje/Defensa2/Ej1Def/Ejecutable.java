import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;

public class Ejecutable {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if(args.length > 0) inputFile = args[0];

        InputStream is = System.in;
        if(inputFile != null){
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        ALexer lexer = new ALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AParser parser = new AParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog(); 

        NewListener TB = new NewListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(TB, tree);
    } 
}