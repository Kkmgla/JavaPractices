package myPackage;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName(String name){ model.setName(name);}
    public String getEmployeeName() { return model.getName();}
    public void setEmployeeSalary(int salary) { model.setSalary(salary);}
    public int getEmployeeSalary() { return model.getSalary();}
    public void setEmployeeBonus(int bonus) { model.setBonus(bonus);}
    public int getEmployeeBonus() { return model.getBonus();}
    public void updateEmployeeview()
    {
        view.printEmployeeDetails(getEmployeeName(),getEmployeeSalary(),getEmployeeBonus());
    }
}