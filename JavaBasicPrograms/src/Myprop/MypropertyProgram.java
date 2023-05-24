package Myprop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MypropertyProgram {

	public static void main(String[] args) {

		String fileLocation = "E:\\AutomationSession\\Workspace\\JavaBasicPrograms\\src\\Myprop\\TestData.properties";

        try {
			FileInputStream fis = new FileInputStream(fileLocation);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println(prop.getProperty("applicationUrl"));
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("expectedTitle"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
