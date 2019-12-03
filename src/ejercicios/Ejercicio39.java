package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"

// Ejercicio 39 - Hoja VIII (5) - Mostrar los números primos del 1 al 100

public class Ejercicio39 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int n1,n2;
	boolean primo;
        
        // Montamos un bucle que recorra los primeros 100 números
	for (n1=1;n1<101;n1++) {
		primo=true; // De entrada, consideramos que el número es primo salvo que en el siguiente bucle detectemos lo contrario

		// "dopamos" el algoritmo saltándonos los pares mayores a 2
                if (n1>2 && n1<99 && n1%2==0){
                    n1++;
                }

		// Hacemos un bucle para dividir el número entre todos los menores o iguales que él
		for (n2=1;n2<=n1;n2++){
                    // Si el número es divisible entre algún número de los comprendidos entre 1 y si mismo NO ES PRIMO
                    if ((n2>1) && (n2<n1) && (n1%n2==0)) {
                        // Cambiamos el valor a 'no primo'
                                        primo=false;
                    }
                } // Terminamos de recorrer los posibles divisores

                // Comprobamos si tras el bucle el número es o no primo. Si lo es, lo mostramos por pantalla
                if (primo==true) {
                    System.out.printf("%d ",n1);
                }
        } // Terminamos de recorrer los 100 primeros números
          
   }
}