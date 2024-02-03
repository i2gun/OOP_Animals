import clinic.client.Owner;
import clinic.client.patient.*;
import clinic.staff.Doctor;
import clinic.staff.Nurse;
import clinic.client.patient.behaviour.Flyable;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Ivan");
        owner1.addAnimal(new Dog("Sharik"));
        owner1.addAnimal(new Bat("Batty"));
        owner1.addAnimal(new Dolphin("Phin"));
        owner1.addAnimal(new Raccoon("Coon"));

        Owner owner2 = new Owner("Petya");
        owner2.addAnimal(new Cat("Markis"));
        owner2.addAnimal(new Swan("Swan"));

        Doctor doctor1 = new Doctor("Gregory House", "surgeon");

        Nurse nurse1 = new Nurse("Valentina Petrovna", "common practice");
        Nurse nurse2 = new Nurse("Marina Ivanovna", "obstetrician");

        nurse1.assigne(doctor1);
        nurse2.assigne(doctor1);

        VeterinaryClinic clinic = new VeterinaryClinic(45);
        clinic.addOwner(owner1);
        clinic.addOwner(owner2);

        clinic.addNurse(nurse1);
        clinic.addNurse(nurse2);

        clinic.addDoctor(doctor1);


        double speed;
        for (Owner owner: clinic.getOwners()) {
            System.out.println("------------------------------------------");
            System.out.println("Владелец : " + owner.getFullName());
            for (Animal animal : owner.getPets()) {
                System.out.println();
                System.out.println(animal.getNickName() + ":");
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

        for(Doctor doctor : clinic.getDoctors()) {
            for(Animal pet : owner1.getPets()) {
                doctor.makeOperation(pet);
                for(Nurse nurse : clinic.getNurses()) {
                    nurse.makeAssistance(doctor);
                }
            }
        }
    }
}

