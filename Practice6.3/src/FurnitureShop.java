public class FurnitureShop {
    private String name;

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void sellFurniture(Furniture furniture) {
        System.out.println(name + " продает " + furniture.getName() + " за " + furniture.getPrice() + " рублей.");
    }
    public static void main(String[] args) {
        Chair chair = new Chair("Кресло", 500);
        Sofa sofa = new Sofa("Мягкий диван", 1000, 3);

        FurnitureShop shop = new FurnitureShop("Мебельный магазин");

        chair.use();
        sofa.use();

        shop.sellFurniture(chair);
        shop.sellFurniture(sofa);
    }
}