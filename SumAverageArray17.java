import java.util.Scanner;
public class SumAverageArray17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;
        int average = 0;
        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a number:");
            number[i] = sc.nextInt();
             sum = sum + number[i];
             average = sum / number.length;
            
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average:" + average);
    }
}