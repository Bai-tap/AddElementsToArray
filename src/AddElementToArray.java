import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 2, 4, 6, 8, 0, 0, 0, 0, 0};

        System.out.println("Nhập giá trị cần chèn vào mảng: ");
        int x = sc.nextInt();
        System.out.println("Nhập vào vị trí cần chèn (từ 0 - 9): ");
        int index = sc.nextInt();
        int temp = 0;

        if (index <= 1 && index >= array.length - 1)
            System.out.println("Không chèn được phần tử zô mảng");

        for (int j = 0; j < array.length - 1; j++) {
            if (j < index - 1) {
                array[j] = array[j];
            } else if (j >= index-1) {

                temp = array[j];
                array[index-1]=x;
                array[j + 1] = temp;
            }
            System.out.println(array[j]);
        }
    }
}
