package main.java.initialize;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextConverter {
    public static void main(String[] args) {
        System.out.println("HOLA");
        Gson gson = new Gson();
		try{
            System.out.println("HO");
            Catalog cat = gson.fromJson(new BufferedReader(new FileReader("/Users/Bharat_Srirangam/Desktop/Website/CourseTree/CourseTreePrototype/src/main/java/initialize/data.txt")), Catalog.class);
            System.out.println(cat.getCatalog().get(0).getID());
            Course toAdd = (new Course());
            toAdd.setID("CS1332");
            cat.add(toAdd);
            System.out.println(gson.toJson(cat));
		} catch (Exception e) {
            e.printStackTrace();
		}
        System.out.println("AMIGOS");
    }
}