public class Q14 {
    public static void main (String[]args){
        pattern5(8);
    }
    static void pattern5(int n){
        
        for(int row = n-1; row >= 1; row--){
            for(int col = 1; col < row; col++){
                System.out.print("  ");
            }
            for(int s = n; s >= row;s++){
                System.out.print(" * ");
            }
        }
        System.out.println();
    } 
}
