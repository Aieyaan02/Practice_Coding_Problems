import java.util.Scanner;
public class Q5 {
    public static void elegible (int age){
        
        if(age >= 18){
            System.out.println("Elegible to vote");
        } else {
            System.out.println("You are not elegible to vote right now");
        }
    }
    public static void main (String[]args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Hello!! Please enter your age : ");
        int age = scan.nextInt();
        elegible(age);
        scan.close();


    }
}
