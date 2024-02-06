package clinic;

import clinic.client.Owner;
import clinic.client.patient.Animal;
import clinic.client.patient.behaviour.Behavior;
import clinic.client.patient.behaviour.Flyable;
import clinic.client.patient.behaviour.Swimable;
import clinic.client.patient.behaviour.Walkable;
import clinic.drugstore.Pharmacy;
import clinic.staff.Personnel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class VeterinaryClinic {
    private final List<Personnel> worker;
    private final List<Owner> owners;
    private final Map<String, Pharmacy> drugstore;

    public VeterinaryClinic(Integer clinicNumber, List<Pharmacy> drugstore) {
        this.drugstore = new HashMap<>();
        this.worker = new ArrayList<>();
        this.owners = new ArrayList<>();
    }

    public void addPharmacy(String address, Pharmacy drugshop) {
        drugstore.put(address, drugshop);
    }

    public Pharmacy getDrugstore(String address) {
        return drugstore.get(address);
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

    private List<Behavior> getAnimalsByAbility(Predicate<Behavior> check) {
        List<Behavior> animalList = new ArrayList<>();
        for (Owner owner : owners) {
            for (Animal pet : owner.getPets()) {
                if ( check.test((Behavior) pet)) {
                    animalList.add((Behavior) pet);
                }
            }
        }
        return animalList;
    }
}
