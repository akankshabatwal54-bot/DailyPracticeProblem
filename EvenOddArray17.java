import java.util.Scanner;
public class EvenOddArray17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
       for(int i = 0; i < number.length; i++){
        System.out.println("Enter a number: ");
        number[i] = sc.nextInt();
       }
       int evenCount = 0;
       int oddCount = 0;
       for(int i = 0; i < number.length; i++){
        if(number[i] % 2 == 0){
            System.out.println("no. is even");
            evenCount++;
        }else{
            System.out.println("no. is odd");
            oddCount++;
        }
       }
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        

    }
}