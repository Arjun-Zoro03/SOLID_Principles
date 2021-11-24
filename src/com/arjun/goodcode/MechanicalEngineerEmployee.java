package com.arjun.goodcode;

public class MechanicalEngineerEmployee extends MechanicalEngineer{
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int calculateIncome(){
        return bonus+super.getBaseSalary();
    }
}
