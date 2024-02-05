package clinic.staff.operations;

import clinic.client.patient.Animal;

public interface Surgery extends Operation {

    void makeSurgery(Animal pet);
}
