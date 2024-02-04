package clinic.client.patient;

import clinic.client.Owner;
import clinic.client.patalogy.Illness;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;

import java.time.LocalDate;

public class Cat extends Animal implements Walkable, Swimable {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat(String nickName, Owner owner) {
        this(nickName, owner, LocalDate.parse("2021-01-01"), new Illness("healthy"), 100.0);
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public static void meow(){
        System.out.println("Мяяяу!");
    }

    public double toGo() {
        System.out.println("Животное ходит!");
        return 5.0;
    }

    public double swim() {
        System.out.println("Животное плавает, если упадет в воду!");
        return 5.0;
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }
}