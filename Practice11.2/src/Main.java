import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jonh", 4.9));
        students.add(new Student("Josh", 3.0));
        students.add(new Student("Jack", 4.0));
        students.add(new Student("Jarred", 3.7));

        SortingStudentsByGPA Sort = new SortingStudentsByGPA();
        Sort.quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
