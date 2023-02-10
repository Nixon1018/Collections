package org.example;

import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.Comparator;

public class Treeset{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        names.add("luke");
        names.add("rick");
        names.add("alan");
        names.add("jessy");

        String tree ="TreeSet" + names;
        Log.info(tree);
        String stree = "ascending order: " + names;
        Log.info(stree);
        stree = ""+names.contains("luke");
        Log.info(stree);
        names.remove("jessy");
        stree = ""+names;
        Log.info(stree);
        stree = "First element: " + names.first();
        Log.info(stree);
        stree = "Last element: " + names.last();
        Log.info(stree);
        String size = "Length: " + names.size();
        Log.info(size);
        names.clear();
    }
}