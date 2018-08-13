import java.util.Scanner;

public class TinhSVThiDo {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhập size của chuỗi");
            size = sc.nextInt();
            if ( size > 20) {
                System.out.println(" size không thỏa mãn điều khiện, yêu cầu nhập lại");
            }
        } while ( size > 20 );

        int[] array = new int[size];
        for ( int i = 0; i < array.length; i++) {
            System.out.println(" nhập phần tử thứ " + (i + 1));
            array[i] = sc.nextInt();
        }

//        System.out.println(" in ra danh sách đã nhập");
//        for ( int j = 0; j < array.length; j++ ) {
//            System.out.println(array[j]);
//        }

        int count = 0;
        System.out.println(" in ra danh sách đã nhập");
        for ( int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if ( array[j] >= 5 && array[j] <= 10)
             count++;
        }
        System.out.println(" số sinh viên thi đỗ là " + count);

    }
}
