import java.util.Scanner;
public class If2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        if(salary > 50000){
            System.out.println("High Salary");

        }
        sc.close();

    }
}