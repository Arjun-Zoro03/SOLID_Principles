package com.arjun.badcode;

/*This is violating the Open/Close Principle as everytime we want to add
a new type of the  Civil Engineer we have to change the code of setSalary() method*/

public class AssigningSalaryToCivilEngineer {
    public void setSalary(CivilEngineer civilEngineer){
        if (civilEngineer.getTypeOfWork() == "Structural Civil Engineer")
            civilEngineer.setSalary(700000);
        else  if(civilEngineer.getTypeOfWork() == "Transport Civil Engineer")
            civilEngineer.setSalary(600000);
        else
            civilEngineer.setSalary(150000);
    }
}
