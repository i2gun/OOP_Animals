package clinic.staff;

import java.util.ArrayList;
import java.util.List;

public class Nurse extends Personnel {

    private final List<Doctor> assistantOf;

    public Nurse(String name, String specialization) {
        super(name, specialization);
        this.assistantOf = new ArrayList<>();
    }

    public void assigne(Doctor doc) {
        assistantOf.add(doc);
    }

    public void detach(Doctor doc) {
        assistantOf.remove(doc);
    }

    public void makeAssistance(Doctor doc) {
        if (assistantOf.contains(doc)) System.out.println(this + " assisting to " + doc.toString());
    }

    @Override
    public String toString() {
        return "Nurse " + super.toString();
    }
}
