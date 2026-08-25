public class SearchCount24{
    static int countArr(int[] number, int search){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == search){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]  number = {10, 20, 10, 30, 10};
        int result = countArr(number, 10);
        System.out.println("Count:" + result);
    }
}