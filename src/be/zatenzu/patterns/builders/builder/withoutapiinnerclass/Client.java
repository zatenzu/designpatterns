package be.zatenzu.patterns.builders.builder.withoutapiinnerclass;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        Patient patient = Patient.PatientBuilder.create().
                address("adresss").
                firstname("thom").
                lastname("darde").
                birthDate(LocalDate.now()).
                build();
    }
}
