import java.util.Scanner;
public class SmallestArray17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for(int i = 0; i < number.length; i++){
            System.out.println("Enter a number:");
            number[i]= sc.nextInt();
    
        }
        
        int smallest = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] < smallest){
                smallest = number[i];
            }
        }
        System.out.println("Smallest:" + smallest);
    }
}