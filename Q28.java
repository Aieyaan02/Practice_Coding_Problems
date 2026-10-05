import java.util.HashSet;

public class Q28 {
    public static void main(String[] args) {
        int []nums = {8,3,4,8};
        System.out.println(checkDuplicate(nums));
        
    }
    public static boolean checkDuplicate (int[]nums){
        HashSet<Integer> number = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            if(number.contains(nums[i])){
                return true;

            }
            number.add(nums[i]);
        }

        return false;
    }
    
}
