package clients;

import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Dog(){
        super();
    }

    public int toGo() {
        System.out.println("Животное ходит!");
        return 5;
    }

    public int swim() {
        System.out.println("Животное плавает!");
        return 5;
    }
}