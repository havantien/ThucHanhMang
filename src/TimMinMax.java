import java.util.Scanner;

public class TimMinMax {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhập size của chuỗi:  ");
            size = sc.nextInt();
            if ( size > 20 ) {
                System.out.println(" size vượt quá yêu cầu, mời nhập lại: ");
            }
        } while ( size > 30 );

        array = new int[size];
        for ( int i = 0; i < array.length; i++ ) {
            System.out.println(" nhập phần tứ thứ " + (i+1));
            array[i] = sc.nextInt();
        }

        System.out.println(" in ra mảng đã nhập: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        int max = array[0];
        int min = array[0];
        int indexMax = 1;
        int indexMin = 1;
        for ( int j = 0; j < array.length; j++) {
            if ( array[j] > max) {
                max = array[j];
                indexMax = indexMax + 1;
            }

            if ( array[j] < min) {
                min = array[j];
                indexMin = indexMin - 1;
            }


        }
        System.out.println("giá trị lớn nhất là " + max + "vị trí"+ indexMax);
        System.out.println(" giá trị nhỏ nhất là " + min + " vị trí " + indexMin);
    }
}
