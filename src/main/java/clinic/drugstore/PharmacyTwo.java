package clinic.drugstore;

import clinic.drugstore.medicine.Medicine;
import java.util.Iterator;

public class PharmacyTwo extends Pharmacy implements Iterable<Medicine> {

    private int index = 0;

    public PharmacyTwo(String storeName) {
        super(storeName);
    }

    @Override
    public Iterator<Medicine> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public Medicine next() {
                return getMedicine(index++);
            }
        };
    }
}
