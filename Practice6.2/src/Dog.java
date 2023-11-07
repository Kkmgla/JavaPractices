abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Рекс", 3);
        Bulldog bulldog = new Bulldog("Макс", 5);

        labrador.bark();
        System.out.println("Имя лабрадора: " + labrador.getName());
        System.out.println("Возраст лабрадора: " + labrador.getAge());

        bulldog.bark();
        System.out.println("Имя бульдога: " + bulldog.getName());
        System.out.println("Возраст бульдога: " + bulldog.getAge());
    }
}
