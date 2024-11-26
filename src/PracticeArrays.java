import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrays {
    Scanner input = new Scanner(System.in);

    //Task 1
    public void createArray() {
        int[] numbers = {1, 2, 3};
        System.out.println("Elements of numbers array: ");
        for (int num : numbers) {
            System.out.print(num);
        }
    }

    //Task 2
    public void middleElement() {
        int[] numbers = {13, 5, 7, 68, 2};
        int middleNumberIndex = numbers.length / 2;
        System.out.println("Middle element of numbers array: " + numbers[middleNumberIndex]);
    }

    //Task 3
    //Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,” and “yellow.”
    // Print out the array length. Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied

    public void colorsArray() {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Length of colors array: " + colors.length);
        String[] copyOfColors = colors.clone();
        System.out.println("Elements of copy of colors array: " + Arrays.toString(copyOfColors));
    }

    //Task 4
    // Write a program that creates an integer array with 5 elements (i.e., numbers).
    // The numbers can be any integers.
    // Print out the value at the first index and the last index using length - 1 as the index.
    // Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
    // Now try to assign a value to the array index 5. You should get the same type of exception.

    public void arrayIndexes() {
        int[] numbers = {3, 5, 4, 2, 7};
        System.out.println("Value at first index of array numbers: " + numbers[0]);
        System.out.println("Value at last index of array numbers: " + numbers[numbers.length - 1]);
        //System.out.println("Value at index = length: " + numbers[numbers.length]);
        //numbers[5] = 10;
        //System.out.println("Value at index 5: " + numbers[5]);

    }

    //Task 5
    //Write a program where you create an integer array with a length of 5.
    // Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
    public void assignI() {
        int[] numbers = new int[5];
        int j = 0;
        for (int i = 1; i < numbers.length + 1; i++) {
            numbers[j] = i;
            j += 1;
        }

        System.out.println("Elements of numbers array: " + Arrays.toString(numbers));

    }

    //Task 6
    //Write a program where you create an integer array of 5 numbers.
    // Loop through the array and assign the value of the loop control variable multiplied by 2
    // to the corresponding index in the array.

    public void assignItimesTwo() {
        int[] numbers = new int[5];
        int j = 0;
        for (int i = 1; i < numbers.length + 1; i++) {
            numbers[j] = i * 2;
            j += 1;
        }
        System.out.println("Elements of numbers array: " + Arrays.toString(numbers));
    }

    /**
     * Task 7
     * Write a program where you create an array of 5 elements.
     * Loop through the array and print the value of each element, except for the middle (index 2) element.
     */

    public void printAllExceptMiddleElement() {
        int[] numbers = new int[5];
        int middleIndex = numbers.length / 2;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number" + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (!(i == middleIndex)) {
                System.out.println("Element " + (i + 1) + "of numbers array: " + numbers[i]);
            }
        }
    }

    /**
     * Task 8
     * Write a program that creates a String array of 5 elements
     * and swaps the first element with the middle element without creating a new array.
     */

    public void swapFirstAndMiddle() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));
        int middleIndex = numbers.length / 2;
        int temp = numbers[0];
        numbers[0] = numbers[middleIndex];
        numbers[middleIndex] = temp;
        System.out.println("Swapped array: " + Arrays.toString(numbers));
    }

    /**
     * Task 9
     * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
     * Print the array in ascending order, and print the smallest and the largest element of the array.
     */
    public void ascendingArray() {
        int[] numbers = {4, 2, 9, 13, 1, 0};
        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Smallest Number in Array: " + numbers[0]);
        System.out.println("Largest Number in Array: " + numbers[numbers.length -1]);
    }

    /**
     * Task 10:
     * Create an array that includes an integer, 3 strings, and 1 double. Print the array.
     */
    public void mixedArray() {
        Object [] mixedArray = new Object[]{10, "Shireen", "Ghazala", "PerScholas", 10.5};
        System.out.println("Original array: " + Arrays.toString(mixedArray));
    }

    /**
     * Task 11
     *  Write some Java code that asks the user how many favorite things they have.
     *  Based on their answer, you should create a String array of the correct size.
     *  Then ask the user to enter the things and store them in the array you created.
     *  Finally, print out the contents of the array.
     */
    public void favoriteThings() {
        System.out.println("How many favorite things do you have? ");
        int favNum = input.nextInt();
        String[] favThings = new String[favNum];
        for (int i = 0; i <favThings.length; i++){
            System.out.println("Favorite thing " + (i+1) + ":");
            favThings[i] = input.next();
        }
        for (String thing : favThings){
            System.out.println(thing);
        }
    }
}

//String method
    /**import java.io.*;
import java.util.*;
import java.util.Scanner;




    public class Solution {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.

            String[] parts = s.split("[\\s\\']+");
            System.out.println(parts.length);
            for(String part : parts){
                System.out.println(part);
            }
            scan.close();
        }
    */









