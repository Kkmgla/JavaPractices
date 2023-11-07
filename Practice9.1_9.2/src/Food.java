public class Food implements Nameable, Priceable{
    protected String name;
    protected int price;
    public Food(String name){
        this.name = name;
    }
    public Food(int price){
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
}
