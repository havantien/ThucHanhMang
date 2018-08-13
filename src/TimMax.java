import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhap size cho chuoi");
            size = sc.nextInt();
            if ( size > 20 ) {
                System.out.println(" size qua dai, yeu cau nhap lai");
            }
        } while ( size > 20 );
        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println(" nhap gia cua phan tu" + (i +1) );
            array[i] = sc.nextInt();
            i++;
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("gia tri lon nhat " + max + " ,vi tri " + index);
    }
}
