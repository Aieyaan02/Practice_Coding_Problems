public class Q20 {
    public static void main (String []args){
        Array_Find();
    }
    static void Array_Find(){
        int[] num = {4,8,3,7,2};
        int tagert = 7;
        for(int i = 0; i< num.length;i++){
            if(num[i]==7){
                System.out.println(tagert + " found at " + i + "rd " + "index");
            }
        }
    }
}
