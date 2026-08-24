public class FirstLastArray23{
    static void firstLast(int[] number){
        System.out.println(number[0]);
        System.out.println(number[number.length - 1]);
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        firstLast(number);
    }
    
}