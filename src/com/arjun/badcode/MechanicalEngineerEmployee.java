package com.arjun.badcode;

public class MechanicalEngineerEmployee extends Engineer {
    private int baseSalary;
    private int bonus;

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int calculateIncome(){
        return bonus+baseSalary;
    }
}
