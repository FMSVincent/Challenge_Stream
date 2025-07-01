package fr.challenge_stream.lvl3;


import java.util.*;

/**
 * Trouver les 3 plus grandes valeurs distinctes d’une liste
 */
public class lvl3_4 {
    public static void main(String[] args) {
        List<Integer> value = List.of(4, 10, 2, 4444, 5, 47875454, 44);

        System.out.println("avec stream : "+findThreeGreatherValue(value));
        System.out.println("sans stream : "+findThreeGreatherValueWithoutStream(value));
    }

    /**
     * Avec stream Trouver les 3 plus grandes valeurs distinctes d’une liste
     */
    public static List<Integer> findThreeGreatherValue(List<Integer> numberList) {
       return numberList.stream().sorted(Integer::compareTo).toList().reversed().stream().limit(3).distinct().toList();
    }

    /**
     * Sans stream Trouver les 3 plus grandes valeurs distinctes d’une liste
     */
    public static List<Integer> findThreeGreatherValueWithoutStream(List<Integer> numberList) {
        List<Integer> sortedList = new ArrayList<>(numberList);
        sortedList.reversed().sort(Integer::compareTo);

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            result.add(sortedList.get(i));
        }
        return result;
    }
}
