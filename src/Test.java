import java.util.Scanner;
public class Test {

	public static void main(String[] args){
	/*
		//Tratare de usar la clase circulo que cree.
		Scanner sc= new Scanner(System.in);
		double radio;
		//Declare una variable double con nombre"radio".
		System.out.println("Ingrese el valor del radio de un circulo: ");
		
		radio= sc.nextDouble();
		
		//radio guardara el proximo valor double que se ingrese en el teclado.
		Circulo c1= new Circulo(radio);
		//Utilize el tipo Circulo que cree.
		//c1 es el nombre de la variable que guarda el objeto Circulo.
		//El valor de los parametros se refiere a el radio de el circulo.
		
		System.out.println("El Radio de un circulo de radio 5 es: "+ c1.getRadio());
		System.out.println("La circunferencia de un circulo de radio 5 es: "+ c1.getCircunferencia());
		
	*/
		System.out.println("Probando la clase de Banco");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Ingrese cuanto dinero quiere agregar a ka cuenta: ");
		double dinero= sc.nextDouble();
		CuentaBanco nano = new CuentaBanco(dinero);
		
		int opcion=5;
		while(opcion!=0) {
			
			System.out.println("Sellecione una opcion:");
			System.out.println("Ver Balance #1\n Retirar dinero #2 \n Depositar dinero #3 \n \n Para Salir oprima el 0");
			opcion=sc.nextInt();
			if(opcion == 1) {System.out.println(nano.balance()); }
			
			if(opcion==2) {
				System.out.println("Cantidad que desee retirar:");
				nano.retirar(sc.nextDouble());
				}
			
			if (opcion==3 ) {
			System.out.println("Cantidad que desea depositar:");
			 nano.depositar(sc.nextDouble());
			
				}
			}
		}
	}

