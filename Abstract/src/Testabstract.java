
public class Testabstract {

	public static void main(String[] args) {
		Shape s=null;
		s=new Circle(3.3);
		s.calcArea();
		s=new Triangle(5.5,4.0);
		s.calcArea();

	}

}
