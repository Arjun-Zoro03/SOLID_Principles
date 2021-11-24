package com.arjun.goodcode;

public class StructuralCivilEngineer extends CivilEngineer{

    public StructuralCivilEngineer(){
        super.setTypeOfWork("Structural Civil Engineer");
    }

    @Override
    public void setSalary() {
        super.setSalary(700000);
    }
}
