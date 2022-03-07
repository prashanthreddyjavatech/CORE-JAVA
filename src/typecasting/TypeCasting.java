package typecasting;

public class TypeCasting {
	public static void main(String[] args) {
		
		int a=10;  
		float f=a;  
		System.out.println(a);  
		System.out.println(f);
		
		
		System.out.println(" =============  DownCasting ===========");
		// DownCasting 
		float f1=10.5f;  
		//int z=f;//Compile time error  
		int z=(int)f;  
		System.out.println(f);  
		System.out.println(z);
		
		
		System.out.println(" =============  Overflow ===========");
		int m=130;  
		byte b=(byte)m;  
		System.out.println(m);  
		System.out.println(b);
		
		System.out.println(" =============  byte data type lower type ===========");
		byte a1=10;  
		byte b1=10;  
		//byte c1=a1+b1;//Compile Time Error: because a+b=20 will be int  
		byte c1=(byte)(a1+b1);  
		System.out.println(c1);
		
		System.out.println(" =============  Upcasting ===========");
		int p=256;
		double d=p;
		System.out.println(d);
	}

}
