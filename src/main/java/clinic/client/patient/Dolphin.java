package clinic.client.patient;

import clinic.client.Owner;
import clinic.client.patient.behaviour.Swimable;

public class Dolphin extends Animal implements Swimable {

    public Dolphin(String name, Owner owner) {
        super(name, owner);
    }

    public double swim() {
        System.out.println("Животное быстро плавает!");
        return 40.0;
    }

}
