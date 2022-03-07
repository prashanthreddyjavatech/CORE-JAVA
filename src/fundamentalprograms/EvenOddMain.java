package fundamentalprograms;

public class EvenOddMain {
	public static void main(String[] args) {
		if(args.length!=1) {
			System.out.println("Please pass one value");
		}
		int n1=Integer.parseInt(args[0]);
		EvenOdd ed=new EvenOdd();
		ed.set(n1);
		ed.checkEvenOdd();
		
	}

}
