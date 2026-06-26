public class Q12 {
    public static void main(String[]args){
        pattern3(5, 4);
    }
    static void pattern3(int n,int m){
        for(int row = 1; row <= n;row++){ 
            for(int col = 1;col <= m;col++){
                if(row == 1 || row == n-1|| col == 1 || col==m-1){
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
