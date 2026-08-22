public class LargestCount22{
    static int greatercount(int[] number){
        int count = 0;
        for(int i = 1; i < number.length; i++){
            if(number[i] > 20){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 56, 74, 13};
        int result = greatercount(number);
        System.out.println("Largest Count:" + result);
    }
}