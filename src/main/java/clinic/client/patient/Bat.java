package clinic.client.patient;

import clinic.client.Owner;
import clinic.client.patient.behaviour.Flyable;

public class Bat extends Animal implements Flyable {

    public Bat(String name, Owner owner) {
        super(name, owner);
    }

    public double fly() {
        System.out.println("Животное хорошо летает!");
        return 50.0;
    }

}
