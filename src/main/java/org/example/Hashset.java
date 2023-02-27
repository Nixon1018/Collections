package org.example;

import java.util.*;
import java.util.logging.Logger;



public class Hashset{
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        HashSet<Memberdetails> set = new HashSet<Memberdetails>();
        Memberdetails sd1 = new Memberdetails("luke", "1st street", 007);
        set.add(sd1);
        sd1 = new Memberdetails("rick","2nd Street", 109);
        set.add(sd1);
        sd1 = new Memberdetails("vikram", "3rd Street", 900);
        set.add(sd1);
        String s1;

        for (Memberdetails s : set) {
            s1 =s.membername + " " + s.memberaddress+ " " + s.id;
            Log.info(s1);
        }
        s1 = "" + set.remove(sd1);
        Log.info(s1);
        for (Memberdetails s : set) {
            s1 = s.membername + " " + s.memberaddress + " " + s.id;
            Log.info(s1);
        }
        s1 = ""+set.size();
        Log.info(s1);
        s1 = ""+sd1.hashCode();
        Log.info(s1);

    }
}