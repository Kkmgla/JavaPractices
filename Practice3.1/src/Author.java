import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author (String n, String e, char g){
        email = e;
        name = n;
        gender = g;
    }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public char getGender() { return gender; }
    public void setEmail(String email) { this.email = email; }
    public String toString(){
        return "Author's name: " + this.name + "\nEmail: " + this.email + "\nGender: " + this.gender;
    }
}
