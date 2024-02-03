package clinic.staff;

import clinic.client.patient.Animal;

public class Doctor extends Personnel {

    public Doctor(String name, String specialization) {
        super(name, specialization);
    }

    public void makeOperation(Animal pet) {
        System.out.println(this + " makes an operation on " + pet.getNickName());
    }

    @Override
    public String toString() {
        return "Doctor " + super.toString();
    }
}
