package clinic;

import clinic.client.Owner;
import clinic.staff.Doctor;
import clinic.staff.Nurse;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    Integer clinicNumber;
    List<Doctor> doctors;
    List<Nurse> nurses;
    List<Owner> owners;

    public VeterinaryClinic(Integer clinicNumber) {
        this.clinicNumber = clinicNumber;
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
        this.owners = new ArrayList<>();
    }

    public void addDoctor(Doctor doc) {
        doctors.add(doc);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
