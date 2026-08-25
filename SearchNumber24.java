public class SearchNumber24{
    static boolean searchArr(int[] number, int search){
        for(int i = 0; i < number.length; i++){
            if(number[i] == search){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        boolean result = searchArr(number, 30);
        System.out.println(result);
    }
}