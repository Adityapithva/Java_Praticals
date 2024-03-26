import java.util.*;
public class Pratical_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int count = 0;
        int num = 2;
        System.out.print("Enter value of N:");
        int n = sc.nextInt();
        System.out.println("First "+n+" prime numbers are:");
        while(count < n){
            boolean prime = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
}