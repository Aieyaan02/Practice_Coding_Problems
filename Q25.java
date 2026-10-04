public class Q25 {
    public static void main (String []args){
        int[] nums = {4, 7, 4, 5, 6, 8, 1, 4, 12};
        int answer = countOccur(nums, 4);
        System.out.println(answer);
    }
    public static int countOccur (int[]nums,int target){
        int counter = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                counter +=1;
            }
        }
        return counter;
        System.out.println();
    }
}
