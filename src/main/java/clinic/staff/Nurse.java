package clinic.staff;

import clinic.staff.operations.Assistance;
import java.util.ArrayList;
import java.util.List;

public class Nurse extends Personnel implements Assistance {

    private final List<Doctor> assistantOf;

    public Nurse(String name, String specialization) {
        super(name, specialization);
        this.assistantOf = new ArrayList<>();
    }

    public void assign(Doctor doc) {
        assistantOf.add(doc);
    }

    public void detach(Doctor doc) {
        assistantOf.remove(doc);
    }

    @Override
    public void makeAssistance() {
        for (Doctor doc : assistantOf) {
            System.out.println(this + " assisting to " + doc.toString());
        }
    }

    @Override
    public String toString() {
        return "Nurse " + super.toString();
    }
}
