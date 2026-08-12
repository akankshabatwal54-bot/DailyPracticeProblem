import java.util.Scanner;
public class DoWhile11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do { 
            System.out.println("1. Hello");
            System.out.println("2. Java");
            System.out.println("3. Exit");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Hello..!");
            }else if (choice == 2) {
                System.out.println("Learning java Programming");
            }
        } while (choice != 3);
            System.out.println("Program is ended");

        
    }
}
