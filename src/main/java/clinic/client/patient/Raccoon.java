package clinic.client.patient;

import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;

public class Raccoon extends Animal implements Walkable, Swimable {

    public Raccoon(String name) {
        super(name);
    }

    public double toGo() {
        System.out.println("Животное медленно ходит!");
        return 10;
    }

    public double swim() {
        System.out.println("Животное медленно плавает!");
        return 5;
    }

}
