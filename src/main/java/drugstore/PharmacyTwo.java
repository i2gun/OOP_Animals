package clinic.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Medicine> {
    private List<Medicine> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Medicine... components) {
        for(Medicine c : components){
            this.components.add(c);
        }
    }

    @Override
    public Iterator<Medicine> iterator() {
        return new Iterator<Medicine>() { //Анонимный класс

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Medicine next() {
                return components.get(index++);
            }
        };
    }
}
