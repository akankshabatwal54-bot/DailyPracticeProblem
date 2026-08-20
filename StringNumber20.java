import java.util.Scanner;
public class StringNumber20{
    static String checkNumber(int number){
        if(number > 0){
            return "Positive";
        }else if(number < 0){
            return "Negative";
        }else{
            return "Zero";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        String result = checkNumber(num);
        System.out.println(result);
    }
}