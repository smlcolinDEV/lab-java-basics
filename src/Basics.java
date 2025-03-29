public class Basics {
    public static void main(String[] args) {
        // Define an array of integers.
        int[] array = {12, 90, 56, 1, 2, 78};

        // Call methods to calculate the difference between the largest and smallest element,
        // and to find the two smallest elements in the array.
        diffLargestAndSmallest(array);
        firstAndSecondSmallest(array);
    }

    /**
     * Method to calculate the difference between the largest and smallest element in an array.
     * @param array The array of integers.
     */
    public static void diffLargestAndSmallest(int[] array) {
        // Initialize variables to store the smallest and largest elements.
        int smallest = array[0];
        int largest = array[0];

        // Check if the array is not empty.
        if (array.length > 0) {
            // Iterate through each element in the array.
            for (int j : array) {
                // Update the smallest element if the current element is smaller.
                if (smallest > j) {
                    smallest = j;
                }
                // Update the largest element if the current element is larger.
                if (largest < j) {
                    largest = j;
                }
            }
        }

        // Calculate the difference between the largest and smallest elements.
        int diff = largest - smallest;

        // Print the result.
        System.out.println("The difference between the smallest (" + smallest + ") and largest (" + largest + ") integer of this array is: " + diff);
    }

    /**
     * Method to find the two smallest elements in an array.
     * @param array The array of integers.
     */
    public static void firstAndSecondSmallest(int[] array) {
        // Check that the array contains at least two elements.
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize variables to store the two smallest elements.
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Iterate through each element in the array.
        for (int i : array) {
            // Update the first smallest element if the current element is smaller.
            if (firstSmallest > i) {
                secondSmallest = firstSmallest;
                firstSmallest = i;
            }
            // Update the second smallest element if the current element is smaller than the second smallest but larger than the first smallest.
            else if (secondSmallest > i) {
                secondSmallest = i;
            }
        }

        // Print the two smallest elements.
        System.out.println("First smallest: " + firstSmallest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}
