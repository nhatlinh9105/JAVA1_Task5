package Task5;

public class TestStudent {
    public static void main(String [] args) {
        
        Student a1 = new Student(); //spell-checker: Disable
        System.out.println("Name's student is: " + a1.getName());
        System.out.println("Gpa's student is: " + a1.getGpa());

        Student a2 = new Student("Bill");
        System.out.println("Name's student is: " + a2.getName());
        System.out.println("Gpa's student is: " + a2.getGpa());

        Student a3= new Student("Susan", 3.9);
        System.out.println("Name's of student is: " + a3.getName());
        System.out.println("Gpa's Student is: " + a3.getGpa());
    }
}
