class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void use() {
        System.out.println("Вы сели на стул " + getName());
    }
}