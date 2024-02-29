import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    HashChaining n = new HashChaining(5);
//    n.put(1,"l");
//    n.put(2,"k");
//    System.out.println(n.size());
//    n.remove(2);
//    System.out.println(n.size());
//    HashLinear_1 m = new HashLinear_1();
//    m.put(1,"a");
//    m.put(2,"b");
//    m.put(3,"c");
//    m.put(4,"k");
//    System.out.println(m.size());
//    System.out.println(m.get(2));
//    m.remove(4);
//    System.out.println(m.size());


//// Problem 1:
////➢Receive an string and print the occurrence in each
////element on it.
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        HashMap<Character, Integer> hash = new HashMap<>();
//        for (char c : input.toCharArray()) {
//            if (!hash.containsKey(c)) {
//                hash.put(c, 1);
//            } else {
//                int value = hash.get(c);
//                value++;
//                hash.put(c, value);
//            }
//        }
//        System.out.println(hash);


////    Problem 2:
////➢Using hash tables write an algorithm that take a string
////and print first not repeated character.
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        HashMap<Character, Integer> hash = new HashMap<>();
//        for (char c : input.toCharArray()) {
//            if (!hash.containsKey(c)) {
//                hash.put(c, 1);
//            } else {
//                int value = hash.get(c);
//                value++;
//                hash.put(c, value);
//            }
//        }
////        calculate the minimum repeated value
//        int max = hash.size();
//        for (int c : hash.values()) {
//            if (c < max)
//                max = c;
//        }
//
////        printing the key of first not repeated character
//        for (char c : hash.keySet()) {
//            if (hash.get(c) == max) {
//                System.out.println(c);
//                break;
//            }
//
//        }
////         this code printing the least repeated value
//
////        but if you want first not repeated char
//        for (char c : hash.keySet()) {
//            if (hash.get(c) == 1) {
//                System.out.println(c);
//            }
//        }
        int arr [] = {1,1,2,3,3,3,6,5,6};
        System.out.println(MostRepeated(arr));

    }

    public static int MostRepeated(int[] numbers) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();
        int max = numbers[0];
        for (int k : numbers) {
            if (hashTable.containsKey(k)) {
                hashTable.put(k, hashTable.get(k) + 1);
                if (hashTable.get(max) < hashTable.get(k)) {
                    max = k;
                }
            } else {

                hashTable.put(k, 1);
            }
        }
        return max;

    }
}

