import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
public class App{
    public static void main(String[] arqs){
        String arquivo = "\\Users\\roko\\AndroidStudioProjects\\MyApplication\\.idea\\arquivo.txt";
        try{
            CharStream input = CharStreams.fromFileName(arquivo);
            gramaticaLexer lexer = new gramaticaLexer(input);
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token " + token.toString());
                System.out.println("    lexema: " + token.getText());
                System.out.println("    classe: " + token.getVocabulary().getDisplayName(token.getType()));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
