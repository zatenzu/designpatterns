package be.zatenzu.patterns.builders.builder.withoutapi;

public class Client {

    public static void main(String[] args) {
        PatientBuilder patientBuilder = new PatientBuilderImpl();
        PatientBuildDirector patientBuildDirector = new PatientBuildDirector(patientBuilder);
        Patient patient = patientBuildDirector.constructPatient();
    }

}
