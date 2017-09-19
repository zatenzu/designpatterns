package be.zatenzu.patterns.builders.builder.withoutapi;

import java.time.LocalDate;

public class PatientBuildDirector {

    private PatientBuilder patientBuilder;

    public PatientBuildDirector(PatientBuilder patientBuilder) {
        this.patientBuilder = patientBuilder;
    }

    public Patient constructPatient(){
        return this.patientBuilder.setAddress("address").
                setBirthDate(LocalDate.now()).
                setFirstname("firstname").
                setLastname("lastname").
                build();
    }
}
