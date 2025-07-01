package fr.challenge_stream.lvl1;

import java.util.List;

/**
 * Trouver le maximum et le minimum d’une liste
 */
public class lvl1_4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 15, 0, 3, 6, 8);
        System.out.println("Maximum avec streams: " + findNumberMax(numbers));
        System.out.println("Minimum avec streams: " + findNumberMin(numbers));
        System.out.println("Maximum sans streams: " + findNumberMaxWithoutStream(numbers));
        System.out.println("Minimum sans streams: " + findNumberMinWithoutStream(numbers));
    }

    /**
     * Avec streams, trouve le maximum d'une liste d'entiers.
     *
     * @param numbers la liste d'entiers
     * @return le maximum de la liste
     */
    public static Integer findNumberMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compare)
                .orElse(null);
    }

    /**
     * Avec streams, trouve le minimum d'une liste d'entiers.
     *
     * @param numbers la liste d'entiers
     * @return le minimum de la liste
     */
    public static Integer findNumberMin(List<Integer> numbers) {
        return numbers.stream()
                .min(Integer::compare)
                .orElse(null);
    }

    /**
     * Sans utiliser les streams, trouve le maximum d'une liste d'entiers.
     *
     * @param numbers la liste d'entiers
     * @return le maximum de la liste
     */
    public static Integer findNumberMaxWithoutStream(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }
        Integer max = numbers.get(0);
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    /**
     * Sans utiliser les streams, trouve le minimum d'une liste d'entiers.
     *
     * @param numbers la liste d'entiers
     * @return le minimum de la liste
     */
    public static Integer findNumberMinWithoutStream(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return null;
        }
        Integer min = numbers.get(0);
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}