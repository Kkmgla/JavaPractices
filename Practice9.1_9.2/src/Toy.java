public class Toy implements Nameable,Priceable{
    protected String name;
    protected int price;
    public Toy(String name){
        this.name = name;
    }
    public Toy(int price){
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
       return this.price;
    }
}
