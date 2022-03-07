package collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\collections\\database.properties");
		
		Properties p=new Properties();
		p.load(file);
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
	}

}
