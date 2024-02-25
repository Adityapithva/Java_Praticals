import java.util.Scanner;
class Student{
    int Enroll_no;
    String Name;
    void display(){
        System.out.println("Your Enrollment No.:"+Enroll_no);
        System.out.println("Name:"+ Name);
    }
}
public class Pratical_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("Enter details of student 1(Enroll_No,Name):");
        s1.Enroll_no = sc.nextInt();
        s1.Name = sc.next();
        System.out.println("Enter details of student 2(Enroll_No,Name):");
        s2.Enroll_no = sc.nextInt();
        s2.Name = sc.next();
        System.out.println("Enter details of student 3(Enroll_No,Name):");
        s3.Enroll_no = sc.nextInt();
        s3.Name = sc.next();
        System.out.println("Displaying details of Students:");
        s1.display();
        s2.display();
        s3.display();
    }
}