package fundamentalprograms;

public class PosNegNumber {
	int n;
	public void set(int x) {
		n=x;
	}
	public void checkPositiveNegative(){
		if(n<0) {
			System.out.println(n+ " is a negative number");
		}
		else if(n==0) {
			System.out.println("Given number is "+n);
		}
		else {
			System.out.println(n+ " is a positive number");
		}
	}

}
