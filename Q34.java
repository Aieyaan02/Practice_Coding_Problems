import java.util.HashMap;

public class Q34 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        System.out.println(wordOccurance(words, "apple"));
        
    }
    public static int wordOccurance(String[] word,String target){
        HashMap<String, Integer> name = new HashMap<>();

        for (int i = 0;i < word.length; i++){
            String names = word[i];
            int oldCount = name.getOrDefault(names, 0);
            int newCount = (oldCount + 1);
            name.put (names, newCount);

        }

        return name.getOrDefault(target,0);
    }
    
}
