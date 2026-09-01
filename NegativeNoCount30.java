public class NegativeNoCount30{
    static int negativeCount(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] < 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] number = {10, -20, 30, -40, 50};
        int result = negativeCount(number);
        System.out.println("Count of Negative Numbers:" + result);
    }
}