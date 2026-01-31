import java.util.Scanner;
public class prg14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        System.out.println("Matrix 2*2: \n");
        System.out.println("Enter matrix 1 elements:  \n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix s elements:  \n");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n The sum of the matrix is : \n");
        int[][] summat = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                summat[i][j] = arr1[i][j]+arr2[i][j];
                System.out.println(summat[i][j]);
            }
        }
    }
}
