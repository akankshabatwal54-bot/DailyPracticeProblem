import java.util.Scanner;
public class CountNumber21{
    
    static int countNumber(int[] number, int search){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == search){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {10, 20, 30, 10, 50};
        System.out.println("Enter a Number:");
        int search = sc.nextInt();
        
        int result = countNumber(number, search);
        System.out.println("Count:" + result);

    }
}