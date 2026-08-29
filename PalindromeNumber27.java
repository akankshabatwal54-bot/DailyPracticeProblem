public class PalindromeNumber27{
    static boolean isPalindrome(int[] number){
        for(int i = 0; i < number.length / 2; i++){
            if(number[i] != number[number.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        boolean result = isPalindrome(number);
        System.out.println("Palindrome:" + result);
    }
}