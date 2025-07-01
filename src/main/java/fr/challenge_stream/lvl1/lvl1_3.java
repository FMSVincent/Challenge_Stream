package fr.challenge_stream.lvl1;

import java.util.ArrayList;
import java.util.List;

/**
 * Multiplier chaque élément d’une liste par 2 et stocker le résultat dans une nouvelle liste
 */
public class lvl1_3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 0, 3, 6, 8);
        System.out.println("Liste multipliée par 2 avec streams: " + multiplyByTwo(numbers));
        System.out.println("Liste multipliée par 2 sans streams: " + multiplyByTwoWithoutStreams(numbers));
    }

    /**
     * Avec streams, multiplie chaque élément d'une liste par 2.
     *
     * @param numbers la liste d'entiers à multiplier
     * @return une nouvelle liste contenant les éléments multipliés par 2
     */
    public static List<Integer> multiplyByTwo(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * 2)
                .toList();
    }

    /**
     * Sans utiliser les streams, multiplie chaque élément d'une liste par 2.
     *
     * @param numbers la liste d'entiers à multiplier
     * @return une nouvelle liste contenant les éléments multipliés par 2
     */
    public static List<Integer> multiplyByTwoWithoutStreams(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(number * 2);
        }
        return result;
    }
}
