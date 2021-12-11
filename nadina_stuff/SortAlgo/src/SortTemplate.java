/*
* Author: Amsler Nadina (shirin197)
* Date:
*/


import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class SortTemplate {

    private int[] unsortedArray;
    private final int SIZE = 10;
    private final int RANGE = 20;
    int zwschSpeicher = 0;


    public static void main(String[] args) {
        long startTime;

        SortTemplate programm = new SortTemplate();
        startTime = new Date().getTime();
        programm.sort();
        System.out.println("Dauer der Sortierung: " + (new Date().getTime() - startTime) + "ms");
    }

    SortTemplate() {
        Random rand = new Random();
        unsortedArray = new int[SIZE];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = rand.nextInt(RANGE);
        }
    }

    private void sort() {
        for(int i = 0; i < unsortedArray.length - 1; i++){
            for(int j = 0; j < (unsortedArray.length - 1 - i); j++){
                if(unsortedArray[j + 1] <= unsortedArray[j]){  // Zahlen vergleichen
                    // tausch von j und j + 1
                    zwschSpeicher = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = zwschSpeicher;
                }
            }
        }
        System.out.println(Arrays.toString(unsortedArray));
    }
}
