
public class Circle extends Shape {
	
	double r,ca;

	public Circle(double r) {
		this.r = r;
	}
	
	public void calcArea(){
		ca = 3.14*r*r;
		System.out.println("Area of the circle is:\t"+ca);
	}

	public double getR() {
		return r;
	}

	public double getCa() {
		return ca;
	}
	
	
	

}
