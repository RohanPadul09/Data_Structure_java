import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int maths;
    int java;
    int ds;

      
    Student(String name, int rollNo, int maths, int java, int ds) {
        this.name = name;
        this.rollNo = rollNo;
        this.maths = maths;
        this.java = java;
        this.ds = ds;
    }

     

    int calculateTotal() {
        return maths + java + ds;
    }

   
    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    // Display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Maths: " + maths);
        System.out.println("Java: " + java);
        System.out.println("DS: " + ds);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }
}

public class student_avg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll no: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Java marks: ");
        int java = sc.nextInt();

        System.out.print("Enter DS marks: ");
        int ds = sc.nextInt();

        Student s1 = new Student(name, rollNo, maths, java, ds);

        System.out.println("\n--- Student Details ---");
        s1.display();

        sc.close();
    }
}