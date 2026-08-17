import java.util.Scanner;
public class ArrayCount16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {10, 20, 10, 30, 10 };
        System.out.println("Enter to no search:");
        int search = sc.nextInt();
        int count = 0;
        for(int i = 0; i < num.length; i++){
            if(num[i] == search){
                count++;
            }

        }
        System.out.println(search + " found " + count + " times.");
    }
}