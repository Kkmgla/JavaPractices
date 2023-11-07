public class Furniture implements Nameable,Priceable{
    protected String name;
    protected int price;
    public Furniture(String name){
        this.name = name;
    }
    public Furniture(int price){
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
}
