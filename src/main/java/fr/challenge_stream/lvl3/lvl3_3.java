package fr.challenge_stream.lvl3;

import org.apache.logging.log4j.util.PropertySource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Créer une liste de mots uniques, triés par longueur croissante
 */
public class lvl3_3 {
     public static void main(String[] args) {
         List<String> wordList = List.of("premier", "deux", "trois", "quatre");
         System.out.println("trié avec stream : "+sortBySizeWord(wordList));
         System.out.println("trié sans stream : "+sortBySizeWordWithoutStream(wordList));

    }

    /**
     * Avec stream , triés par longueur croissante
     * @param listWord
     * @return List<String>
     */
    public static List<String> sortBySizeWord(List<String> listWord){
        return listWord.stream().sorted(Comparator.comparing(String::length)).toList();
    }

    /**
     * Sans stream , triés par longueur croissante
     * @param listWord
     * @return List<String>
     */
    public static List<String> sortBySizeWordWithoutStream(List<String> listWord){
        List<String> listSorted = new ArrayList<>(listWord);
        listSorted.sort(Comparator.comparingInt(String::length));
         return listSorted;
    }
}
