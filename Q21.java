public class Q21 {
    public static void main (String []arrgs){
        numTringle(5);
    }
    static void numTringle(int n){
        for(int row = n;row >=1;row--){
            for(int col = row;col <=n;col++){
                System.out.print(col);
                for (int j = row;j<=n;j++){
                    System.out.println(row);
                }
            }
            System.out.println();
        }
    }
}
