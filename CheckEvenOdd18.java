import java.util.Scanner;
public class CheckEvenOdd18{
    static void EvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        EvenOdd();
    }
}