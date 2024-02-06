package clinic.drugstore;

import clinic.drugstore.medicine.Medicine;
import java.util.Iterator;

public class PharmacyOne extends Pharmacy implements Iterator<Medicine> {
    private int index = 0;

    @Override
    public boolean hasNext() {
        return index < getSize();
    }

    @Override
    public Medicine next() {
        return getMedicine(index++);
    }
}