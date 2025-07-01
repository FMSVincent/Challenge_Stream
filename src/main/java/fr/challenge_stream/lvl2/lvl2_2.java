package fr.challenge_stream.lvl2;

import java.util.List;

/**
 * Calculer la somme de tous les éléments d’une liste
 */
public class lvl2_2 {
    public static void main(String[] args) {
        System.out.println("Calcul de la somme avec streams: " + totalWithStreams(List.of(12, 15, 0, 3, 6, 8)));
        System.out.println("Calcul de la somme sans streams: " + totalWithoutStreams(List.of(12, 15, 0, 3, 6, 8)));
    }

    /**
     * Avec streams, calcule la somme de tous les éléments d'une liste.
     *
     * @param numbers la liste d'entiers
     * @return la somme des éléments de la liste
     */
    public static int totalWithStreams(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt((Integer number) -> number)
                .sum();
    }

    /**
     * Sans utiliser les streams, calcule la somme de tous les éléments d'une liste.
     *
     * @param numbers la liste d'entiers
     * @return la somme des éléments de la liste
     */
    public static int totalWithoutStreams(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
