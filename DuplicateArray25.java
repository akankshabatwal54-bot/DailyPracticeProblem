public class DuplicateArray25{
    static boolean hasDuplicate(int[] number){
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if(number[i] == number[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 20, 40};
        boolean result = hasDuplicate(number);
        System.out.println("Duplicate:" + result);
    }
}