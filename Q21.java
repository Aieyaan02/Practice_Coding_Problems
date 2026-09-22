public class Q21 {
    public static void main (String []arrgs){
        numTringle(5);
    }
    static void numTringle(int n){
        for(int row = n;row >=1;row--){
            for(int col = row;col <=n;col++){
                System.out.print(col);
            }
            System.out.println();
            System.out.println();
        }
    }
}
