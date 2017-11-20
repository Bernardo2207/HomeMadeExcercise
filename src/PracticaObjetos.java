import java.awt.Rectangle;
public class PracticaObjetos {
	
	public static void main (String args[]) {
		
		
		Rectangle caja = new Rectangle(5,5,31,45);
		
		Double ancho,alto;
		
		ancho= caja.getWidth();
		alto = caja.getHeight();
		
		System.out.println("El ancho de la caja es:" +ancho +" y el alto es: "+alto);
		//sysout(ctrl + space)
		//vaos a tratar de modificar los valores
		int i;
	
		for(i=0;i<8;i++)
		{	caja.translate(5,0);
			System.out.println("La posicion en X ahora es: "+ caja.getX());
			// b.translate mueve de posicion X y Y de el objeto.
			//b.getX() busca  la posicion de X de el objeto.
			//b.setSize() cambia el valor de widht y Height.
			
			
		}
			
		
	}
}
