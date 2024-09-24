// # 1170 - blobs
iimport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, dias;
        float x;

        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextFloat();
            dias = 0;
            while (x > 1) {
                x /= 2;
                dias++;
            }
            System.out.println(dias + " dias");
        }

        scanner.close();
    }
}

// # 1193 -  base conversion
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            String number = scanner.next();
            String base = scanner.next();

            System.out.println("Case " + i + ":");

            switch (base) {
                case "bin":
                    int decimalFromBin = Integer.parseInt(number, 2);
                    System.out.println(decimalFromBin + " dec");
                    System.out.println(Integer.toHexString(decimalFromBin) + " hex");
                    break;

                case "dec":
                    int decimal = Integer.parseInt(number);
                    System.out.println(Integer.toHexString(decimal) + " hex");
                    System.out.println(Integer.toBinaryString(decimal) + " bin");
                    break;

                case "hex":
                    int decimalFromHex = Integer.parseInt(number, 16);
                    System.out.println(decimalFromHex + " dec");
                    System.out.println(Integer.toBinaryString(decimalFromHex) + " bin");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}

// 1138 - Digits count
//import java.io.IOException;


//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        while(true)
//        {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            if (a == 0 && b == 0)
//            {
//                break;
//            }
//            int[] arr = new int[10];
////            for (int i = a; i <= b; i++)
//            {
//                int temp = i;
//                while(temp != 0)
//                {
//                    int t = temp%10;
//                    arr[t]++;
//                    temp = temp/10;
//                }
//            }
//
//            for (int i = 0; i < arr.length; i++)
//            {
//                if (i == arr.length-1)
//                    System.out.print(arr[i]);
//                else
//                    System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// 1028 - Collectable Cards
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();

            if(a<b)
            {
                int temp = a;
                a = b;
                b = temp;
            }
            while(b != 0)
            {
                int temp = a;
                a = b;
                b = temp % b;
            }
            System.out.println(a);
        }
    }
}

// leetcode 2000 - Reverse Prefix of Word
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        boolean b = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ch)
            {
                index = i;
                b = true;
                break;
            }
        }
        if (b)
        {
            int beg = 0;
            while(beg <= index)
            {
                char temp = arr[beg];
                arr[beg] = arr[index];
                arr[index] = temp;
                beg++;
                index--;
            }
        }
        return String.valueOf(arr);
    }
}
