import java.util.Scanner;

public class DemSoSV {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhập size ");
            size = sc.nextInt();
            if(size > 30)
                System.out.println("size không được quá 30");

        } while (size > 30);

        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.println(" nhập điểm cho sinh viên " + ( i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println(" danh sách điểm ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println(" số lượng sinh viên qua kì thi " + count);

    }
}
