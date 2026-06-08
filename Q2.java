import java.util.Scanner;
public class Q2 {
    public static void SumOdd (int n){
        int a = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0){
                a = a + i; // I need to update the value of a, 
                             // so I need to assign the new value to a.
            } 
        }  
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + a);
       
        
    }
    public static void main (String[]agrs){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        SumOdd(n);
        scan.close();
    }
    
}
