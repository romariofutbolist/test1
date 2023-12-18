import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int a = 5;
        int b = 6;
        System.out.println("До обмена: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("После обмена: a = " + a + ", b = " + b);

        System.out.println(chipsParty(3, false));
        System.out.println(chipsParty(15, false));
        System.out.println(chipsParty(50, true));

        System.out.println(great6(6, 4));
        System.out.println(great6(4, 5));
        System.out.println(great6(-5, 1));

        System.out.println(teenSum(3, 4));
        System.out.println(teenSum(10, 13));
        System.out.println(teenSum(13, 2));


        System.out.println(has77(new int[]{1, 7, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 7}));
        System.out.println(has77(new int[]{1, 7, 1, 1, 7}));

        System.out.println(twoTwo(new int[]{1, 2, 2, 3}));
        System.out.println(twoTwo(new int[]{2, 2, 4}));
        System.out.println(twoTwo(new int[]{1, 2, 2, 3, 2}));
    }


    public static boolean chipsParty(int chips, boolean isWeekend) {
        if(isWeekend) {
            return chips > 20;
        } else {
            return chips >= 15 && chips < 20;
        }
    }

    public static boolean great6(int a, int b) {
        int sum = a+b;
        int difference = a-b;
        if(a==6 || b==6 || sum == 6 || Math.abs(difference)==6) {
            return true;
        } else {
            return false;
        }
    }

    public static int teenSum(int a, int b) {
        int sum = a + b;
        if (sum >= 13 && sum <= 19) {
            return 19;
        } else {
            return sum;
        }
    }

    public static boolean has77(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 7 && arr[i+1] == 7) {
                result = true;
            } else if (i < arr.length - 2 && arr[i] == 7 && arr[i+2] == 7) {
                result = true;
            }
        }
        return result;
    }

    public static boolean twoTwo(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (i < arr.length - 1 && arr[i + 1] == 2) {
                    result = true;
                    i++;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
    */

        Scanner sc = new Scanner(System.in);
        int scanner = sc.nextInt();

        if (scanner > 0) {
            for (int i = 1; i <= scanner; i++) {
                if (scanner % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            throw new RuntimeException("Такого делителя не существует");
        }
    }
}