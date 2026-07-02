import java.util.Scanner;

public class Pairsum {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int targetSum = input.nextInt();

        boolean pairFound = false;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("\n--- Pair Found! ---");
                    System.out.println("Indices: [" + i + "] and [" + j + "]");
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);

                    pairFound = true;
                    break;
                }
            }
            if (pairFound) {
                break;
            }
        }

        if (!pairFound) {
            System.out.println("\nNo unique pair exists in the array that adds up to " + targetSum + ".");
        }
    }
}
