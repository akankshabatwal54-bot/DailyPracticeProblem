public class DescendingArray28{
    static void sort(int[] number){
        for(int i = 0; i < number.length; i++){
            for(int j = i + 1; j < number.length; j++){
                if(number[i] < number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {10, 50, 30, 40, 20};
        sort(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        
    }
}