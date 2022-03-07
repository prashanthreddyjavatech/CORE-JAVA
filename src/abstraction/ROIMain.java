package abstraction;

public class ROIMain {
	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println(" SBI ROI: "+b.getROI());
		b=new ICICI();
		System.out.println(" ICICI ROI: "+b.getROI());
	}

}
