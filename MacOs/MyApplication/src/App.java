import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
public class App{
    public static void main(String[] arqs){
        String arquivo = "arquivo.txt";
        try{
            CharStream input = CharStreams.fromFileName(arquivo);
            GramaticaLexer lexer = new GramaticaLexer(input);
            while(!lexer._hitEOF){
                Token token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
