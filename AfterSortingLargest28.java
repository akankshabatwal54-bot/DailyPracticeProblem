public class AfterSortingLargest28{
    static int sort(int[] number){
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if(number[i] > number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        int largest = number[number.length - 1];
        return largest;
    }
    public static void main(String[] args) {
        int[] number = {10, 40, 50, 30, 20};
        int result = sort(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
        System.out.println("Largest:" + result);

    }
}