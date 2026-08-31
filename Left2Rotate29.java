public class Left2Rotate29{
    static void leftRotate(int[] number){
        int first = number[0];
        for(int i = 0; i < number.length - 1; i++){
            number[i] = number[i +1];
        }
        number[number.length - 1] = first;

    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        leftRotate(number);
        leftRotate(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}