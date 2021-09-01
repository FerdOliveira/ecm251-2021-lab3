package lexer;

import java.io.IOException;
import java.util.Hashtable;

public class Lexer {
    public int line = 0;
    private char peek = ' ';
    private Hashtable<String, Word> words = new Hashtable<>();

    void reserve(Word t) {
        words.put(t.lexeme, t);
    }

    public Lexer() {
        reserve(new Word(Tag.PROGRAM, "program"));
        reserve(new Word(Tag.IF, "if"));
        reserve(new Word(Tag.ELSE, "else"));
        reserve(new Word(Tag.WHILE, "while"));
        reserve(new Word(Tag.FOREACH, "foreach"));
        reserve(new Word(Tag.FUNCTION, "function"));
        reserve(new Word(Tag.END, "end"));
        reserve(new Word(Tag.CHAVE_ESQ, "{"));
        reserve(new Word(Tag.CHAVE_DIR, "}"));
        reserve(new Word(Tag.PARENTESE_ESQ, "("));
        reserve(new Word(Tag.PARENTESE_DIR, ")"));
        reserve(new Word(Tag.PONTO_VIRGULA, ";"));
        reserve(new Word(Tag.VIRGULA, ","));
        reserve(new Word(Tag.INDENTIFICADOR, "indentificador"));
        reserve(new Word(Tag.CTE_NUM, ""));
        reserve(new Word(Tag.CTE_STR, ""));
        reserve(new Word(Tag.CTE_CHAR, ""));
        reserve(new Word(Tag.MAIOR, ">"));
        reserve(new Word(Tag.MENOR, "<"));
        reserve(new Word(Tag.MAIOR_IGUAL, ">="));
        reserve(new Word(Tag.MENOR_IGUAL, "<="));
        reserve(new Word(Tag.IGUAL, "=="));
        reserve(new Word(Tag.DIF, "!="));
        reserve(new Word(Tag.ATRIBUICAO, "="));
        reserve(new Word(Tag.ADD, "+"));
        reserve(new Word(Tag.SUB, "-"));
        reserve(new Word(Tag.MULT, "*"));
        reserve(new Word(Tag.DIV, "/"));
        reserve(new Word(Tag.RESTO, "%"));
        reserve(new Word(Tag.INCRE, "++"));
        reserve(new Word(Tag.DECRE, "--"));
        reserve(new Word(Tag.COM, "/*"));
        reserve(new Word(Tag.TRUE, "true"));
        reserve(new Word(Tag.FALSE, "false"));

    }

    public Token scan() throws IOException {
        for (; ; peek = (char) System.in.read()) {
            if (peek == ' ' || peek == '\t')
                continue;
            else if (peek == '\n')
                line = line + 1;
            else
                break;
        }
        if (Character.isDigit(peek)) {
            int v = 0;
            do {
                v = 10 * v + Character.digit(peek, 10);
                peek = (char) System.in.read();
            } while (Character.isDigit(peek));
            return new Num(v);
        }
        if (Character.isLetter(peek)) {
            StringBuffer b = new StringBuffer();
            do {
                b.append(peek);
                peek = (char) System.in.read();
            } while (Character.isLetterOrDigit(peek));
            String s = b.toString();
            Word w = words.get(s);
            if (w != null)
                return w;
            w = new Word(Tag.ID, s);
            words.put(s, w);
            return w;
        }
        Token t = new Token(peek);
        peek = ' ';
        return t;
    }
}