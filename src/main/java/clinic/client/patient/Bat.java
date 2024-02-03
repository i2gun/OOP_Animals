package clinic.client.patient;

import clinic.client.patient.behaviour.Flyable;

public class Bat extends Animal implements Flyable {

    public Bat(String name) {
        super(name);
    }

    public double fly() {
        System.out.println("Животное хорошо летает!");
        return 50.0;
    }

}
