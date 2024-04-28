import java.util.*;
public class Pratical_30 {
    public static void main(String[] args) {
        HashMap<Integer,String> std = new HashMap<Integer,String>();
        std.put(1,"Aditya");
        std.put(2,"Bhargav");
        std.put(3,"Jay");
        std.put(4,"Darshan");
        std.put(5,"Manthan");
        for(int i=1;i<=5;i++){
            System.out.println("Enroll no.:" + i +" Name:"+std.get(i));
        }
    }
}
