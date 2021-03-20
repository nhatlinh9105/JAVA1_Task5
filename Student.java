package Task5;

public class Student {
    private String name;
    private double gpa;

    public Student(){
        name = "Paul Lee";
        gpa = 3.5;
    }
     
    public Student(String Name) {
        name = Name;
        gpa = 3.0;
    }

    public Student(String Name, Double Gpa) {
        name = Name;
        gpa = Gpa;
    }

    public String getName(){
        return name;
    }
    public Double getGpa(){
        return gpa;
    }
}
