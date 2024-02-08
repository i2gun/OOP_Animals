import clinic.drugstore.Pharmacy;
import clinic.drugstore.PharmacyOne;
import clinic.drugstore.PharmacyTwo;
import clinic.drugstore.medicine.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicine[] drug1 = { new Water("distilled water", 12.0), new Penicillin("peniciline", 5.0) };
        Medicine[] drug2 = { new Water("distilled water", 8.0), new Novocain("novocain", 4.0) };
        Medicine[] drug3 = { new Water("distilled water", 4.4), new Paracetamol("paracetamol", 1.0) };
        Medicine[] drug4 = { new Water("distilled water", 5.0), new Penicillin("peniciline", 2.5) };

        List<Pharmacy> drugstores = new ArrayList<>();
        Pharmacy drugstore0 = new PharmacyOne("drugstore0");
        drugstore0.addMedicine(drug2);
        drugstore0.addMedicine(drug3);
        drugstore0.addMedicine(drug4);
        Pharmacy drugstore1 = new PharmacyOne("drugstore1");
        drugstore1.addMedicine(drug1);
        drugstore1.addMedicine(drug1);
        drugstore1.addMedicine(drug2);
        Pharmacy drugstore2 = new PharmacyTwo("drugstore2");
        drugstore2.addMedicine(drug2);
        drugstore2.addMedicine(drug3);
        drugstore2.addMedicine(drug4);
        drugstore2.addMedicine(drug4);

        drugstores.add(drugstore0);
        drugstores.add(drugstore1);
        drugstores.add(drugstore2);

        System.out.println(drugstores);
        System.out.println();

        Collections.sort(drugstores);
        System.out.println(drugstores);
        System.out.println();

        Collections.sort(drugstores, Comparator.comparingDouble(Pharmacy::getSumWeight));
        System.out.println(drugstores);

    }
}