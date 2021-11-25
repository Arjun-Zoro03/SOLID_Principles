package com.arjun.goodcode;

public class CivilEngineer implements Salary{
    private String typeOfWork;
    private int salary;

    public void setSalary() {
        System.out.println("Every Civi Engineer has a different salary.");
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork= typeOfWork;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

}
