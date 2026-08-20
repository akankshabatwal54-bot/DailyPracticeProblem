import java.util.Scanner;
public class StringGrade20{
    static String findGrade(int mark){
        if(mark >= 90){
            return "A";
        }else if(mark >=75){
            return "B";
        }else if(mark >= 60){
            return "C";
        }else if(mark >= 40){
            return "D";
        }else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Marks:");
        int marks = sc.nextInt();
        String result = findGrade(marks);
        System.out.println(result);
    }

}