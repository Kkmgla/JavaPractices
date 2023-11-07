package myPackage;

public class StudentController {
    private Student model = new Student();
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String RollNo) {
        model.setRollNo(RollNo);
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }
    public void updateView() {
        view.printUserDetails(getStudentName(), getStudentRollNo());
    }

}
