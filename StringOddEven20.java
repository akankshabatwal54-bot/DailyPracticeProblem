import java.util.Scanner;
public class StringOddEven20{
    static String evenOdd(int number){
        if(number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber:");
        int num = sc.nextInt();
        String result = evenOdd(num);
        System.out.println(result);
    }
}