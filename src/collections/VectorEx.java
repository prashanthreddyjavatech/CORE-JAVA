package collections;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		Vector<Integer> in = new Vector<Integer>();  
        //Add elements in the vector  
        in.add(100);  
        in.add(200);  
        in.add(300);  
        in.add(200);  
        in.add(400);  
        in.add(500);  
        in.add(600);  
        in.add(700);
        in.remove(5);
        System.out.println(in);
        if(in.contains(100)) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }
	}

}
