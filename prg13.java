import java.util.Scanner;

public class prg13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search Element :");
        int tar = sc.nextInt();
        int ind;
        boolean a;
        for(int i=0;i<n;i++){
            if(arr[i] == tar){
                ind = i;
                System.out.println("Element found in index :"+ind);
            }
        }

    }
}


