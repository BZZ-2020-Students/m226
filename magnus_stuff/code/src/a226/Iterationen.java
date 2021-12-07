package a226;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterationen {
    private ArrayList<String> collection = new ArrayList<>();

    public Iterationen() {
        collection.add("One");
        collection.add("Two");
        collection.add("Three");
        collection.add("Four");
        collection.add("Five");
        collection.add("Six");
        iteratorHasNext();
        System.out.println();
        forLoop();
        System.out.println();
        forEachLoop();
    }

    private void iteratorHasNext() {
        System.out.println("Using Iterator: ");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private void forLoop() {
        System.out.println("Using For loop: ");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }

    private void forEachLoop() {
        System.out.println("Using ForEach Loop: ");
        for (String s : collection) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Iterationen it = new Iterationen();
    }
}
