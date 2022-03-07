package java8featutes.lamdaexpression;

public class LambdaExpressionEx1 {
	public static void main(String[] args) {
		
		Message m=name->{
			return "Hello "+name;
		};
		System.out.println(m.display("prashanth"));
	}

}
