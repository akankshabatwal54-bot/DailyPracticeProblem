import java.util.Scanner;
public class ArraySum15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number:");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Array number:");
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
            
        }
        
            System.out.println("sum:" + sum);
        
    }
}