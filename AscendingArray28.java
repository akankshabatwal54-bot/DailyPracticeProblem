public class AscendingArray28{
    static void ascending(int[] number){
        for(int i = 0; i < number.length; i++ ){
            for(int j = i +1; j < number.length; j++){
                if(number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp; 

                }
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {40, 20, 30, 50, 10};
        ascending(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
}