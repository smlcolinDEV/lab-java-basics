public class Basics {
    public static void main(String[] args) {
        diffLargestAndSmallest();
        firstAndSecondSmallest();
    }

    public static void diffLargestAndSmallest() {
        int[] Array = {12, 34, 56, 69, 2, 78};
        int diff = 0;
        int smallest = Array[0];
        int largest = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array.length > 0) {
                if (smallest > Array[i]) {
                    smallest = Array[i];
                }
                if (largest < Array[i]) {
                    largest = Array[i];
                }

            }


        }
        diff = largest - smallest;
        System.out.println("The difference between the smallest (" + smallest + ") and largest (" + largest + ") integer of this array is :" + diff);
    }

    public static void firstAndSecondSmallest() {
        int[] Array = {12, 34, 56, 69, 2, 78,8};
        int diff = 0;
        int firstSmallest = 0;
        int secondSmallest = 0;
        if (Array.length > 1) {
            if (Array[0] > Array[1]) {
                firstSmallest = Array[0];
                secondSmallest = Array[1];
            } else {
                firstSmallest = Array[1];
                secondSmallest = Array[0];
            }
            for (int i : Array) {
                if (firstSmallest > i) {
                    secondSmallest = firstSmallest;
                    firstSmallest = i;
                }
                if (secondSmallest > i && firstSmallest < i) {
                    secondSmallest = i;
                }

            }
            System.out.println("second smallest " + secondSmallest);
            System.out.println("first smallest " + firstSmallest);


        }

    }
}
