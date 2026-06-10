import java.util.Scanner;
public class Q4 {
    public static Double circumference (Double radius){
        return 2 * Math.PI * radius;
        
    }
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = scan.nextDouble();
        System.out.println("The circumference of the circle is: " + circumference(r));
        scan.close();
    }
    
}
