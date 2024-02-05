package clinic;

import clinic.client.Owner;
import clinic.client.patient.Animal;
import clinic.client.patient.behaviour.Behavior;
import clinic.client.patient.behaviour.Flyable;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;
import clinic.staff.Personnel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class VeterinaryClinic {

    Integer clinicNumber;
    List<Personnel> worker;
    List<Owner> owners;

    public VeterinaryClinic(Integer clinicNumber) {
        this.clinicNumber = clinicNumber;
        this.worker = new ArrayList<>();
        this.owners = new ArrayList<>();
    }

    public void addWorker(Personnel person) {
        worker.add(person);
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public List<Personnel> getWorker() {
        return worker;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public List<Behavior> getSwimmingAnimals() {
        return getAnimalsByAbility((x) -> x instanceof Swimable);
    }

    public List<Behavior> getWalkingAnimals() {
        return getAnimalsByAbility((x) -> x instanceof Walkable);
    }

    public List<Behavior> getFlyingAnimals() {
        return getAnimalsByAbility((x) -> x instanceof Flyable);
    }

    private List<Behavior> getAnimalsByAbility(Predicate check) {
        List<Behavior> animalList = new ArrayList<>();
        for (Owner owner : owners) {
            for (Animal pet : owner.getPets()) {
                if (check.test(pet)) {
                    animalList.add((Behavior) pet);
                }
            }
        }
        return animalList;
    }
}
