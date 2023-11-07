import java.util.Comparator;
import java.util.ArrayList;
class SortingStudentsByGPA  implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        /*
        // Сравниваем студентов по возрастанию GPA
        if (student1.getGPA() < student2.getGPA()) {
            return -1; // student1 "меньше" student2
        } else if (student1.getGPA() > student2.getGPA()) {
            return 1; // student1 "больше" student2
        } else {
            return 0; // student1 и student2 равны
        }
        */
        return Double.compare(student1.getGPA(), student2.getGPA()); // student1 "меньше" student2
    }
//

    public void quickSort(ArrayList<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }
    private int partition(ArrayList<Student> students, int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() > pivot) {
                i++;
                Student tmp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, tmp);
            }
        }
        Student tmp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, tmp);
        return i + 1;
    }
}