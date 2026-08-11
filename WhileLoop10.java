import java.util.Scanner;
public class WhileLoop10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int i = 1;
        int total = 0;
        while(i<= 100){
            int result = num + i;
            total = total + result;
            i++;
        }
        System.out.println("total: " +total);
    }
}
