import com.sun.tools.javac.Main;
import myPackage.*;

public class MVCPaternDemo {
    public static void main(String[] args) {
        Employee model1 = new Employee();
        EmployeeView view1 = new EmployeeView();
        EmployeeController controller1 = new EmployeeController(model1,view1);
        controller1.setEmployeeName("Josh");
        controller1.setEmployeeSalary(1500);
        controller1.setEmployeeBonus(120);
        controller1.updateEmployeeview();
    }
}
