import java.util.*;
public class Main {//task1
    public static <E> void ArrayToArrayList(E[] a, ArrayList<E>lst) {
        for (E e : a) lst.add(e);
        //for (Object o : lst) System.out.println(o); строка для 4 задания
    }
    public static void main(String[] args) {
        ArrayList<Object> lst = new ArrayList<Object>();
        Integer[] intArray = {55, 66};
        String[] strArray = {"one", "two", "three"};
        ArrayToArrayList(intArray, lst);
        for (Object i : lst) System.out.println(i);

        ArrayToArrayList(strArray, lst);
        for (Object i : lst) System.out.println(i);
    }

}