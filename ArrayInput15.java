import java.util.Scanner;
public class ArrayInput15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a Number:");
            numbers[i]= sc.nextInt();

        }
        System.out.println("Array Element:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
       
    }
}