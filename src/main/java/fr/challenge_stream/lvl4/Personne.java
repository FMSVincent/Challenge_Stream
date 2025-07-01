package fr.challenge_stream.lvl4;


public class Personne {
    String name;
    String city;

    public Personne(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString(){
        return this.name+" ";
    }

}
