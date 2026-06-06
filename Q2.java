import java.util.Scanner;
public class Q2 {
    public static void SumOdd (int n){
        int a = 0;
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0){
                a = a + i;
            } 
        }  
        System.out.println(a);
        
    }
    public static void main (String[]agrs){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        SumOdd(n);
        scan.close();
    }
    
}
