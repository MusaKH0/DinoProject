package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class DinoFileManager {

    private static final String filename = "dinosaur.csv";

    public static ArrayList<Dino> getDinosaur(){
        ArrayList<Dino> dinosaurs = new ArrayList<>();

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            boolean firstLine = true;

            while ((line = bufferedReader.readLine()) !=null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }

                String[] lineParts = line.split("\\|");
                if (lineParts.length == 5){
                    String name = lineParts[0];
                    int age = Integer.parseInt(lineParts[1]);
                    String species = lineParts[2];
                    String diet = lineParts[3];
                    double weight = Double.parseDouble(lineParts[4]);

                    dinosaurs.add(new Dino(name, age, species, diet, weight));
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dinosaurs;
    }
}
