public class ReverseEven23{
    static void evenArray(int[] number){
        for(int i = number.length - 1; i >= 0; i--){
            if(number[i] % 2 == 0){
                System.out.println(number[i] );
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {20, 30, 17, 19, 10};
        
        evenArray(number);
    }
}