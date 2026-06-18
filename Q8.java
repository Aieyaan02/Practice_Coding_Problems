import java.util.Scanner;
public class Q8 {
    public static double raisePower (double a, double n){
        return Math.pow(a,n);
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        double a = scan.nextDouble();
        System.out.println("Enter the exponent: ");
        double n = scan.nextDouble();
        System.out.println(a + " raised to the power of " + n + " is: " + raisePower(a, n));
        scan.close();
    }
}

