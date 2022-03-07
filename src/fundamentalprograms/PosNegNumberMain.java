package fundamentalprograms;

public class PosNegNumberMain {
	public static void main(String[] args) {
	if(args.length!=1) {
		System.out.println("Please pass one value");
	}
	int n1=Integer.parseInt(args[0]);
	PosNegNumber numCheck=new PosNegNumber();
	numCheck.set(n1);
	numCheck.checkPositiveNegative();
	}
}
