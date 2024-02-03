package clinic.client;

import clinic.client.patient.Animal;
import clinic.staff.People;
import java.util.ArrayList;
import java.util.List;

public class Owner extends People {
    private final List<Animal> pets;

    public Owner(String fullName) {
        super(fullName);
        this.pets = new ArrayList<>();
    }

    public void addAnimal(Animal pet) {
        pets.add(pet);
    }

    public void removeAnimal(Animal pet) {
        pets.remove(pet);
    }

    public List<Animal> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Owner: " + this.getFullName() + ", pets : " + pets.toString();
    }
}