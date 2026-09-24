import java.util.Scanner;
public class CountFactor{
    public static void factor(int n){
        int count = 0;
        for(int i = 1; i<= n; i++){
            if(n % i == 0){
                 count++;
            }
           
        }
        System.out.println("Count Factor:" + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factor(n);
    }

}