import java.util.Scanner;

public class FindTheMaxValueInArray {
    public static void main(String[] args) {
        int[] list;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size of list");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("maximum size is 20!");
        } while (size > 20);
        list = new int[size];
        System.out.println("Input element's array");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ".");
            list[i] = scanner.nextInt();
        }
        int max = list[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (max < list[i]) {
                max = list[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + ", at position " + index);
    }
}
