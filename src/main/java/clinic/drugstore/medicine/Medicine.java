package clinic.drugstore.medicine;

public abstract class Medicine implements Comparable<Medicine> {
    private final String title;
    private final double weight;
    private final int power;

    public Medicine(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
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

