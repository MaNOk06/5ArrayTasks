import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    public static void main(String[] args){
        /*
        Tasks:
        1. Identify index given a value {}
        2. Swap two values in an array
        3. Sort an array in ascending and descending order
        4. Linear search
        5. Binary search
        */

        /* Task 1
        1. Initialise the array
        2. Ask the user to search for an element in the array
        3. Print the index of the element being searched for otherwise tell them it's not there
        */

        int[] anArray = {2,5,8,3,4,6,10,15,20,1,11};

        Scanner input = new Scanner(System.in);

        System.out.println("The array is: " + Arrays.toString(anArray));
        System.out.print("Enter a number from the array: ");

        int userInput = input.nextInt();
        input.nextLine();

        boolean foundNumber = false;
        for(int number: anArray){
            if (number == userInput){
                foundNumber = true;
                break;
            }
        }

        if (foundNumber){
            System.out.println("Input was found in array!");
        }
        else{
            System.out.println("Input was not found in array");
        }


        // Task 2
        int swap = anArray[0];
        anArray[0] = anArray[5];
        anArray[5] = swap;

        System.out.println("The new array is: " + Arrays.toString(anArray));

        // Task 3
        // Using the .sort() method
        Arrays.sort(anArray);
        System.out.println("Sorted in ascending order: " + Arrays.toString(anArray));

        // Using the for loop
        for (int i = 0; i < anArray.length - 1; i++){
            int minNumber = i;

            for (int j = i + 1; j < anArray.length; j++){
                if (anArray[j] < anArray[minNumber]){
                    minNumber = j;
                }

                // Swap the smallest number with the first number
                int sortedAgain = anArray[minNumber];
                anArray[minNumber] = anArray[i];
                anArray[i] = sortedAgain;
            }

            int sorted = anArray[i];
            anArray[i] = sorted;
        }

        for (int number: anArray){
            System.out.print(number + " ");
        }
        System.out.println();

        // Task 4
        System.out.print("Enter a number: ");

        int linearSearch = input.nextInt();
        input.nextLine();

        for(int number: anArray){
            if (number == linearSearch){
                System.out.println(linearSearch + " was found in array!");
            }
            else{
                System.out.println(linearSearch + " was not found in array");
            }
        }

        // Task 5
        System.out.print("Enter the number you want to search for: ");
        int binarySearch = input.nextInt();
        input.nextLine();

        int minValue = 0;
        int maxValue = anArray.length - 1;

        while (minValue <= maxValue){
            int midValue = (minValue + maxValue) / 2;

            if (anArray[midValue] == binarySearch){
                System.out.println(binarySearch + " was found at index " + midValue);
                break;
            }
            else if (anArray[midValue] < binarySearch){
                // To search the right side of the array
                minValue = midValue + 1;
            }
            else if (anArray[midValue] > binarySearch){
                // To search the left side of the array
                maxValue = midValue - 1;
            }
            else{
                System.out.println(binarySearch + " was not found in the array!");
            }
        }
    }
}
