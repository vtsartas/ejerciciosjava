package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 38 - Hoja VIII (4) - Mostrar las tablas de multiplicar

public class Ejercicio38 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int op1,op2,n;
	String otrocalculo;
        
        for (op1=1;op1<11;op1++){
            System.out.printf("TABLA DEL %d\n",op1);
            System.out.println("-------------");
            for (op2=1;op2<11;op2++){
                System.out.printf("%d x %d = %d\n",op1,op2,op1*op2);
            }
		System.out.println("-------------\n");
	}
        
        System.out.println("¿Deseas calcular la tabla de multiplicar de números mayoresa a 10 (s/n)?");
        Scanner texto=new Scanner(System.in);
	otrocalculo=texto.next();
	if (otrocalculo.equals("s")){
		System.out.println("¿Hasta qué número superior a 10 deseas ver la tabla?");
                Scanner valor=new Scanner(System.in);
		n=valor.nextInt();
                System.out.printf("\n");
		for (op1=11;op1<=n;op1++){
                    System.out.printf("TABLA DEL %d\n",op1);
                    System.out.println("-------------");
                    for (op2=1;op2<11;op2++){
                        System.out.printf("%d x %d = %d\n",op1,op2,op1*op2);
                   }
		System.out.println("-------------\n");
                }
	}
          
   }
}
