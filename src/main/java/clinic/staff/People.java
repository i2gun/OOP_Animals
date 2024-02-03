package clinic.staff;

public class People {
    private final String fullName;

    public People(String name) {
        this.fullName = name;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
