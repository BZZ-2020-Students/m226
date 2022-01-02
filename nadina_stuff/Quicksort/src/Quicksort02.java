import java.util.Arrays;

public class Quicksort02 {
    public static void main(String[] args) {
        int[] array = new int[] {4,7,2,8,9,6,1,3};

        System.out.println("Before: ");
        System.out.println(Arrays.toString(array));

        // low index 0, and the high index last element = length - 1
        quicksort02(array, 0, array.length -1);

        System.out.println("After: ");
        System.out.println(Arrays.toString(array));

    }
    private static void quicksort02(int[] array, int lowIndex, int highIndex) {

        if(lowIndex >= highIndex){
            return;
        }
        // choose a pivot - last element of the array
        int pivot = array[highIndex];
        int leftPointer = lowIndex;

        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);

        quicksort02(array, lowIndex, leftPointer - 1);
        quicksort02(array,leftPointer + 1, highIndex);
    }

    private static void swap(int[] array, int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

}

