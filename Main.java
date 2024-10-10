import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // Ensure exactly one argument is given: the name of the input file
        if (args.length != 1) {
            System.err.println("\n");
            System.err.println("Please provide the input filename as an argument\n");
            System.exit(-1);
        }
        String filename = args[0];

        // Open the input file
        CharStream input = CharStreams.fromFileName(filename);

        // Create a lexer/scanner
        ccLexer lex = new ccLexer(input);

        // Get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Create a parser
        ccParser parser = new ccParser(tokens);

        // Add error listener
        parser.removeErrorListeners(); // remove ConsoleErrorListener
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Syntax error at line " + line + ", char " + charPositionInLine + ": " + msg);
            }
        });

        // Parse using the start rule
        ParseTree parseTree = parser.start();

        // If there are parsing errors, terminate without generating HTML
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Parsing failed due to syntax errors.");
            System.exit(1);
        }

        // Use PrettyPrintVisitor to get HTML output
        PrettyPrintVisitor prettyPrintVisitor = new PrettyPrintVisitor();
        String htmlOutput = prettyPrintVisitor.visit(parseTree);

        // Save the HTML output to a file
        try (PrintWriter out = new PrintWriter("output.html")) {
            out.println(htmlOutput);
        }

        // Print a confirmation message
        System.out.println("HTML output has been saved to output.html");
    }
}
class PrettyPrintVisitor extends AbstractParseTreeVisitor<String> implements ccVisitor<String> {

    private static final String HTML_HEADER = "<!DOCTYPE html>\n" +
            "<html><head><title>TITLEOFTHEPAGE</title>\n" +
            "<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n" +
            "<script type=\"text/javascript\" id=\"MathJax-script\" async " +
            "src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n" +
            "</script></head><body>\n";

    private static final String HTML_FOOTER = "</body></html>";

    @Override
    public String visitStart(ccParser.StartContext ctx) {
        StringBuilder sb = new StringBuilder(HTML_HEADER.replace("TITLEOFTHEPAGE", "Circuit Specification"));

        for (ccParser.CircuitContext circuit : ctx.circuit()) {
            sb.append(visit(circuit));
        }

        sb.append(HTML_FOOTER);
        return sb.toString();
    }

    @Override
    public String visitCircuit(ccParser.CircuitContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(visit(ctx.hardware()));

        sb.append("<h2>Inputs</h2>\n");
        sb.append(visit(ctx.inputs()));

        sb.append("<h2>Outputs</h2>\n");
        sb.append(visit(ctx.outputs()));

        if (ctx.latches() != null) {
            sb.append("<h2>Latches</h2>\n");
            sb.append(visit(ctx.latches()));
        }

        if (!ctx.def().isEmpty()) {
            sb.append("<h2>Definitions</h2>\n");
            for (ccParser.DefContext def : ctx.def()) {
                sb.append(visit(def));
            }
        }

        sb.append("<h2>Updates</h2>\n");
        sb.append(visit(ctx.updates()));

        sb.append("<h2>Simulation Inputs</h2>\n");
        sb.append(visit(ctx.siminputs()));

        return sb.toString();
    }

    @Override
    public String visitHardware(ccParser.HardwareContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>").append(ctx.IDENT(0).getText()).append("</h1>\n");
        return sb.toString();
    }

    @Override
    public String visitInputs(ccParser.InputsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (ccParser.SignalContext signal : ctx.signal()) {
            sb.append(signal.getText()).append("<br>\n");
        }
        return sb.toString();
    }

    @Override
    public String visitOutputs(ccParser.OutputsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (ccParser.SignalContext signal : ctx.signal()) {
            sb.append(signal.getText()).append("<br>\n");
        }
        return sb.toString();
    }

    @Override
    public String visitLatches(ccParser.LatchesContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (ccParser.SignalContext signal : ctx.signal()) {
            sb.append(signal.getText()).append("<br>\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDef(ccParser.DefContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\\(\\mathit{").append(ctx.function().IDENT().getText()).append("} = (")
                .append(visit(ctx.exp())).append(")\\)<br>\n");
        return sb.toString();
    }

    @Override
    public String visitUpdates(ccParser.UpdatesContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.IDENT().size(); i++) {
            sb.append(ctx.IDENT(i).getText()).append(" &larr; ")
                    .append("\\(").append(visit(ctx.out(i))).append("\\)<br>\n");
        }
        return sb.toString();
    }

    @Override
    public String visitSiminputs(ccParser.SiminputsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.IDENT().size(); i++) {
            sb.append("<b>").append(ctx.IDENT(i).getText()).append("</b>: ")
                    .append(ctx.NUMBER(i).getText()).append("<br>\n");
        }
        return sb.toString();
    }

    @Override
    public String visitSignal(ccParser.SignalContext ctx) {
        return "\\mathrm{" + ctx.IDENT().getText() + "}";
    }

    @Override
    public String visitFunction(ccParser.FunctionContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\\mathit{").append(ctx.IDENT().getText()).append("}");

        if (ctx.signal().size() > 0) {
            sb.append("(");
            for (int i = 0; i < ctx.signal().size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append("\\mathrm{").append(ctx.signal(i).getText()).append("}");
            }
            sb.append(")");
        }

        return sb.toString();
    }

    @Override
    public String visitOut(ccParser.OutContext ctx) {
        if (ctx.function() != null) {
            return visit(ctx.function());
        } else if (ctx.exp() != null) {
            return visit(ctx.exp());
        }
        return "";
    }

    @Override
    public String visitAND(ccParser.ANDContext ctx) {
        return "(" + visit(ctx.e1) + " \\wedge " + visit(ctx.e2) + ")";
    }

    @Override
    public String visitOR(ccParser.ORContext ctx) {
        return "(" + visit(ctx.e1) + " \\vee " + visit(ctx.e2) + ")";
    }

    @Override
    public String visitNOT(ccParser.NOTContext ctx) {
        return "(" + (ctx.var != null ? "\\mathrm{" + ctx.var.getText() + "}" : "") + " \\neg " + visit(ctx.exp()) + ")";
    }

    @Override
    public String visitConstant(ccParser.ConstantContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (var ident : ctx.IDENT()) {
            sb.append("\\mathrm{").append(ident.getText()).append("}");
        }
        return sb.toString();
    }

    @Override
    public String visitParentheses(ccParser.ParenthesesContext ctx) {
        return "(" + visit(ctx.e) + ")";
    }
}