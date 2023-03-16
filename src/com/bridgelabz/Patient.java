package com.bridgelabz;

enum Department{
    ONCOLOGY,NEUROLOGY,CARDIOLOGY,GYNECOLOGY
}

public class Patient {

    private String name;
    private int age;
    private String phoneNumber;
    private String city;
    private String state;
    private Department department;

    public Patient(String name, int age, String phoneNumber, String city, String state, Department department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.department=department;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public String getCity() {
        return city;
    }


    public String getState() {
        return state;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" +name +"\n" + ",age=" +age +",phoneNumber=" +phoneNumber +"\n" +",city=" + city + "\n" +",state=" +state + "\n" + "\n" + ",department=" +department +"}";

    }
}
