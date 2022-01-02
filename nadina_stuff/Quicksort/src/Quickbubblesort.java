import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Quickbubblesort {
    public static void main(String[] args) {
        long startTime;

        Quickbubblesort run = new Quickbubblesort();
        startTime = new Date().getTime();
        run.bubblesort();
        System.out.println("Dauer der Sortierung: " + (new Date().getTime() - startTime) + "ms");

        startTime = new Date().getTime();
        run.Quicksort();
        System.out.println("Dauer der Sortierung: " + (new Date().getTime() - startTime) + "ms");

    }

    public void bubblesort(){
        Random random = new Random();
        int[] bubble = new int[100];

        for(int i = 0; i < bubble.length; i ++){
            bubble[i] = random.nextInt(100);
        }


        // Sorting
        boolean swap = true;
        while(swap){
            swap = false;
            for (int i = 0; i < bubble.length - 1;i++){
                if(bubble[i] > bubble[i + 1]){
                    swap = true;
                    int temp = bubble[i];
                    bubble[i] = bubble[i + 1];
                    bubble[i + 1] = temp;
                }
            }
        }

        System.out.println("Bubblesort: ");
        System.out.println(Arrays.toString(bubble));
    }

    public void Quicksort(){
        Random random = new Random();
        int[] array = new int[100];

        for(int i = 0; i < array.length; i ++){
            array[i] = random.nextInt(100);
        }

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

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quicksort02(array, lowIndex, leftPointer - 1);
        quicksort02(array,leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
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
        return leftPointer;
    }

    private static void swap(int[] array, int i1, int i2){
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }

}
