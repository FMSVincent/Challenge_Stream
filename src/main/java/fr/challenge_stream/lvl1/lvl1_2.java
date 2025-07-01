package fr.challenge_stream.lvl1;

import java.util.List;

/**
 * Compter le nombre d’éléments supérieurs à 10 dans une liste
 */
public class lvl1_2 {
    public static void main(String[] args) {
        List<Integer> result = List.of(12, 15, 0, 3, 6, 8);
        System.out.println("Nombre d'éléments supérieurs à 10 : " + countGreaterThanTen(result));
        System.out.println("Nombre d'éléments supérieurs à 10 (sans stream) : " + countGreaterThanTenWithoutStream(result));
    }

    /**
     * avec stream Compte le nombre d'éléments supérieurs à 10 dans une liste.
     *
     * @param numbers la liste d'entiers à analyser
     * @return le nombre d'éléments supérieurs à 10
     */
    public static long countGreaterThanTen(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 10)
                .count();
    }

    /**
     * sans stream Compte le nombre d'éléments supérieurs à 10 dans une liste.
     * @param numbers la liste d'entiers à analyser
     * @return le nombre d'éléments supérieurs à 10
     */
    public static long countGreaterThanTenWithoutStream(List<Integer> numbers) {
        long count = 0;
        for (Integer number : numbers) {
            if (number > 10) {
                count++;
            }
        }
        return count;
    }
}