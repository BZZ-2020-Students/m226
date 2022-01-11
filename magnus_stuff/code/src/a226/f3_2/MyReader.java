package a226.f3_2;

import java.util.Scanner;

public class MyReader {
    private static MyReader reader;
    private Scanner scanner;

    public MyReader(){

    }

    public static MyReader getInstance(){
        if(reader == null){
            reader = new MyReader();
        }
        return reader;
    }

    public int getInt(String hinweis){
        return scanner.nextInt();
    }

    public double getDouble(String hinweis){
        return scanner.nextDouble();
    }

    public String getString(String hinweis){
        return scanner.nextLine();
    }

    public static void main(String[] args) {

    }
}
