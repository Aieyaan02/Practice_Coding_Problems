import java.util.HashMap;
import java.util.Arrays;

public class Q36 {
    public static void main(String[] args) {
        int []nums = {4, 7, 9, 2};
        System.out.println(Arrays.toString(twoSum(nums,11)));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static int[] twoSum (int[]nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // Return an empty array if no solution is found
        
    }
        
 }

