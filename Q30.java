import java.util.HashSet;
public class Q30 {
    public static void main(String[] args) {
        int[]num1 = {4, 7, 9};
        int[]num2 = {2, 7, 5};
        System.out.println(shareValue(num1, num2));
    }
    public static boolean shareValue(int[]first, int[]second){
        HashSet <Integer> numbers = new HashSet<>();
        for(int i = 0;i < first.length;i++){
            numbers.add(first[i]);
        }
        for(int j = 0;j < second.length;j++){
               if(numbers.contains(second[j])){;

            return true;
        }
    }
        return false;
} 
}

