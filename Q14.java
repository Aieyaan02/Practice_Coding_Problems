public class Q14 {
    public static void main (String[]args){
        pattern5(5);
    }
    static void pattern5(int n){
        for(int row = n; row >= 1; row++){
            for(int col = row; col <= row; col++){
                System.out.print(" * ");
            }
            for(int s = row; s >= row;s++){
                System.out.print(" * ");
            }
        }
        System.out.println();
    } 
}
