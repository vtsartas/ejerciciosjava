package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 24 - Hoja VI (1) - Indicar importe menú según cantidades consumidas y precios fijos

public class Ejercicio24 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int bocadillos,refrescos,cervezas;
        double importe,total,preciobocadillo,preciorefresco,preciocerveza;
	String leerotro;
        
        
        // indicamos el precio de cada artículo
	preciobocadillo=1.50;
	preciocerveza=0.75;
        preciorefresco=1.05;
        
        Scanner entrada=new Scanner(System.in);

	total=0; // incializamos el total de caja a cero
        leerotro="s"; // para simplificar, esta vez comprobaremos directamente esta cadena sin usar booleanos
        
        // Mientras 'otrocliente' sea true pediremos otra cuenta
            while (leerotro.equals("s")) {
                System.out.println("Introduce los artículos consumidos por el cliente: ");
                System.out.println("- Número de bocadillos de jamón: ");
                bocadillos=entrada.nextInt();
                System.out.println("- Número de cervezas: ");
                cervezas=entrada.nextInt();
                System.out.println("- Número de refrescos: ");
                refrescos=entrada.nextInt();
                
		importe=(bocadillos*preciobocadillo)+(cervezas*preciocerveza)+(refrescos*preciorefresco);
		total=total+importe;
                
		System.out.println("El importe de la cuenta de este cliente es "+importe+". El total acumulado es "+total+".");

		System.out.println("\n¿Quieres introducir datos de una nueva cuenta (s/n)?");
                leerotro=entrada.next();
            }      
            entrada.close();
   }
}








