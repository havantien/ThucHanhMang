import java.util.Scanner;

public class DemSoSV {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhap size");
            size = sc.nextInt();
            if(size > 30)
                System.out.println("size khong duoc qua 30");

        } while (size > 30);

        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println(" nhap diem cho sinh vien " + ( i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println(" danh sach diem ");
        for (int j =0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println(" so luong sv vuot qua ki thi " + count);

    }
}
