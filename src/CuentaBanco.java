
public class CuentaBanco {

	private double balance;
	private int NumeroDeCuenta;
	
	public CuentaBanco(double balanceInicial) {
		balance=balanceInicial;
	}
	//Agregar dinero a la cuenta
	public void depositar(double cantidad) {
		balance=balance + cantidad;
	}
	public double balance() {return balance;}
	
	public void retirar(double cantidad) {
		
		balance = balance-cantidad;
	}
}
