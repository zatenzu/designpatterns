package be.zatenzu.patterns.builders.builder.withoutapi;

import java.time.LocalDate;

public interface PatientBuilder {

    Patient build();

    PatientBuilder setFirstname(String firstname);

    PatientBuilder setLastname(String lastname);

    PatientBuilder setBirthDate(LocalDate birthDate);

    PatientBuilder setAddress(String address);

}
