import java.util.Scanner;
public class prg8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a>b && a>c){
            System.out.println(a+" is gratest");
        }else if(b>c){
            System.out.println(b+" is gratest");
        }else{
            System.out.println(c+" is gratest");
        }
    }
}