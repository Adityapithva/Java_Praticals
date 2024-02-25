import java.util.Scanner;
public class Pratical_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        while(a > 0){
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;
        }
        System.out.println("Reversed number is:"+rev);
    }
}