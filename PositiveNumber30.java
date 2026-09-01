public class PositiveNumber30{
    static void positiveNumber(int[] number){
        for(int i = 0; i < number.length; i++){
            if(number[i] >= 0){
                System.out.print(number[i] + " ");
            }
        }
    }
    public static void main(String[] args){
        int[] number = {10, -20, 30, -40, 50};
        positiveNumber(number);

    }
}