import java.util.Scanner;
public class PerfectNo{
    public static boolean number(int n){
        int sum = 0;
        for(int i = 1; i< n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
           
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        boolean result = number(n);
        System.out.println("Perfect no:" + result);

    }
}