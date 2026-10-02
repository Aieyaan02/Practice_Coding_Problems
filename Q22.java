public class Q22 {
    public static void main (String[]args){

       // int answer = doubleNumber(6);
       // System.out.println(answer);
       // int[] numbers = {4,7,2,9};
       // int answer = sumArray(numbers);
       // System.out.println(answer);
        // sumArray();
        //int answer = intAdd(2, 4);
        //System.out.println(answer);
        int answer = intAdd(6, 5);
        System.out.println(answer);
    }

    public static int intAdd(int a, int b){
        if (a>b)
        return a;
        else 
            return b;
    }

    public static int doubleNumber(int number) {
        int num = 6;
        return num*2;
    }
    public static int sumArray(int[]array){
        //int[]array = {4,7,2,9};
        int total = 0;

        for(int i = 0; i< array.length;i++){
            total = total + array[i];
            
        }
        return total;
    }
}
