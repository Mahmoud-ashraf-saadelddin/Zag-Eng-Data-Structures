import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number  = input.nextInt();
        String result = evenORodd(number);
        System.out.println(result);
    }
    public static String evenORodd(int n){
        if (n % 2 == 0)
        {
           return "EVEN";
        }
        else
        {
            return "ODD";
        }
    }
}