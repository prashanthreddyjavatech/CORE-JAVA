package java8featutes.lamdaexpression;

public class LambdaExpressionEx2 {
	public static void main(String[] args) {
		Addition add=(n1,n2)->n1+n2;
		System.out.println(add.sum(10, 20));
	}

}
