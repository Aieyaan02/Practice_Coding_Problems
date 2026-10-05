import java.util.HashSet;

public class Q27 {
    public static void main (String[]agrs){
        int[]nums = {4, 7, 3, 9};
        System.out.println(Duplicate(nums));
    }
    public static boolean Duplicate(int[] num) {
        HashSet<Integer> number = new HashSet<>();
       
        for(int i = 0;i < num.length;i++){
            if(number.contains(num[i])){
                return true;
            } 
                number.add(num[i]);
            
        }
        return false;
        
    }

}
