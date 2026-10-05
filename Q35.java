import java.util.HashMap;

public class Q35 {
    public static void main(String[] args) {
        int []nums = {4, 7, 4, 9, 4};
        System.out.println(reAppear(nums));
    }
    public static boolean reAppear(int[]nums){
        HashMap<Integer, Integer> number = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int countNumber = nums[i];
            int oldCount = number.getOrDefault(countNumber, 0);
            int newCount = (oldCount + 1);
            number.put(countNumber, newCount);
            if(newCount >= 3){
                return true;
            }
        }
        return false;
    }
}
