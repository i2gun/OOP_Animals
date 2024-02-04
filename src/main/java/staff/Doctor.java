package clinic.staff;

import clinic.client.patient.Animal;
import clinic.staff.operations.Surgery;

public class Doctor extends Personnel implements Surgery {

    public Doctor(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void makeSurgery(Animal pet) {
        System.out.println(this + " makes a surgery on " + pet.getNickName());
    }

    @Override
    public String toString() {
        return "Doctor " + super.toString();
    }

}
