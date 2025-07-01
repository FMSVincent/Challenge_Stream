package fr.challenge_stream.lvl3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Trier une liste d’objets (par exemple : liste de personnes par âge)
 */
public class lvl3_2 {
     public static void main(String[] args) {
        OldPerson momo = new OldPerson("momo", 550);
        OldPerson fabrice = new OldPerson("fabrice", 59);

        List<OldPerson> oldPeople = new ArrayList<>();
        oldPeople.add(momo);
        oldPeople.add(fabrice);

        System.out.println("trie par age avec stream : " + sortOldPerson(oldPeople));
        System.out.println("trie par age sans stream : " + sortOldPersonWithoutStream(oldPeople));

    }

    /**
     * Avec stream Trier de personne par age
     */
    public static List<OldPerson> sortOldPerson(List<OldPerson> oldPeople) {
        return oldPeople.stream().sorted((a,b)->Integer.compare(a.age,b.age)).toList();
    }

    /**
     * Sans stream Trier de personne par age
     */
    public static List<OldPerson> sortOldPersonWithoutStream(List<OldPerson> oldPeople) {
         oldPeople.sort(Comparator.comparingInt(a -> a.age));
         return oldPeople;
    }
}
