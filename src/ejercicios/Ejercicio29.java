package ejercicios; // Usar esta clase dentro de un paquete llamado "ejercicios"
import java.util.Scanner; // Necesario para pedir datos por consola

// Ejercicio 29 - Hoja VI (6) - Comprobar si una fecha introducida con cifras es correcta y poner el nombre del mes

public class Ejercicio29 {

    public static void main(String[] args) {
        
    // Definimos la variable a utilizar
	int day,month,year;
	String mescaract="";

    // Pedimos los datos de la fecha a comprobar
        System.out.println("Introduce el día: ");
        Scanner valor=new Scanner(System.in);
        day=valor.nextInt();
	System.out.println("Introduce el mes: ");
	month=valor.nextInt();
	System.out.println("Introduce el año (no se chequeará si es bisiesto): ");
	year=valor.nextInt();

     
        // El año debe ser mayor a 0
	if (year>0) {
		// El mes debe ser mayor que cero y menor de 13
		if ((month>0) && (month<13)) {
			// El día deberá estar entre 1-31, 1-30 y 1-28 según el mes (no tenemos en cuenta los años bisiestos)
			if (((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&& (day>0 && day<32)) || ((month==4 || month==6 || month==9 || month==11) && (day>0 && day<31)) || (month==2 && (day>0 && day<29))) {
				System.out.println("La fecha introducida es correcta\n");
				switch (month){
					case 1:
						mescaract="enero";
						break;
					case 2:
						mescaract="febrero";
                                                break;
					case 3:
						mescaract="marzo";
						break;
					case 4:
						mescaract="abril";
						break;
					case 5:
						mescaract="mayo";
						break;
					case 6:
						mescaract="junio";
						break;
                                        case 7:
						mescaract="julio";
						break;
					case 8:
						mescaract="agosto";
						break;
					case 9:
						mescaract="septiembre";
						break;
					case 10:
						mescaract="octubre";
						break;
					case 11:
						mescaract="noviembre";
						break;
					case 12:
						mescaract="diciembre";
						break;
				}
				System.out.println("Fecha: "+day+" de "+mescaract+" de "+year+".");
			// Terminamos el 'Si' de la comprobación de si el día es correcto
			}
			else {
				System.out.println("ERROR: El día introducido no es posible en el mes indicado.");
			}
		// Terminamos el 'Si' de la comprobación de si el mes es correcto
		}
		else {
			System.out.println("ERROR: El mes es incorrecto.");
		}

        } // Terminamos el 'Si' de la comprobación de si el año es correcto
        else {
            System.out.println("ERROR: El año indicado es incorrecto.");
        }
		valor.close();
            
   }
}
