import java.util.Scanner;
public class Q9 {
    public static int commonDivisor (int a, int b){
        int GCD = 1;
        for (int i = 0, i <= a && i <= b; i++){
            if (a % i == 0 && b % i == 0){
                GCD = i;
            }


        }

        return commonDivisor(a, b);

    }
    public static void main(String[] args) {
        
    }
    
}
