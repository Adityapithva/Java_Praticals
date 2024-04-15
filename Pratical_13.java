public class Pratical_13 {
    public static void main(String[] args) {
        String str = "I am Aditya Pithva"; 
        char ch = str.charAt(2);
        System.out.println("Character at index 2:"+ch);
        System.out.println(str.contains("am"));
        String s = String.format("String is:%s",str);
        System.out.println(s);
        System.out.println("Length of the string is:"+str.length());
        String words[] = str.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
