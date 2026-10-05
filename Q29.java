import java.util.HashSet;

public class Q29 {
    public static void main(String[] args) {
        int[] num = {8, 3, 4, 8};
        System.out.println(differentValues(num));
    }
    public static int differentValues(int[]num){
        HashSet <Integer> number = new HashSet<>();
        for(int i = 0; i < num.length;i++){
           number.add(num[i]);
        }
        number.size();

        return number.size();
    }

    
}
