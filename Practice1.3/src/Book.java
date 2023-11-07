import java.lang.*;
public class Book {
    private String name;
    private int size;
    public Book(String c, int s){
        name = c;
        size = s;
    }
    public Book(String c){
        name = c;
        size = 1;
    }
    public Book(){
        name = "Red";
        size = 1;
    }
    public void setColor(String color) {
        this.name = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return "Book's name is " + this.name + ", size " + this.size + " pages";
    }
}
