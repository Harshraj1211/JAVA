package array;

import java.util.*;

public class decrising_bubbleshort {
    public static void selectionshort(int array[], int size) {
        int turn = 0;
        int j = 0;
        for (turn = 0; turn < size - 1; turn++) {
            for (j = 0; j < size - 1 - turn; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printarray(int array[], int size) {
        int i = 0;
        for (i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        int i = 0;
        System.out.println("Enter elements of the array : ");
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        selectionshort(array, size);
        System.out.println("selection shorting array : ");
        printarray(array, size);
    }
}