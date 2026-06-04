import java.util.Scanner;
public class Q1 {
    public static double countAverage (int a,int b,int c){
        double sum = a + b + c;
        double average = sum/3;

        System.out.println(average);
        return average;
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println("Average of given number : " + countAverage(a, b, c) );

    }
    
}
