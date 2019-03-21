package exercise;
//     杨辉三角   10行
public class _33_PescalTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(triangle(i,j) + " ");
            }
            System.out.println();
        }


    }
    private static int triangle(int i,int j){
        if ( j == 1 || i == j){
            return 1;
        }
        else {
            return triangle(i-1,j-1) + triangle(i-1,j);
        }



    }
}
