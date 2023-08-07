package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String readProperty(String valuetoRead) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties"; // use to run on every environment
		
		File file= new File(path);
		
		FileInputStream f= new FileInputStream(file);
		
		Properties p=new Properties();
		
		p.load(f);
		
		String value=p.getProperty(valuetoRead);
	
		System.out.println(value);
	
		return value;
	}
	
}
