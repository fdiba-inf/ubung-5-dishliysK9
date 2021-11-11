package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];
        
        
        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int element = input.nextInt();

        int elementIndex = -1;
// Search for number in numbers
        for (int i=0; i < numbers.length; i++){
          if (numbers[i] == element){
            elementIndex = i;
          }
        }
        

        System.out.println("Number index: " + elementIndex);
    }
}
