public class Task2 {
    private int size; // количество элементов
    private Object[] elements;

    public Task2() { // конструктор
        elements = new Object[10];
                size = 0;
    }
    public void add(Object e) {
        if (size < elements.length) {
            elements[size] = e;
        }
        size++;
    }
    public Object get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (Object)elements[index];
    }

    public void getElements(){
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i].toString() + " ");
        }
    }
    public int size() {
        return size;
    }
};