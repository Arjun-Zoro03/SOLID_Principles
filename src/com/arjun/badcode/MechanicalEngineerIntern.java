package com.arjun.badcode;

/*This is violating the Liskov Substitution Principle as the Bonus of an Intern is 0, so setBonus() doesn't add any value,
 hence the base class is not completely substituted by the derived class*/
public class MechanicalEngineerIntern extends MechanicalEngineerEmployee{

    @Override
    public void setBaseSalary(int baseSalary){
        super.setBaseSalary(baseSalary);
    }

    //This method is being forced on the child class
    @Override
    public void setBonus(int bonus){
        super.setBonus(0);
    }

    @Override
    public int calculateIncome(){
        return super.calculateIncome();
    }
}
