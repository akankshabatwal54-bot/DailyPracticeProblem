import java.util.Scanner;
public class AddMethod19{
    static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number a:");
        int a = sc.nextInt();
        System.out.println("Enter Number b:");
        int b = sc.nextInt();
        int result = add(a, b);
        System.out.println("Sum:" + result);
    }
}