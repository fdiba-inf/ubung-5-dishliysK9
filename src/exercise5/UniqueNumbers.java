package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int[] uniqueNumbers = new int[size];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }
        
        
        // Find unique numbers in numbers
        numbers[0] = uniqueNumbers[0];
        for (int i = 1; i < size; i++) {
          for (int j = 0; j < size; j++){
            if (numbers[i] == uniqueNumbers[j]){
              break;
            }else if (uniqueNumbers[j] == 0){
              uniqueNumbers[j] = numbers[i];
              break;
            }
          }

        }
        
        
        

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
