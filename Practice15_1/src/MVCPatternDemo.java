import myPackage.*;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Student model1 = new Student();
        StudentView view1 = new StudentView();
        StudentController controller1 = new StudentController(model1, view1);

        Student model2 = retriveCourseFromDatabase();
        StudentView view2 = new StudentView();
        StudentController controller2 = new StudentController(model2, view2);

        // Устанавливаем имя пользователя через контроллер
        controller1.setStudentName("John Doe");
        controller1.setStudentRollNo("FR45");

        // Обновляем представление
        controller1.updateView();
        controller2.updateView();
    }
    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Jack");
        student.setRollNo("IL67");
        return student;
    }
}