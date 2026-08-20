import java.util.Scanner;
public class SquareMethod19{
    static int square( int number){
        return number * number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int result = square(number);
        System.out.println("Square:" + result);
    }
}