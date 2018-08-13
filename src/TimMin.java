import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhap vao gia tri cua chuoi");
            size = sc.nextInt();
            if ( size > 20) {
                System.out.println(" size qua dai, yeu cau nhap lai");
            }
        } while ( size > 20);
        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println(" nhap phan tu thu" + ( i+1 ));
            array[i] = sc.nextInt();
            i++;
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[i];
                index = j + 1;
            }
        }
        System.out.println(" gia tri nho nhat "+ min + "vi tri"+ index );


    }
}
