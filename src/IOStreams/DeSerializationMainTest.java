package IOStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationMainTest {
	public static void main(String[] args) throws Exception {
		 FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\IOStreams\\ser.txt");
		 ObjectInputStream ois=new ObjectInputStream(fin);
		Employee e1=(Employee) ois.readObject();
		System.out.println(e1.id+":"+e1.name+":"+e1.salary);
		 
	}

}
