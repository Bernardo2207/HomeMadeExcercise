
public class Circulo {
	private double radio;
	//getter
	double getRadio() {return radio;}
	//setter
	public void setRadio(double valor) {this.radio=valor;}
	//El metodo es void porque no va a devolver valor, va a asignar un valor.
	
	double  getCircunferencia() {return ( (radio*2)*3.14 ); }
	
 public Circulo(double radio ) {
	 this.radio=radio;
 }	
	
}
