package be.zatenzu.patterns.builders.builder.withoutapi;

import java.time.LocalDate;

public interface PatientBuilder {

    Patient build();

    PatientBuilder firstname(String firstname);
    PatientBuilder lastname(String lastname);
    PatientBuilder birthDate(LocalDate birthDate);
    PatientBuilder address(String address);
}
