import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //bubble sort
        int[] unsortedArray = new int[]{2, 1, 5, 4, 7, 3, 10, 6};
        int k = unsortedArray.length;
        while (k != 0) {
            for (int i = 0; i < k - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                }
            }
            k--;
        }
        System.out.println(Arrays.toString(unsortedArray));

        //binnary search
        int target = 10;
        int stop = unsortedArray.length - 1;
        int start = 0;
        while (start <= stop) {
            int middle = start + (stop - start) / 2;
            if (target == unsortedArray[middle]) {
                System.out.println("Am gasit valoarea " + target + " pe pozitia " + middle);
                break;
            } else if (target > unsortedArray[middle]) {
                start = middle + 1;
            } else if (target < unsortedArray[middle]) {
                stop = middle - 1;
            }
        }
        if (start > stop) {
            System.out.println("Nu am gasit valoarea " + target);
        }
    }
}
