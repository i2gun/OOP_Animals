package clinic.drugstore;

import clinic.drugstore.medicine.Medicine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyOne implements Iterator<Medicine> {
    private List<Medicine> medication;
    private int index;

    public PharmacyOne(Medicine... drugs) {
        index = 0;
        medication = new ArrayList<>();
        for(Medicine drug : drugs){
            addMedicine(drug);
        }
    }

    public void addMedicine(Medicine drug) {
            this.medication.add(drug);
    }

    @Override
    public boolean hasNext() {
        return index < medication.size();
    }

    @Override
    public Medicine next() {
        return medication.get(index++);
    }
}