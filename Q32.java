import java.util.HashMap;

public class Q32 {
    public static void main(String[] args) {
        int[]nums = {2, 5, 2, 5, 2};
        System.out.println(frequency(nums));

    }
    public static HashMap<Integer , Integer> frequency(int[]nums){
        HashMap<Integer,Integer> count = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){
            int currentNumber = nums[i];
            int oldCount = count.getOrDefault(currentNumber,0);
            count.put(currentNumber,oldCount+1);

        }
        return count;
    }
    
}
