package be.zatenzu.patterns.builders.builder.withoutapi;

import java.time.LocalDate;

public class PatientBuilderImpl implements PatientBuilder{

    private Patient patient;

    public PatientBuilderImpl(){
        this.patient = new Patient();
    }

    @Override
    public Patient build() {
        Patient patient = new Patient();
        applyTo(patient);
        return patient;
    }

    @Override
    public PatientBuilder firstname(String firstname) {
        this.patient.setFirstname(firstname);
        return this;
    }

    @Override
    public PatientBuilder lastname(String lastname) {
        this.patient.setLastname(lastname);
        return this;
    }

    @Override
    public PatientBuilder birthDate(LocalDate birthDate) {
        this.patient.setBirthDate(birthDate);
        return this;
    }

    @Override
    public PatientBuilder address(String address) {
        this.patient.setAddress(address);
        return this;
    }

    private void applyTo(Patient patient){
        patient.setFirstname(this.patient.getFirstname());
        patient.setLastname(this.patient.getLastname());
        patient.setBirthDate(this.patient.getBirthDate());
        patient.setAddress(this.patient.getAddress());
    }

}
