public class Palindrome27{
    static boolean isPalindrom(int[] number){
        for(int i = 0; i < number.length / 2; i++){
            if(number[i] != number[number.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 2, 1};
        boolean result = isPalindrom(number);
        System.out.println("Palindrom:" + result);
    }
}