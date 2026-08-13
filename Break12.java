import java.util.Scanner;
public class Break12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i == 7){
                break;
            }
            System.out.println(i);
        }
    }
}