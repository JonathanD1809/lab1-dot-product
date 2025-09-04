
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of n:");
        int n = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10) + 1;
            b[i] = rand.nextInt(10) + 1;
            c[i] = a[i] * b[i];
        }


        System.out.printf("%-10s", "Array A:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", a[i]);
        }
        System.out.println();


        System.out.printf("%-10s", "Array B:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", b[i]);
        }
        System.out.println();


        System.out.printf("%-10s", "Array C:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d", c[i]);
        }
        System.out.println();
    }
}
