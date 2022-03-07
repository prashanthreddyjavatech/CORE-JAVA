package exceptionhandling;

public class TryCatchBlockExamples {
	public static void main(String[] args) {
		try {
			int n1 = 10, n2 = 0;
			//int result = n1 / n2;
			
			String name=null;
			//System.out.println(name.length());
			
			String s="xyz";
			//int i=Integer.parseInt(s);
			
			int a[]=new int[10];
			a[20]=100;

		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(NullPointerException ne){
			System.out.println(ne);
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe);
		}
		System.out.println("next lines of code exceution start");
	}
}
