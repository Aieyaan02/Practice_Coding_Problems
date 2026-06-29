public class Q13 {
    public static void main (String[]args){
        pattern4(5);
    }
    static void pattern4(int n){
        for(int row = n; row >= 1; row--){
            for(int col = 1; col <= row ; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    } 
}
