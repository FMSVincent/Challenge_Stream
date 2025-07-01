package fr.challenge_stream.lvl3;

public class OldPerson {
    String name;
    int age;

    public OldPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "["+this.name  +" "+ this.age+"]";
    }
}
