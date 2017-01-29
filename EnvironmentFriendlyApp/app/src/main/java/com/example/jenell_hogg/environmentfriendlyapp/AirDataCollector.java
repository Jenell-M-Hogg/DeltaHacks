package com.example.jenell_hogg.environmentfriendlyapp;


import com.opencsv.*;

import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by jenell-hogg on 2017-01-28.
 */

public class AirDataCollector {
    //This class fills the model AirData objects with sample data provided on the inhalemap website.

    public AirDataCollector(){

    }

    public ArrayList<AirData> getData() throws Exception{

        ArrayList<AirData> data = new ArrayList<AirData>();

            CSVReader reader = new CSVReader(new FileReader(""));
            String[] nextLine;
            while((nextLine = reader.readNext()) != null){
                //Next line is a string array
                float lat = Float.parseFloat(nextLine[1]);
                float lng = Float.parseFloat(nextLine[2]);
                int mean = Integer.parseInt(nextLine[3]);
                int samples = Integer.parseInt(nextLine[4]);

                //Some condition here to add to the list


                AirData ad = new AirData(nextLine[0], lat, lng, mean, samples);
                data.add(ad);
            }

        return data;

    }
}
