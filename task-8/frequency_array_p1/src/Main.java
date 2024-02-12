import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];
        int[] freArr = new int[m + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] <= m) {
                freArr[arr[i]]++;
            }
        }

        for (int i = 0; i < freArr.length; i++) {
            if (freArr[i] != 0) {
                System.out.println(freArr[i]);
            }
        }

    }
}