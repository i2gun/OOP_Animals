package clinic.drugstore;

import clinic.drugstore.medicine.Medicine;
import java.util.Iterator;

public class PharmacyTwo extends Pharmacy implements Iterable<Medicine> {

    private int index = 0;

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

    @Override
    public int compareTo(Pharmacy other) {
        return Double.compare(this.getSumWeight(), other.getSumWeight());
    }
}
