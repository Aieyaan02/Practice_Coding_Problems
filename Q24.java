public class Q24 {
    public static void main(String[] args) {
        int[]nums = {4,7,2,5};
        int answer = findIndex(nums, 9);
        System.out.println(answer); 
    }
    public static int findIndex(int[]nums,int target){
        for(int i = 0;i < nums.length;i++){
            if(nums[i]== target){
                return i;
            }
        }
        return -1;
    }
}
