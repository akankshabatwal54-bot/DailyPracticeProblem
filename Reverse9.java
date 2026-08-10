import java.util.Scanner;
public class Reverse9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        for(int i= 10; i>=1; i--){
            System.out.println(num + "x" + i + " = " + (num * i));
        }
    }
}