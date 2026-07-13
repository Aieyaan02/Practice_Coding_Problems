public class Q14 {
    public static void main (String[]args){       
        pattern5(5);           
    }   
    static void pattern5(int n){
        for(int row = 1; row >= n;row++){
            for(int col = 1; col >= n-1;col++){
                System.out.print("   ");
            }
            for(int str = 1;str >= n;str--){
                System.out.print(" * ");
            }          
        }             
        System.out.println();
    } 
}
