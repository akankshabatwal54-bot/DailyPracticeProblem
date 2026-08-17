import java.util.Scanner;
public class ArrayIndexSearch16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {10,20,30,40,50};

        System.out.println("Enter no to Search index: ");
        int count = sc.nextInt();
        

        for(int i = 0; i < num.length; i++){
            if(num[i] == count){
                System.out.println("Number find at index:" + i);
            }
        }
    }
}