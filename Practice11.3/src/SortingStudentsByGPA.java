import java.util.ArrayList;
import java.util.Collections;
public class SortingStudentsByGPA {

    public static void mergeSort(ArrayList<Student>students, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // Рекурсивно сортируем левую и правую половины
            mergeSort(students, left, middle);
            mergeSort(students, middle + 1, right);

            // Объединяем две отсортированные половины
            merge(students, left, middle, right);
        }
    }

    public static void merge(ArrayList<Student>students, int left, int middle, int right) {
        // Определяем размер временных подмассивов
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Создаем временные подмассивы
        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        // Копируем данные во временные подмассивы leftArray[] и rightArray[]
        for (int i = 0; i < n1; i++) {
            leftArray[i] = students.get(left + i);
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = students.get(middle + 1 + j);
        }

        // Индексы подмассивов
        int i = 0, j = 0;

        // Индекс исходного массива
        int k = left;

        // Слияние временных подмассивов обратно в основной массив
        while (i < n1 && j < n2) {
            if (leftArray[i].getGPA() <= rightArray[j].getGPA()) {
                students.set(k, leftArray[i]);
                /* array[k] = leftArray[i];*/
                i++;
            } else {
                students.set(k, rightArray[j]);
                /*array[k] = rightArray[j];*/
                j++;
            }
            k++;
        }

        // Копирование оставшихся элементов leftArray[], если таковые есть
        while (i < n1) {
            students.set(k, leftArray[i]);
            /*array[k] = leftArray[i];*/
            i++;
            k++;
        }

        // Копирование оставшихся элементов rightArray[], если таковые есть
        while (j < n2) {
            students.set(k, rightArray[j]);
            /*array[k] = rightArray[j];*/
            j++;
            k++;
        }
    }
}