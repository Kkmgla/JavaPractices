class Sofa extends Furniture {
    private int seats;

    public Sofa(String name, double price, int seats) {
        super(name, price);
        this.seats = seats;
    }

    @Override
    public void use() {
        System.out.println("Вы расслабились на диване " + getName() + " с " + seats + " местами");
    }
}