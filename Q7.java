import java.util.Scanner;
public class Q7 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int positive = scan.nextInt();
        int negative = scan.nextInt();
        int zero = 0;
        if(positive > 0){
            System.out.println("Positive");
        } else if (negative < 0){
            System.out.println("Negative");
        } else {
            System.out.println(zero);
        }
        
    
    }

}
    

