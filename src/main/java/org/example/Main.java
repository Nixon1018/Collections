package org.example;

import java.util.HashMap;
import java.util.logging.Logger;

public class Main{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<String,String>();

        hmap.put("std1","luke");
        hmap.put("std2","john");
        hmap.put("std3","rick");
        hmap.put("std4","brook");
        hmap.put("std5","patrick");
        String hash = ""+hmap;
        Log.info(hash);
        String size = "Size: "+hmap.size();
        Log.info(size);
        String key = ""+hmap.keySet();
        Log.info(key);
        String val = ""+hmap.values();
        Log.info(val);
        hmap.remove("std3");
        hash = ""+hmap;
        Log.info(hash);
        hmap.replace("std2", "pravin");
        hash = ""+hmap;
        Log.info(hash);
        Log.info(hmap.get("std4"));

    }


}