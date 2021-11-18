package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int size = input.nextInt();
        int arr[] = new int[size];

        //int[] numbers = new int[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < size; index++) {
            arr[index] = input.nextInt();
        }

        int[] arrDup = new int[size];

        arrDup[0] = arr[0];
        for(int index = 1; index < size; index++) {
          for (int j = 0; j < size; j++) {
            if(arr[index] == arrDup[j]) {
              break;
            } else if (arrDup[j] == 0) {
              arrDup[j] = arr[index];
              break;
            }
          }
        }

        String asStringArrDup= Arrays.toString(arrDup);
        System.out.println("Unique numbers: " + asStringArrDup);
    }
}