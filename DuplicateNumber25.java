public class DuplicateNumber25{
    static int findDuplicate(int[] number){
        for(int i = 0; i < number.length; i++){
            for(int j = i+1; j < number.length; j++){
                if(number[i] == number[j]){
                    return number[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 20, 20};
        int result = findDuplicate(number);
        System.out.println("Duplicate Number:" + result);
    }
}