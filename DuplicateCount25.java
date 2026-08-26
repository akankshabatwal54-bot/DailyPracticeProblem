public class DuplicateCount25{
    static int duplicateCount(int[] number, int search){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == search){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] number = {10, 20, 10, 20, 30};
        int result = duplicateCount(number, 10);
        System.out.println("Duplicate No.Count:" + result +" "+"times");
    }
}