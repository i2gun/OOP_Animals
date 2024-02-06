package clinic.drugstore;

import clinic.drugstore.medicine.Medicine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Pharmacy implements Comparable<Pharmacy> {
    private final List<Medicine> medication = new ArrayList<>();
    private int sumPower = 0;
    private double sumWeight = 0.0;

    public void addMedicine(Medicine drug) {
        medication.add(drug);
        sumPower += drug.getPower();
        sumWeight += drug.getWeight();
    }

    public void addMedicine(Medicine ... drugs) {
        for (Medicine drug : drugs) {
            medication.add(drug);
            sumPower += drug.getPower();
            sumWeight += drug.getWeight();
        }
    }

    public Medicine getMedicine(int index) {
        return medication.get(index);
    }

    public int getSize() {
        return medication.size();
    }

    public int getSumPower() {
        return sumPower;
    }

    public double getSumWeight() {
        return sumWeight;
    }

    @Override
    public int compareTo(Pharmacy other) {
        return Integer.compare(this.getSumPower(), other.getSumPower());
    }
}