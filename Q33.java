import java.util.HashMap;

public class Q33 {
    public static void main(String[] args) {
        String []names ={"Ali", "Sara", "Ali", "Maya","Sara","Ali"};
        System.out.println(countVote(names));
        
    }
    public static HashMap<String,Integer> countVote(String[]names){
        HashMap<String,Integer> votes = new HashMap<>();

        for(int i = 0; i< names.length;i++){
            String name = names[i];
            int oldCount = (votes.getOrDefault(name,0));
            int newCount = (oldCount + 1);
            votes.put (name, newCount);

        }
            return votes;
    }
    
}
