import java.util.Scanner;
public class LargestSmallest17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];

        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a number:");
            number[i] = sc.nextInt();
        }
        int smallest = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        int largest = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        System.out.println("Largest:" + largest);
        System.out.println("Smallest:" + smallest);
    }
}