public class FirstNumber24{
    static int searchFirst(int[] number, int search){
        for(int i = 0; i < number.length; i++){
            if(number[i] == search){
                return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        int result = searchFirst(number, 40);
        System.out.println(result);


    }
}