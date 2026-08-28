public class MissingNumber26{
    static int missing(int[] number){
        int expectedSum = 0;
        int sum = 0;
        for(int i = 0; i <= 5; i++){
           expectedSum =  expectedSum + i;
        }
        for(int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        int missing = expectedSum - sum;
        return missing;
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 5};
        int result = missing(number);
        System.out.println("Missing Number:" + result);
    }
}