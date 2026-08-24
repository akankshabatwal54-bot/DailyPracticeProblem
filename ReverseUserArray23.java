import java.util.Scanner;
public class ReverseUserArray23{
    static void reverseArray(int[] number){
        for(int i = number.length - 1; i >= 0; i--){
            System.out.print(number[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a number:");
             number[i] = sc.nextInt();
            
        }
        reverseArray(number);
    }
}