import java.util.Comparator;

public class Main {
    public static <T> void insertionSort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student st1 = new Student("Andrew", 12);
        Student st2 = new Student("John", 3);
        Student st3 = new Student("Matthew", 41);
        Student st4 = new Student("Jane", 11);
        Student st5 = new Student("Julia", 20);
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
        students[4] = st5;
        for (Student iterator: students) System.out.println(iterator);
        System.out.println();
        insertionSort(students, Comparator.comparingInt(Student::getIDNumber));
        for (Student iterator: students) System.out.println(iterator);
    }
}