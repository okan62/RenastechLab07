package Utils;

import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    private static Properties properties=new Properties();

    static{
        String PropertiesFilePath="Configurations.properties";

        try{
            FileInputStream fileInputStream=new FileInputStream(PropertiesFilePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Properties file NOT founded");
        }
    }
    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }

}
