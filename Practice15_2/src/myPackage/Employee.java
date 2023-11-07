package myPackage;

public class Employee {

    private String name;
    private int salary;
    private int bonus;

    public String getName() {
        return name;
    }
    public int getBonus() {
        return bonus;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}