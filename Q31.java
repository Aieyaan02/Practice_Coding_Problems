import java.util.HashMap;
public class Q31 {
    public static void main(String[] args) {
        int[]nums = {4, 7, 4, 9, 7, 4};
        System.out.println(sameNum(nums, 4));
    }
    public static int sameNum(int[]nums, int target){
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
           int currentNumber = nums[i];
           int oldCount = count.getOrDefault(currentNumber,0);
        count.put(currentNumber,oldCount + 1);
        }
        return count.getOrDefault(target, 0);
    }   
}
