public class Pratical_4 {
    public static void main(String[] args) {
        int[][] mat1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] mat2 = {
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };
        int[][] ans = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ans[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Addition of 3*3 matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}