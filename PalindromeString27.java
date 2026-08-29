public class PalindromeString27{
    static boolean palindrome(String word){
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()- 1- i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "madam";
        boolean result = palindrome(a);
        System.out.println("is Palindrome:" + result);
    }
}