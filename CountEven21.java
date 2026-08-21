
public class CountEven21{
    static int evenCount(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int[] number = {10,23,54,69,55};
        int result = evenCount(number);
        System.out.println("Count:" + result);
    }

}