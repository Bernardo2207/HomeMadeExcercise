import java.util.Scanner;
public class Practice {

	public static void main(String args[]) {
	//Codigo para practicar
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
		
	//Contar cantidad de letras en un String
		String mensaje = "Este mensaje es de practica";
	//Cuenta cantidad de caracteres incluyendo espacios en blanco.
		System.out.println(mensaje.length());
		String mensajeMod= mensaje.replace("practica", "prueba");
	//reemplaza los caracteres del String mensaje que contenga "practica", con la palabra "prueba"
		System.out.println(mensajeMod);
		
		//intentare crear un programa que calcule las millas por galon.
		System.out.println("Programa para obtener Millas por Galon de su auto");
		System.out.println("Costo de litro en la gasolinera: ");
		double  millas,range,litro,pago;
		litro= sc.nextDouble();
		System.out.println("Cantidad que pago: ");
		pago= sc.nextDouble();
		System.out.println("Introduzca las millas recorridas; ");
		millas = sc.nextDouble();
		range= (millas)/(pago*litro*4);
		System.out.println("Las millas por galon de su auto son: "+ range);
		
		
		
	}
}
