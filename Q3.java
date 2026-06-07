public class Q3 {
    public static int greaterNum (int a, int b){
        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        return greaterNum(a, b);
        
    }
    
    
}
