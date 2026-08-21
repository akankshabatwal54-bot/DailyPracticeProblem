public class CountOdd21{
    static int oddCount(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] number = {10,23,59,53,77};
        int result = oddCount(number);
        System.out.println("Odd Count:" + result);
    }
}