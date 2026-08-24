public class ReverseArray23{
    static void reverse(int[] number){
        for(int i = number.length - 1; i >= 0; i-- ){
            System.out.print(number[i] + " ");
        }
        
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        reverse(number);
    }
}