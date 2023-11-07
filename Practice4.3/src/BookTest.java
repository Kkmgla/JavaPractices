public class BookTest {
    public static void main(String[] args) {

        Book myBook = new Book("Java Programming", "Jon Jones", 1999);

        System.out.println("Название книги: " + myBook.getTitle());
        System.out.println("Автор книги: " + myBook.getAuthor());
        System.out.println("Год написания: " + myBook.getYear());

        myBook.setTitle("New Java Programming");
        System.out.println("Новое название книги: " + myBook.getTitle());
    }
}