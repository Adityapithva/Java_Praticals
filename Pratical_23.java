import java.util.Scanner;
public class Pratical_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Can't divide a number by zero..!");
        }
    }
}
