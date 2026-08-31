public class Right1Rotate29{
    static void rightRotate(int[] number){
        int last = number[number.length - 1];
        for(int i =  number.length - 1; i > 0; i--){
            number[i] = number[i - 1];

        }
        number[0] = last;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        rightRotate(number);
        for(int i = 0 ; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}