package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String readProperty(String valuetoRead) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties"; // use to run on every environment
		
		File file= new File(path); // It provides a way to interact with the file system, including operations like creating,
									//deleting, renaming, and checking the existence of files and directories.
		
		FileInputStream f= new FileInputStream(file); // the FileInputStream class is used to read data from a file in a byte-oriented manner.
		
		Properties p=new Properties(); // it is use to retrieve and store data, or can be used to save and load small amounts of data
		
		p.load(f);
		
		String value=p.getProperty(valuetoRead);
	
		System.out.println(value);
	
		return value;
	}
	
}
