public class Q14 {
    public static void main (String[]args){
        pattern5(5);
    }
    static void pattern5(int n){
        for(int row = n; row <=1; row--){
            for(int col = 1; col < row; col++){
                System.out.print(" ");
            }
            for(int i = n; i <= row;i++){
                System.out.print(" * ");
            }
        }
        System.out.println();
    } 
}
