import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class EjecucionListener extends gramFibParserBaseListener{

    int counter;
    ArrayList<String> arrayList  = new ArrayList<>();
    String path = "";

    @Override public void enterEveryRule(ParserRuleContext ctx) 
    {
        
        String aux=gramFibParser.ruleNames[ctx.getRuleIndex()].toString();
        arrayList.add(gramFibParser.ruleNames[ctx.getRuleIndex()]);

        path = "";
        for(int i = 0; i < arrayList.size();i++)
        {
            
            path = path.concat("/").concat(arrayList.get(i)); //concatenacion constante del estado actual y el proximo -> /prog // -> /prog/include....
              
        }
        System.out.println(path);
     }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
    @Override public void exitEveryRule(ParserRuleContext ctx) 
    {
        arrayList.remove(arrayList.size()-1); // Removemos el ultimo estado que ha entrado en la pila.
        path = "";
        for(int i = 0; i<arrayList.size()-1;i++)
        {
            path = path.concat("/").concat(arrayList.get(i));
        }
     }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
    @Override public void visitTerminal(TerminalNode node)
     {
        path += " : " + node.getSymbol().getText();
        System.out.println(path);
      }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
