public class SumEvenNumber22{
    static int sumEven(int[] number){
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0){
                sum = sum + number[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 13};
        int result = sumEven(number);
        System.out.println("Even number sum:" + result);
    }
}