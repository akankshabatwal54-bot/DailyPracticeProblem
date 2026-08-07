import java.util.Scanner;
public class StringUserInput{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name:");
    String name = sc.next();
    System.out.println("Welcome " + name);
    sc.close();
    }
    
}