import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Faust", 520);
        Book b2 = new Book("Saint Antoine", 560);
        Book b3 = new Book("Dots");
        b3.setSize(300);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
