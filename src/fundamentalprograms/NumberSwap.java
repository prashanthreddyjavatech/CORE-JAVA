package fundamentalprograms;
// Write a program to interchange two values
public class NumberSwap {
	int a,b;
	void accept(int n1,int n2) {
		a=n1;
		b=n2;
	}
	void swapValues() {
		int t=a;
			a=b;
			b=t;
	}
	void display() {
		System.out.println("val of a: "+a);
		System.out.println("val of b: "+b);
	}

}
