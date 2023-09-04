package com.demo;

import java.util.HashMap;

public class HashMaps {
    HashMap<String, Integer> examScores= new HashMap<String, Integer>();

    public void CreatingHashMap(){

        examScores.put("Math",90);
        examScores.put("Sociology",80);
        examScores.put("English", 95);
        examScores.put("Computer Programming",98);
        examScores.put("Physics",75);
    }

    public void HashMapOperations(){

        CreatingHashMap();
        //printed in alphabetical order
        System.out.println("Printed in alphabetical order: "+examScores.toString());
        //print specific one
        System.out.println("Get English: "+examScores.get("English"));
        //editable
        examScores.replace("Math",78);
        System.out.println("Replace math score with 78: " + examScores.toString());
        //put if absent
        examScores.putIfAbsent("Biology", 80);
        System.out.println("Put Biology after if check: "+examScores.toString());
        //remove element
        examScores.remove("Sociology");
        System.out.println("Sociology and its score won't be shown bc we removed it: "+ examScores.toString());
        //contains or not
        System.out.println("Our HashMap contains Math: "+examScores.containsKey("Math")+" and it contains value 100: "+examScores.containsValue(100));
        //isEmpty
        System.out.println("Is our HashMap Empty: "+examScores.isEmpty());
        //hashmap foreach method
        examScores.forEach((subject, score) ->{System.out.println("print elements using foreach: "+subject+" - "+score);});
        //clear hashmap
        examScores.clear();
        System.out.println("All elements are deleted: "+ examScores.toString());
    }
}
