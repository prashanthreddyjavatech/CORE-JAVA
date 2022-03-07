package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();  
		p.setProperty("username","prashanth");  
		p.setProperty("email","password");  
		
		FileWriter f=new FileWriter("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\collections\\info.properties");
		  
		p.store(f, "database file");
		  
		}
	}

