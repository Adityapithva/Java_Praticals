import java.util.*;
public class Pratical_29 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("alpha");
        colors.add("pink");
        colors.add("orange");
        colors.add("white");
        colors.add("black");
        System.out.println("Iterating hashset using for-each loop:");
        for (String str : colors) {
            System.out.println(str);
        }
    }
}
