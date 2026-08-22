public class SmallestArray22{
    static int smallest(int[] number){
        int smallest = number[0];
        for(int i = 1; i < number.length; i++){
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] number = {10, 25, 7, 40, 15};
        int result = smallest(number);
        System.out.println("Smallest no:" + result);
    }
}