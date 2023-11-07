class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Бульдог по имени " + getName() + " лает: Гру-гру!");
    }
}