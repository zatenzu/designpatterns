package be.zatenzu.patterns.builders.builder.withoutapi;

public class Client {

    public static void main(String[] args) {
        PatientBuildDirector patientBuildDirector = new PatientBuildDirector(new PatientBuilderImpl());
        Patient p = patientBuildDirector.constructPatient();
        System.out.println(p);
    }
}
