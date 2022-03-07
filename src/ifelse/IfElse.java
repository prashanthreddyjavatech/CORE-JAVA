package ifelse;

public class IfElse {
public static void main(String[] args) {
	
	System.out.println("==========Only if condition==========");
	int age=16;
	if(age<18) {
		System.out.println("Minor Guy");
	}
	
	System.out.println("=======if else condition==========");
	int age1=20;
	if(age1>=18) {
		System.out.println("Major Guy");
	}
	else {
		System.out.println("Minor Guy");
	}
	
	
	System.out.println("=======if-else-if condition==========");
	int marks=60;
	  if(marks<35){  
	        System.out.println("fail");  
	    } 
	  else if(marks>=35 && marks<60){  
	        System.out.println("Pass with second class");  
	    }
	  else if(marks>=60 && marks<75){  
	        System.out.println("Pass with first class");  
	    }
	  else {
		  System.out.println("Pass with distinction"); 
	  }
	  
	  System.out.println("=======Nested if  condition==========");
	  int n1=15,n2=10,n3=5;
	  if (n1 >= n2) {
          if (n1 >= n3) {
        	  System.out.println("LargestNumber is : "+n1);
          } else {
        	  System.out.println("LargestNumber is : "+n3);
          }
      } 
}
}
