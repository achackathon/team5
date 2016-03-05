package accessible.utils;

import java.text.Collator;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Coleçao de funçoes utilitarias para texto.
 *
 * @author Maison Chaves
 */
public class Text {

    public Text() {
    }

    /**
     * compara duas strings ignorandos acentos e case.
     *
     * @param stringA primeira palavra
     * @param stringB segunda palavra
     * @return true se as palavras forem iguais
     */
    public static boolean compare(String stringA, String stringB) {
        Collator usCollator = Collator.getInstance(Locale.US);
        usCollator.setStrength(Collator.PRIMARY);
        return usCollator.compare(stringA, stringB) == 0;
    }

    /**
     * Normaliza uma string removendo os acentos
     * @param str string a ser normalizada
     * @return string sem acentos
     */
    public static String normalize(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
    
    /**
     * Verifica se uma string contem outra ignorando case a caracter especial 
     * @param container texto a ser verificado
     * @param content texto contido
     * @return string sem acentos
     */
    public static Boolean contains(String container, String content) {
        return Pattern.compile(Pattern.quote(content), Pattern.CASE_INSENSITIVE).matcher(normalize(container)).find();
    }

    /**
     * Verifica se uma string é valida.
     * @param string Texto a ser verificado
     * @return true se a string for vazia ou nula
     */
    public static boolean emptyString(String string) {
        return string == null || string.isEmpty();
    }
}
