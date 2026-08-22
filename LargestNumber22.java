import java.util.Scanner;
public class LargestNumber22{
    static int largest(int[] number){
        int largest = number[0];
        for(int i = 1; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a Number:");
            number[i] = sc.nextInt();
            
        }
        int result = largest(number);
        System.out.println("Largest No is :" + result);
        
    }
}