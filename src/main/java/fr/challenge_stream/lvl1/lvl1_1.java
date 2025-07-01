package fr.challenge_stream.lvl1;

import java.util.ArrayList;
import java.util.List;

/**
 * Filtrer les nombres pairs d’une liste, voir le jeu d’essai
 *
 */
public class lvl1_1 {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 0, 3, 6, 8);
        System.out.println("Nombres pairs avec streams: " + filterByPeer(numbers));
        System.out.println("Nombres pairs sans streams: " + filterByPeerWithoutStreams(numbers));


    }


    /**
     * Avec streams, filtrer les nombres pairs d'un tableau d'entiers.
     *
     * @param numbers le tableau d'entiers à filtrer
     * @return un tableau contenant uniquement les nombres pairs
     */
    public static List<Integer> filterByPeer(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
    }

    /**
     * sans utiliser les streams, Filtre les nombres pairs d'une liste d'entiers
     *
     * @param numbers la liste d'entiers à filtrer
     * @return une liste contenant uniquement les nombres pairs
     */
    public static List<Integer> filterByPeerWithoutStreams(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }

}
