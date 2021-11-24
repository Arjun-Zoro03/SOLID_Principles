package com.arjun.badcode;

//This is violating Single Responsibility Principle as more than one responsibility has been given to the same class.
public class SoftwareEngineer extends Engineer{

    public void developFrontEndCode(){
        System.out.println("Working on Front-End Development of the Application.");
    }

    public void developBackEndCode(){
        System.out.println("Working on Back-End Development of the Application.");
    }

    public void testCode(){
        System.out.println("Working on Quality Assurance of the code.");
    }
}
