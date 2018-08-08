import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhap size");
            size = sc.nextInt();
            if( size > 20 )
                System.out.println(" moi ban nhap lai size");
        } while (size > 20 );

        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println(" nhap diem sinh vien " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
    }
}
