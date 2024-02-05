package clinic.drugstore.medicine;

public abstract class Medicine implements Comparable<Medicine> {
    private String title;
    private Double weight;
    private int power;

    public Medicine(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, weight = %s, power = %s", title, weight, power);
    }

    @Override
    public int compareTo(Medicine other) {
        return Integer.compare(this.power, other.power);
    }
}

