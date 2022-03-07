package fundamentalprograms;

public class NumberSwapMain {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Please pass two number arguments");
		}else {
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			NumberSwap swap=new NumberSwap();
			swap.accept(n1, n2);
			System.out.println("======Original values=======");
			swap.display();
			swap.swapValues();
			System.out.println("========Swap values=========");
			swap.display();
			
			
			
		}
	}

}
