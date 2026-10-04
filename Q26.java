public class Q26 {
    public static void main(String[] args) {
        int[] num = {9, 4, 12, 2, 7, 1}; 
        int answer = findSmall(num);
        System.out.println(answer);
        
    }
    public static int findSmall (int nums []){
        int small  = nums[0];
            for(int i = 0; i < nums.length;i++){
                if(nums[i]< small){
                    small = nums[i];
                }
            }

        return small;
    }


}
