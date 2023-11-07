import java.util.ArrayList;
import java.util.Comparator;
public class Student {
    private String name;
    private int IDNumber;
    public Student(String name, int IDNumber){
        this.name = name;
        this.IDNumber = IDNumber;
    }
    public String getName() { return name; }
    public int getIDNumber() { return IDNumber; }
    public void setName(String name) { this.name = name; }
    public void setIDNumber(int IDNumber) { this.IDNumber = IDNumber; }
    @Override
    public String toString() {
        return "Name: " + this.name + " ID: " + this.IDNumber;
    }
}