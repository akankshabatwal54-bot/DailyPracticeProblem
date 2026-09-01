public class PositiveNoCount30{
    static int PositiveCount(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] >= 0){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] number = { 10, -20, 30, -40, 50};
        int result = PositiveCount(number);
        System.out.println("Count of Positive Numbers:" + result);

    }

}