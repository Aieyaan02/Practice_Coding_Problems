import java.util.Scanner;
public class Q7 {
    public static void main (String[]args){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input == 1){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();
            if (n > 0){
                positive++;
            } else if (n < 0){
                negative++;
            } else {
                zero++;
            }
            scan.close();     
            
        }
        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);
        System.out.println("Number of zeros: " + zero);
     }  
    
    }



