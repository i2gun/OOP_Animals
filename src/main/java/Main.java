import clinic.VeterinaryClinic;
import clinic.client.Owner;
import clinic.client.patient.*;
import clinic.client.patient.behaviour.Behavior;
import clinic.staff.Doctor;
import clinic.staff.Nurse;
import clinic.client.patient.behaviour.Flyable;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;
import clinic.staff.Personnel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Ivan");
        owner1.addAnimal(new Dog("Sharik", owner1));
        owner1.addAnimal(new Bat("Batty", owner1));
        owner1.addAnimal(new Dolphin("Phin", owner1));
        owner1.addAnimal(new Raccoon("Coon", owner1));

        Owner owner2 = new Owner("Petya");
        owner2.addAnimal(new Cat("Markis", owner2));
        owner2.addAnimal(new Swan("Swan", owner2));

        Doctor doctor1 = new Doctor("Gregory House", "surgeon");

        Nurse nurse1 = new Nurse("Valentina Petrovna", "common practice");
        Nurse nurse2 = new Nurse("Marina Ivanovna", "obstetrician");
        nurse1.assign(doctor1);
        nurse2.assign(doctor1);

        VeterinaryClinic clinic = new VeterinaryClinic(45);
        clinic.addOwner(owner1);
        clinic.addOwner(owner2);
        clinic.addWorker(nurse1);
        clinic.addWorker(nurse2);
        clinic.addWorker(doctor1);

        Map<String, List<Behavior>> animalMap = new HashMap<>();
        animalMap.put("Flying", clinic.getFlyingAnimals());
        animalMap.put("Walking", clinic.getWalkingAnimals());
        animalMap.put("Swimming", clinic.getSwimmingAnimals());

        double speed;
        for (Map.Entry<String, List<Behavior>> entry : animalMap.entrySet()) {
            System.out.println("------------------------------------------");
            System.out.println(entry.getKey() + " -------------------------------");
            for (Behavior animal : entry.getValue()) {
                System.out.println();
                System.out.println(animal);
                if ((animal instanceof Flyable) && ((speed = ((Flyable) animal).fly()) > 0))
                    System.out.println(" Скорость: " + speed);
                if ((animal instanceof Walkable) && ((speed = ((Walkable) animal).toGo()) > 0))
                    System.out.println(" Скорость: " + speed);
                if ((animal instanceof Swimable) && ((speed = ((Swimable) animal).swim()) > 0))
                    System.out.println(" Скорость: " + speed);
            }
        }

        System.out.println();
        System.out.println("===================================================");
        System.out.println();

        for(Personnel worker : clinic.getWorker()) {
            if (worker instanceof Nurse) {
                ((Nurse) worker).makeAssistance();
            } else if (worker instanceof Doctor) {
                for(Animal pet : owner1.getPets()) {
                    if (pet instanceof Flyable) {
                        ((Doctor) worker).makeSurgery(pet);
                    }
                }
            }
        }
    }
}

