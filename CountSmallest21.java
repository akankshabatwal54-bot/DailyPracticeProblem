public class CountSmallest21{
    static int smallestCount(int[] number){
       
        int smallest = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] < smallest){
                smallest = number[i];
                
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int[] number = {10, 23, 89, 54, 13};
        int result = smallestCount(number);
        System.out.println("Smallest Count:" + result);
    }
}