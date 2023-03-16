package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

public class HospitalMain {
    public static void main(String[] args) {


        Hospital hospital1 = new Hospital("Shatayu Hospital");
        Hospital hospital2 = new Hospital("Sanjeevani Hospital");

        Map<String,Hospital>hospitalMap=new HashMap<>();
        hospitalMap.put(hospital1.getName(), hospital1);
        hospitalMap.put(hospital2.getName(), hospital2);

//        System.out.println(hospital1.getName());
//        System.out.println(hospital2.getName());
//
        //Creating a patients
        Patient patient1=new Patient("abc",30,"12345","kolhapur","Maharashtra",Department.ONCOLOGY);
        Patient patient2=new Patient("abcd",31,"123456","Sangli","Maharashtra",Department.NEUROLOGY);
        Patient patient3=new Patient("abcde",32,"1234567","Pune","Maharashtra",Department.CARDIOLOGY);
        Patient patient4=new Patient("abcdef",33,"12345678","Mumbai","Maharashtra",Department.GYNECOLOGY);

        //Adding a patients to the hospitals
        hospital1.addPatient(patient1);
        hospital1.addPatient(patient2);
        hospital2.addPatient(patient3);
        hospital2.addPatient(patient4);

//        System.out.println("Patients in Shatayu Hospital: ");
//        for (Patient patient :hospital1.getPatients()){
//            System.out.println(patient.getName() + " : " + patient.getDepartment());
//        }
//
//        System.out.println("Patients in Sanjeevani Hospital: ");
//        for (Patient patient :hospital2.getPatients()){
//            System.out.println(patient.getName() + " : " + patient.getDepartment());
//        }

        for (Hospital hospital: hospitalMap.values()){
            System.out.println(hospital);
        }

    }
}
