package be.zatenzu.patterns.builders.builder.withoutapi;

import java.time.LocalDate;

public class PatientBuilderImpl implements PatientBuilder{
    private Patient patient;

    @Override
    public Patient build() {
        return this.patient;
    }

    @Override
    public PatientBuilder setFirstname(String firstname) {
        this.patient.setFirstname(firstname);
        return this;
    }

    @Override
    public PatientBuilder setLastname(String lastname) {
        this.patient.setLastname(lastname);
        return this;
    }

    @Override
    public PatientBuilder setBirthDate(LocalDate birthDate) {
        this.patient.setBirthDate(birthDate);
        return this;
    }

    @Override
    public PatientBuilder setAddress(String address) {
        this.patient.setAddress(address);
        return this;
    }
}
