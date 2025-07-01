package fr.challenge_stream.lvl3;

import java.util.ArrayList;

import java.util.List;

/**
 * Trier une liste de chaînes par ordre alphabéƟque
 */
public class lvl3_1 {

    public static void main(String[] args) {
        List<String> pokemonList = List.of("pika", "builbi", "salameche");
        System.out.println(sortListString(pokemonList));
        System.out.println(sortListStringWithoutStream(pokemonList));
    }

    /**
     * Avec stream Trier une liste de chaînes par ordre alphabétique
     * @param stringList
     */
    public static List<String> sortListString(List<String> stringList){
        return stringList.stream().sorted().toList();
    }

    /**
     * Sans stream Trier une liste de chaînes par ordre alphabétique
     * @param stringList
     */
    public static List<String> sortListStringWithoutStream(List<String> stringList){
         List<String> sortedList = new ArrayList<>(stringList);
         sortedList.sort(String::compareTo);
         return  sortedList;
    }
}
