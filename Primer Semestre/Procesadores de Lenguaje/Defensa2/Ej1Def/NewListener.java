import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Stack;
import java.util.*;

public class NewListener extends AParserBaseListener {
    Stack<String> stack = new Stack<String>();

    @Override public void enterEveryRule(ParserRuleContext ctx) {
        stack.push(AParser.ruleNames[ctx.getRuleIndex()]);
        for(int i = 0; i < stack.size(); i++) {
            System.out.print('/' + stack.get(i));
        }
        System.out.println();
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        stack.pop();
    }

    @Override public void visitTerminal(TerminalNode node) {
        stack.push((node.getSymbol().getType()) + ':' + node.getText());
        for(int i = 0; i < stack.size(); i++) {
            System.out.print('/' + stack.get(i));
        }
        System.out.println();
        stack.pop();
    }

    @Override public void visitErrorNode(ErrorNode node) { }
}