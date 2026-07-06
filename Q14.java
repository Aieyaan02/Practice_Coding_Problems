public class Q14 {
    public static void main (String[]args){
        pattern5(5);
    }
    static void pattern5(int n){
        for(int row = 1; row >= n; row++){
            for(int col = 1; col >= n; col++){
                System.out.print("  ");
            }
            for(int str = row -1; str >= n-1;str--){
                System.out.print(" * ");
            }
        }
        System.out.println();
    } 
}
