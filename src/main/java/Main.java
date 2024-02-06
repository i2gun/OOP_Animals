import clinic.drugstore.Pharmacy;
import clinic.drugstore.PharmacyOne;
import clinic.drugstore.medicine.Medicine;
import clinic.drugstore.medicine.Penicillin;
import clinic.drugstore.medicine.Water;

public class Main {
    public static void main(String[] args) {


        Medicine[] drug1 = { new Water("distilled water", 12.0), new Penicillin("peniciline", 5.0) };
        Pharmacy drugstore1 = new PharmacyOne();
        drugstore1.addMedicine(drug1);


    }
}