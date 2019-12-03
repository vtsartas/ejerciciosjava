package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"

// Ejercicio 36 - Hoja VIII (2) - Calcular la depreciación de un coche según la formulación indicada

public class Ejercicio36 {

    public static void main(String[] args) {
        
        // Definimos las variables a utilizar
        
        int year=1;
        float valorreal,vidautil=4,coste=18000,valorresidual=2000,depreacu;
        System.out.printf("Coste del coche: %.2f Valor residual: %.2f Vida útil: %.0f.\n",coste,valorresidual,vidautil);
        
        while (year<=vidautil){
		valorreal=(coste-valorresidual)/year;
		depreacu=coste-valorreal;
		System.out.printf("Año: %d Valor real: %.2f Depreciación acumulada: %.2f.\n",2006+year,valorreal,depreacu);
		year++;
        }	
        valor.close();
		texto.close();
   }
}



