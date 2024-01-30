import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal someAnimal = new Animal(); //Создаём экземпляр класса

//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickName());
//        System.out.println("Болезнь:" + cat.getIllness());
//
//        System.out.println(cat.getNickName());
//
//        cat.setIllness(new Illness(null));
//
//        System.out.println("Болезнь:" + cat.getIllness());
//
//
//        Animal testAnimal = new Animal();
//        System.out.println(testAnimal.getNickName());
//
//        cat.lifeCycle();

        Animal catty = new Cat("Солнышко", new Owner("Сергей Валерьевич"),
                LocalDate.of(2021, 10, 5), new Illness("Лишай"), 0.0);
        Dog goodBoy = new Dog();

//        System.out.println(goodBoy.getType());
//        System.out.println(catty.getType());
//
//        System.out.println(catty);
//
//        Cat.meow();

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(catty);
        animals.add(goodBoy);
        animals.add(someAnimal);
        animals.add(new Bat("Batty"));
        animals.add(new Raccoon("Coon"));
        animals.add(new Dolphin("Phin"));
        animals.add(new Swan("Swan"));

        int speed;
        for (Animal animal : animals){
            System.out.println();
            System.out.println(animal.getNickName() + ":");
            if ((speed = animal.fly()) > 0) System.out.println(" Скорость: " + speed);
            if ((speed = animal.toGo()) > 0) System.out.println(" Скорость: " + speed);
            if ((speed = animal.swim()) > 0) System.out.println(" Скорость: " + speed);
            animal.toGo();
            animal.swim();
        }

    }
}

