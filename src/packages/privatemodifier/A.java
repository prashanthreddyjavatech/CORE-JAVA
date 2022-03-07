package packages.privatemodifier;

 class A {
	private int n1=20;
	private A() {
		System.out.println("This construcor wont get acess to create object in another class");
	}
	private void disp() {
		System.out.println("private modifier access check");
	}

}
