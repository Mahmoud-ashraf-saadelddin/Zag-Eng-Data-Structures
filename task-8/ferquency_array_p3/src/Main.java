import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strInput = input.next();
        int freArray[] = new int[26];
        for (int i = 0; i < strInput.length(); i++) {
            freArray[strInput.charAt(i) - 'a']++;
        }
        for (int i = 0; i < freArray.length; i++) {
            if (freArray[i] != 0) {
                for (int j = 0 ; j < freArray[i];j++)
                    System.out.print((char) (i+'a'));

            }
        }

    }
}
