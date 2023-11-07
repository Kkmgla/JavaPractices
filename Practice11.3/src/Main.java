import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("Jonh", 4.9));
        students1.add(new Student("Josh", 3.0));
        students1.add(new Student("Jack", 4.0));
        students1.add(new Student("Jarred", 3.7));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("Ashley", 5.0));
        students2.add(new Student("Antony", 3.1));
        students2.add(new Student("Alex", 4.2));
        students2.add(new Student("Alice", 2.9));

        students1.addAll(students2);

        SortingStudentsByGPA ob1 = new SortingStudentsByGPA();
        ob1.mergeSort(students1, 0, students1.size() - 1);

        for (Student student : students1) {
            System.out.println(student);
        }
    }
}
