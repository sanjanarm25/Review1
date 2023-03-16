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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
