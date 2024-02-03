package clinic.client.patient;

import clinic.client.patalogy.Illness;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;
import java.time.LocalDate;

public class Dog extends Animal implements Walkable, Swimable {
    public Dog(String nickName, LocalDate birthDate, Illness illness) {
        super(nickName, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(String nickName) {
        super(nickName, LocalDate.parse("2021-01-01"), new Illness("healthy"));
    }

    public Dog(){
        super();
    }

    public double toGo() {
        System.out.println("Животное ходит!");
        return 5;
    }

    public double swim() {
        System.out.println("Животное плавает!");
        return 5;
    }
}