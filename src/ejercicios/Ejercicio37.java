package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 37 - Hoja VIII (3) - Calcular el IMC según la edad, peso y estatura dadas

public class Ejercicio37 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int edad;
        float peso,estatura,imc;
        boolean edadnormal;
	String otrocalculo="s";
        
		Scanner valor=new Scanner(System.in);

        // Mientras digamos que sí seguirá comprobando
        while (otrocalculo.equals("s")) {
                            
                System.out.println("Introduce tu edad:");
		edad=valor.nextInt();
		System.out.println("Introduce tu altura en centímetros:");
		estatura=valor.nextFloat();
		System.out.println("Introduce tu peso (en Kg, usa la coma ',' para los decimales):");
		peso=valor.nextFloat();

		// el cálculo se hace con la estatura en metros por lo que introduzco la conversión de los centímetros
		imc=peso/(estatura*estatura/10000);

		if (imc<18.5) {
			System.out.printf("Tu IMC es %.2f.\nSe considera que tu peso es INFERIOR al normal.\n",imc);
		}

		if (imc>=18.5 && imc<25) {
			System.out.printf("Tu IMC es %.2f.\nSe considera que tu peso es NORMAL.\n",imc);
		}

		if (imc>=25 && imc<30) {
			System.out.printf("Tu IMC es %.2f.\nSe considera que tu peso es SUPERIOR al normal.\n",imc);
		}

		if (imc>=30) {
			System.out.printf("Tu IMC es %.2f.\nSería indicativo de una posible OBESIDAD.\n",imc);
		}

		// según edad
		edadnormal=false;

		if ((edad>=19 && edad<25) && (imc>=19 && imc<=24)) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f), tu peso es normal.",edad,imc);
			edadnormal=true;
		}

		if ((edad>=25 && edad<35) && (imc>=20 && imc<=25)) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f), tu peso es normal.",edad,imc);
			edadnormal=true;
		}

		if ((edad>=35 && edad<45) && (imc>=21 && imc<=26)) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f), tu peso es normal.",edad,imc);
			edadnormal=true;
		}

		if ((edad>=45 && edad<55) && (imc>=22 && imc<=27)) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f), tu peso es normal.",edad,imc);
			edadnormal=true;
		}

		if ((edad>=55 && edad<65) && (imc>=23 && imc<=28)) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f), tu peso es normal.",edad,imc);
			edadnormal=true;
		}

		if ((edad>=65) && (imc>=24 && imc<=29)) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f), tu peso es normal.",edad,imc);
			edadnormal=true;
		}

		if (edadnormal==false) {
			System.out.printf("Para tu edad (%d años) e IMC (%.2f) tu peso NO se considera normal.",edad,imc);
                }    
            
	
                System.out.println("\n¿Deseas calcular el IMC de otra persona (s/n)?");
                otrocalculo=valor.next();
				
				
			} // fin del while
			valor.close();
   }
}