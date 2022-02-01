package testing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    private final int numbers = 10;
    private ArrayList<Integer> list = new ArrayList<>();

    public void writeMenu(String fileName) {
        try{
            FileWriter fw = new FileWriter(fileName);
            for(int i=0; i < numbers; i++){
                int randomNumber = (int)((Math.random()*numbers) + 1);
                for (Integer integer : list) {
                    if(integer == randomNumber){
                        i--;
                        break;
                    }
                }

                System.out.println(randomNumber);
                fw.write(Integer.toString(randomNumber));
                fw.write("\n");
            }
            System.out.println(fw);

            fw.close();
            fw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Test();
    }

    public Test(){
        writeMenu("src\\output\\hello.txt");
    }
}
