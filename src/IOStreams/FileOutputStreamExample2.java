package IOStreams;

import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\CoreJava\\src\\IOStreams\\test.txt");    
           fout.write(65);    
           fout.close();    
           System.out.println("success...");    
          }catch(Exception e){System.out.println(e);}    
    } 
}
