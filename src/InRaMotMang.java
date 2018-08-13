import java.util.Scanner;

public class InRaMotMang {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i] + " phan tu mang");
        }
    }
}
