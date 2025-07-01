package fr.challenge_stream.lvl2;

import java.util.ArrayList;
import java.util.List;

/**
 * ConverƟr une liste de chaînes de caractères en liste de leur longueur respective
 */
public class lvl2_3 {
    public static void main(String[] args) {
        System.out.println("Conversion avec streams: " + convertToLengthsWithStreams(List.of("pokemon", "overwatch", "counter")));
        System.out.println("Conversion sans streams: " + convertToLengthsWithoutStreams(List.of("pokemon", "counter", "pokemon")));
    }

    /**
     * Avec streams, convertit une liste de chaînes de caractères en liste de leur longueur respective.
     *
     * @param strings la liste de chaînes de caractères
     * @return une nouvelle liste contenant les longueurs des chaînes
     */
    public static List<Integer> convertToLengthsWithStreams(List<String> strings) {
        return  strings.stream()
                .map(String::length)
                .toList();
    }

    /**
     * Sans utiliser les streams, convertit une liste de chaînes de caractères en liste de leur longueur respective.
     *
     * @param strings la liste de chaînes de caractères
     * @return une nouvelle liste contenant les longueurs des chaînes
     */
    public static List<Integer> convertToLengthsWithoutStreams(List<String> strings) {
        List<Integer> lengths = new ArrayList<>();
        for (String str : strings) {
            lengths.add(str.length());
        }
        return lengths;
    }
}
