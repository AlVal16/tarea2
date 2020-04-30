import java.util.Scanner;

public class Tar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner (System.in); 
		System.out.println("Ingrese género (h/m)");
		String genero=scan.next();
		
		if (genero.equals("h") ){
		    System.out.println("Bienvenido Caballero");
		}
		
		    else {
		    	System.out.println("Bienvenida Dama");
		   		}
	       double precio =0;
	       System.out.println("Ingresar edad");
	       int edad=scan.nextInt();
	       if (edad > 6 && edad <=12 ) {
	    	   precio = 10;
	       } else {
	        	if (edad > 12 && edad <= 60 ) {
	        		precio = 20;
	        	} else {
	        		if (edad > 60) {
	        	     precio = 15;
	        		}
	        		System.out.println("Se le cobrarán S/ " + precio );
	        	}
	       }
	}
	 
}
  
         
	
	       
	



