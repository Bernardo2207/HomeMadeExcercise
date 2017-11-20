
public class QuadraticPolynomial {

	 private double a;
	 private double b;
	 private double c;
	 //Getters
	 public double getA() {return a;}
	 public double getB() {return b;}
	 public double getC() {return c;}
	 
	 //Setters
	 public void setA(double a) {this.a=a;}
	 public void setB(double b) {this.b=b;}
	 public void setC(double c) {this.c=c;}
	 
	 //Constructor
	 public QuadraticPolynomial(double a, double b, double c) {
		 this.a=a;
		 this.b=b;
		 this.c=c;
	 }
}
