import java.util.Scanner;
public class ArraySearch16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5]; 
        

        for(int i = 0; i < num.length; i++){
            System.out.println("Enter a number:");
            num[i] = sc.nextInt();
            
        }
        System.out.println("Enter a search: ");
        int search = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < num.length; i++){
            if(num[i] == search){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("No is Found");
        } else{
            System.out.println("No is not Found");
        }
        

    }
}
