package fr.challenge_stream.lvl2;


import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Compter les occurrences de chaque mot dans une phrase
 */
public class lvl2_4 {
    public static void main (String[] args) {
        String regex = " ";
        System.out.println(" avec stream:  "+occurrenceWord("ma phrase a tester tester", "tEster", regex));
        System.out.println(" sans stream:  "+occurrenceWordWithoutStream("ma phrase a taster tester", "tesTer", regex));

    }

    /**
     * avec  stream, compte le nombre d'occurrence d'un mot dans une phrase
     *
     * @param phrase
     * @param word
     * @return le noimbre d'occurrence
     */
    public static int occurrenceWord(String phrase, String word, String regex) {
        return (int) Stream.of(phrase.split(regex))
                .filter(w -> Objects.equals(word.toLowerCase(), w.toLowerCase()))
                .count();
    }

    /**
     * sans  stream, compte le nombre d'occurrence d'un mot dans une phrase
     *
     * @param phrase
     * @param word
     * @return le nombre d'occurrence
     */
    public static int occurrenceWordWithoutStream(String phrase, String word, String regex) {
        List<String> listWord = List.of(phrase.split(regex));
        int counter = 0;
        for (String w : listWord) {
            if (w.equalsIgnoreCase(word))
                counter++;
        }
     return counter;
    }
}
