package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    public void addPatient(Patient patient){
        patients.add(patient);

    }
}
