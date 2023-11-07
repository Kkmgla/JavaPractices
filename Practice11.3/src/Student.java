import java.util.Comparator;
public class Student {
    private String name;
    private double GPA;
    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }
    public String getName() { return name; }
    public double getGPA() { return GPA; }
    public void setName(String name) { this.name = name; }
    public void setGPA(double GPA) { this.GPA = GPA; }
    @Override
    public String toString() {
        return "Name: " + this.name + ", GPA: " + this.GPA;
    }
}
