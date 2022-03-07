package fundamentalprograms;
// write a java program to check given number is even or odd
public class EvenOdd {
	int n;
	public void set(int x) {
		n=x;
	}
	public void checkEvenOdd(){
		if(n==0) {
			System.out.println("Invalid input");
		}
		else if(n%2==0) {
			System.out.println(n+" is a even number");
		}
		else {
			System.out.println(n+ " is a odd number");
		}
	}
}
