public class NumberP27{
    static boolean isNumber(int number){
        
        int original = number;
        int reverse = 0;
        while(number > 0){
            int digit = number % 10;
            number = number / 10;
            reverse = reverse * 10 + digit;
        }
        if(original == reverse){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int number = 121;
        boolean result = isNumber(number);
        System.out.println("is palindrome:" + result);
    }
}