package IOStreams;

import java.io.FileInputStream;

public class FileInputStreamExample {
	 public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\IOStreams\\test.txt");    
           int i=fin.read();  
           System.out.print((char)i);    
 
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }  
}
