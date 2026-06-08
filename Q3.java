import java.util.Scanner;
public class Q3 {
    public static int greaterNum (int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }      
    }
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the a : ");
        int a = scan.nextInt();
        System.out.println("Enter the b : ");
        int b = scan.nextInt();
        System.out.println(greaterNum(a, b));
        scan.close();
    }   
}
