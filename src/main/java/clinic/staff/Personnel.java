package clinic.staff;

public class Personnel extends People {

    private final String specialization;

    public Personnel(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return this.specialization + " : " + super.toString();
    }
}
