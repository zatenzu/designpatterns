package be.zatenzu.patterns.builders.builder.withoutapiinnerclass;

import java.time.LocalDate;

public class Patient {

    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private String address;
    //...

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class PatientBuilder{

        private Patient patient;

        public static PatientBuilder create(){
            return new PatientBuilder();
        }

        private PatientBuilder(){
            this.patient = new Patient();
        }

        public PatientBuilder firstname(String firstname){
            this.patient.firstname = firstname;
            return this;
        }
        public PatientBuilder lastname(String lastname){
            this.patient.lastname = lastname;
            return this;
        }
        public PatientBuilder birthDate(LocalDate birthDate){
            this.patient.birthDate = birthDate;
            return this;
        }
        public PatientBuilder address(String address){
            this.patient.address = address;
            return this;
        }

        public Patient build(){
            Patient patient = new Patient();
            applyTo(patient);
            return this.patient;
        }

        private void applyTo(Patient patient){
            patient.setAddress(this.patient.address);
            patient.setBirthDate(this.patient.birthDate);
            patient.setFirstname(this.patient.firstname);
            patient.setLastname(this.patient.lastname);
        }


    }

}
