import java.io.*;
import java.util.*;
public class Pratical_27 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("example.txt");
            fw.write("Files in Java might be tricky, but it is fun enough!");
            fw.close();
            System.out.println("Successfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        try{
            File obj = new File("example.txt");
            Scanner sc = new Scanner(obj);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
