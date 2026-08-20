import java.util.Scanner;
public class BooleanMethod19{
    static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        boolean result = isEven(num);
        System.out.println("Number is:" + result);


    }
}