package arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        boolean isSorted = true;
        boolean increasingOrder = false;
        if (arr[0] <= arr[arr.length - 1])
            increasingOrder = true;

        int i = 0;
        if (increasingOrder) {
            while (i < arr.length - 1) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                }
                i++;
            }
        } else {
            while (i < arr.length - 1) {
                if (arr[i] < arr[i + 1]) {
                    isSorted = false;
                    break;
                }
                i++;
            }
        }

        System.out.println("Sorted " + isSorted);
    }
}