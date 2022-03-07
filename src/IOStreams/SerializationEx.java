package IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException {
		Employee e1=new Employee(1, "abc", 1000);
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\IOStreams\\ser.txt");  
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
	}

}
