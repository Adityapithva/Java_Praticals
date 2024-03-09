public class Prac{
    public static void main(String[] args) {
        int a[][] = new int[3][0];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[0][0] = 1;
        a[1][0] = 1;
        a[1][1] = 2;
        a[2][0] = 1;
        a[2][1] = 2;
        a[2][2] = 3;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}