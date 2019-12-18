package tema6;

import java.util.Scanner; // necesario para obtener valores desde la consola
import java.util.Calendar; // necesario para usar la clase 'Calendar' que nos da acceso a fecha/hora

public class Condicionales {

    // para que quede más limpio el código y se pueda utilizr más fácil con el día actual
    // paso las condiciones múltiples a un método al que se le pasa el número del día a mostrar
    public static void diasemana(int dias){
        String texto="";
        System.out.print(", hoy es ");
        switch(dias){
            case 1:
                texto="lunes";
                break;
            case 2:
                texto="martes";
                break;
            case 3:
                texto="miércoles";
                break;
            case 4:
                texto="jueves";
                break;
            case 5:
                texto="viernes";
                break;
            case 6:
                texto="sábado";
                break;
            case 7:
                texto="domingo";
                break;
        } // fin del switch
        System.out.println(texto);
    } // fin del método 'diasemana()'

    // obtengo el día de la semana actual y lo convierto al formato LMXJVSD
    // ya que 'Calendar.DAY_OF_WEEK' lo devuelve en formado DLMXJVSD
    public static int diaweek(){
        Calendar calendario = Calendar.getInstance(); // al crear la instancia de 'Calendar' obtiene los datos actuales
        int diaw=calendario.get(Calendar.DAY_OF_WEEK);
        if (diaw==1){
            return 7; // si el día es domingo (1) lo devuelvo como 7
        }
        else {
            return diaw-1; // si es cualquier otro día (p.ej., lunes=2), devuelvo el valor-1
        }
    } // fin del método 'diaweek()'


    public static String saludoDTN(){
        Calendar calendario = Calendar.getInstance(); // al crear la instancia de 'Calendar' obtiene los datos actuales
         // obtenemos la hora actual con 'Calendar.HOUR_OF_DAY' en formato 24 horas
         // si la queremos obtener en formato 12h usaremos 'Calendar.HOUR' que NO indica si es 'am' o 'pm'
        int hora=calendario.get(Calendar.HOUR_OF_DAY);
        int minuto=calendario.get(Calendar.MINUTE); // aprovechamos para mostrar la hora actual con hora:minuto
        System.out.println("Hora actual (formato 24h): "+hora+":"+minuto);

        if ( ( (hora>=0)&&(hora<7) ) || (hora>=20) ){
            return "Buenas noches"; 
        }
        else if ( (hora>=7) && (hora<13) ) {
            return "Buenos días";
        }
        else {
            return "Buenas tardes";
        }
    } // fin del método 'saludoDTN()'

    // otro método de ejemplo de condiciones anidadas
    public static String saludoDTN2(int h){

        if ((h<0)||(h>23)){
            return "ERROR: La hora indicada es menor de 0 o mayor de 23";
        }
        else if ( ( (h>=0)&&(h<7) ) || (h>=20) ){
            return "Buenas noches";
        }
        else if ( (h>=7) && (h<13) ) {
            return "Buenos días";
        }
        else {
            return "Buenas tardes";
        }
    } // fin del método 'saludoDTN()'


    public static void main(String[] args) {
         Scanner valor=new Scanner(System.in);
         String otra;
         int nota,dia;
        // condición simple

        // dada una nota, decir si ha aprobado (mayor o igual a 5)

        do{
            System.out.println("(Condición simple) Introduce la nota a comprobar: ");
            nota=valor.nextInt();
            if (nota>=5){
                System.out.println("Aprobado");
            }
            System.out.println("¿Quieres comprobar otra nota? (s/n)");
            otra=valor.next();
        } while (otra.equals("s"));

        // condición doble
        // dada una nota, escribir "aprobado" si es igual o mayor a 5, o "suspenso" si es menor
        do{
            System.out.println("(Condición doble) Introduce la nota a comprobar: ");
            nota=valor.nextInt();
            if (nota>=5){
                System.out.println("Aprobado");
            }
            else{
                System.out.println("Suspenso");
            }
            System.out.println("¿Quieres comprobar otra nota? (s/n)");
            otra=valor.next();
        } while (otra.equals("s"));

        // condición doble, variante con el operador condicional
        String text="";
        do{
            System.out.println("(Condición doble, operador condicional) Introduce la nota a comprobar: ");
            nota=valor.nextInt();
            text=(nota>=5)?"Aprobado":"Suspenso"; // uso del operador condicional
            System.out.println(text);
            System.out.println("¿Quieres comprobar otra nota? (s/n)");
            otra=valor.next();
        } while (otra.equals("s"));



        // condición anidada
        // dada una nota, escribir "matrícula de honor" si es 10,"sobresaliente" si está entre 9(inc) y 10,
        // "notable" entre 7(inc) y 9, "bien" si está entre 6(inc) y 7, "suficiente" si está entre 5(inc) y 6
        do{
            System.out.println("(Condiciones anidadas) Introduce la nota a comprobar: ");
            nota=valor.nextInt();
            if (nota<0){
                System.out.println("ERROR: La nota no puede ser menor de 0");
            }
            else if (nota<5){
                System.out.println("Suspenso");
            }
            else if (nota<6){
                System.out.println("Aprobado");
            }
            else if (nota<7){
                System.out.println("Bien");
            }
            else if (nota<9){
                System.out.println("Notable");
            }
            else if (nota<10){
                System.out.println("Sobresaliente");
            }
            else if (nota==10){
                System.out.println("Matrícula de honor");
            }
            else if (nota>10){
                System.out.println("ERROR: La nota no puede ser mayor de 10.");
            }
            System.out.println("¿Quieres comprobar otra nota? (s/n)");
            otra=valor.next();
        } while (otra.equals("s"));


        // condición múltiple (switch)
        // dado un día de la semana en número (del 1 al 7) indicar qué día es en texto
        do{
            System.out.println("(Condiciones múltiples) Introduce el número del día de la semana (o '8' para el actual): ");
            dia=valor.nextInt();
            
            // condición anidada, saludo según la hora del día
            System.out.print(saludoDTN());
            
            // si se introduce un valor del rango 1 al 7 obtiene el día de la semana del método directamente
            if ((dia>=1)&&(dia<=7)){
                diasemana(dia);
            }
            // aprovechando que se puede obtener el día actual de la semana con Calendar, doy opción a que se muestre
            // como el método incluido en java considera el primer día de la semana el domingo
            // se usa otro método para convertirlo a nuestro formato lunes-domingo
            else if (dia==8){
                diasemana(diaweek());
            }
            else {
                System.out.println("Has introducido un valor erroneo. Debe ser del 1 al 7 (lunes a viernes) o 8 para el día actual");    
            }

            System.out.println("¿Quieres comprobar otro día? (s/n)");
            otra=valor.next();
        } while (otra.equals("s"));

        // otro ejemplo de mostrar un saludo según la hora del día que se nos indique por consola
        int horausuario;
        do{
            System.out.println("(Condiciones anidadas) Introduce la hora que desees (0-23): ");
            horausuario=valor.nextInt();
            
            // lo comprobamos llamando al método antes definido
            System.out.println(saludoDTN2(horausuario));

            System.out.println("¿Quieres comprobar el saludo para otra hora? (s/n)");
            otra=valor.next();
        } while (otra.equals("s"));

        valor.close();

    } // fin del 'main()'
    
} // fin de la clase 'Condicionales'