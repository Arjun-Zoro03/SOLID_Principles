package com.arjun.goodcode;

class TransportationCivilEngineer extends CivilEngineer{
    public TransportationCivilEngineer(){
        super.setTypeOfWork("Transportation Civil Engineer");
    }

    @Override
    public void setSalary() {
        super.setSalary(600000);
    }
}
