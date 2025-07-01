package fr.challenge_stream.lvl4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Grouper les personnes par ville (Map<String, List<Personne>>)
 * Amélioration avec computeIfAbsent ou putIfAbsent
 */
public class lvl4_1 {
    public static void main(String[] args) {
        Personne neo = new Personne("neo", "new york");
        Personne gandalf = new Personne("gandalf", "Moria ");
        Personne trinity = new Personne("trinity", "new york");
        Personne harry = new Personne("harry", "Moria ");

        List<Personne> people = new ArrayList<>();
        people.add(neo);
        people.add(gandalf);
        people.add(trinity);
        people.add(harry);

//        grpByCityWithoutStream(people).forEach((key, value)-> {
//            System.out.println("habitant de la ville : "+key);
//            for (Personne p : value) System.out.println(p.name);
//        });

        for (Map.Entry<String, List<Personne>> entry : grpByCityWithoutStream(people).entrySet()) {
            System.out.println("sans stream : "+entry);
        }

      System.out.println("avec stream : "+ grpByCity(people));
    }

    /**
     * Avec stream Grouper les personnes par ville
     *
     * @param personneList
     * @return
     */
    public static Map<String, List<Personne>> grpByCity(List<Personne> personneList) {
        return personneList.stream()
                .collect(Collectors.groupingBy(personne -> personne.city));
    }

    /**
     * Sans stream Grouper les personnes par ville
     *
     * @param personneList
     * @return
     */
    public static Map<String, List<Personne>> grpByCityWithoutStream(List<Personne> personneList) {
        Map<String, List<Personne>> sortedByCity = new HashMap<>();

        for (Personne p : personneList) {
            if (!sortedByCity.containsKey(p.city)) {
                sortedByCity.put(p.city, new ArrayList<>());
                sortedByCity.get(p.city).add(p);
            }
            else {
                sortedByCity.get(p.city).add(p);
            }
        }
        return sortedByCity;
    }

}
