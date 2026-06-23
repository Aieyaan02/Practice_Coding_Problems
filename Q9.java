import java.util.Scanner;
public class Q9 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();  
        scan.close();
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("The GCD of the two numbers is: " + num2);   
    } 
}
