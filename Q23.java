public class Q23 {
    public static void main (String[]args){
        int[] numbers = {4, 7, 2, 5};
       // int answer = findLargest(numbers);
       // System.out.println(answer);
       int answer = findsmallest(numbers);
       System.out.println(answer);
    }
    public static int findsmallest(int[]nums){
        int smallest = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }
    public static int findLargest(int[]nums){
        int largest = nums [0];
        for(int i = 1;i < nums.length;i++){
            if(nums[i]> largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
