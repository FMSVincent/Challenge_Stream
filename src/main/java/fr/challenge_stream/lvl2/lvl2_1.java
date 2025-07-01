package fr.challenge_stream.lvl2;

import java.util.ArrayList;
import java.util.List;

/**
 * Supprimer les doublons dans une liste
 */
public class lvl2_1 {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(12, 15, 0, 3, 6, 8, 12, 15));

        System.out.println("Liste sans doublons avec streams: " + withoutDuplicates(numbers));
    }

    /**
     * Avec streams, supprime les doublons d'une liste d'entiers.
     *
     * @param numbers la liste d'entiers
     * @return une nouvelle liste sans doublons
     */
    public static List<Integer> withoutDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .toList();
    }

    /**
     * Sans utiliser les streams, supprime les doublons d'une liste d'entiers.
     *
     * @param numbers la liste d'entiers
     * @return une nouvelle liste sans doublons
     */
    public static List<Integer> withoutDuplicatesWithoutStreams(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }

}
