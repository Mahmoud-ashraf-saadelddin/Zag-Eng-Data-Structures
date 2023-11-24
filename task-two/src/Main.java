import java.util.Random;
public class Main {
    public static void main(String[] args) {

        ReverseInteger x = new ReverseInteger();
        x.value=7894;
        x.Reverse();
        System.out.println(getRandom(10,15));
        System.out.println(getRandom(10));
        System.out.println(getRandomCharacter('a','f'));
        Integer [] m = {1,2,3,4,5};
        Double [] n = {1.9,2.5,3.33,4.3,5.2};
        Character [] v = {'a','s','d'};
        printArray(m);
        printArray(n);
        printArray(v);

        }
    public static int getRandom(int x){
        return (int)(Math.random()*(x+1));
    }
    public static int getRandom(int min,int max){
        return (int)(min+((max+1-min)*Math.random()));
    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static <T> void printArray(T [] array){
        for (int i =0 ; i <= array.length-1;i++){
            System.out.println(array[i]);
        }
    }
    }

