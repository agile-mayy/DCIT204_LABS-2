import java.util.Scanner;

public class Findmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        // Assume the first element is the maximum
        int max = numbers[0];
        int maxIndex = 0;

        // Search for the maximum value
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // Display the result
        System.out.println("\n===== RESULT =====");
        System.out.println("Maximum value: " + max);
        System.out.println("Index: " + maxIndex);

        input.close();
    }
}
