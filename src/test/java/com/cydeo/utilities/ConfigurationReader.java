package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// this class is only 1 time we are creating in utilities package

public class ConfigurationReader {

    //it is static because we using it in static method
    // it is private because I will be using only in this class
    private static Properties properties = new Properties();

    // we want to open the properties file and load to properties obj ONLY once before reading
    // having static block because static runs first
   static  {
        try {

            FileInputStream file = new FileInputStream("config.properties");

            properties.load(file);
            //close the file after loading
            // if we do not close the file, it will take space from computer memory like Scanner
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}
