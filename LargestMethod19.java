import java.util.Scanner;
public class LargestMethod19{
    static int largest(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a");
        int a = sc.nextInt();
        System.out.println("Enter number b");
        int b = sc.nextInt();
        int largest = largest(a, b);
        System.out.println("Largest No:" + largest);
    }
}