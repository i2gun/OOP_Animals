package clinic.client.patient;

import clinic.client.Owner;
import clinic.client.patient.behaviour.Flyable;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;

public class Swan extends Animal implements Flyable, Walkable, Swimable {

    public Swan(String name, Owner owner) {
        super(name, owner);
    }

    public double fly() {
        System.out.println("Животное быстро летает!");
        return 100;
    }

    public double toGo() {
        System.out.println("Животное медленно ходит!");
        return 5;
    }

    public double swim() {
        System.out.println("Животное медленно плавает!");
        return 10;
    }

}
