package org.example;

import java.util.*;
import java.util.logging.Logger;

class Memberdetails {
    String memberName;
    String memberAddress;
    int id;

    Memberdetails(String MemberName, String MemberAddress, int id) {
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

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
            s1 =s.memberName + " " + s.memberAddress+ " " + s.id;
            Log.info(s1);
        }
        s1 = "" + set.remove(sd1);
        Log.info(s1);
        for (Memberdetails s : set) {
            s1 = s.memberName + " " + s.memberAddress + " " + s.id;
            Log.info(s1);
        }
        s1 = ""+set.size();
        Log.info(s1);
        s1 = ""+sd1.hashCode();
        Log.info(s1);

    }
}