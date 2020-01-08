package ejercicios2;

public class Ejercicios2 {

    public static void main(String[] args) {
        String otro="";
        int ejerc;
        LeeTeclado.iniSc(); // ** es necesario abrir una vez el Scanner, lo haremos en la clase main()
        
        do {
            System.out.print("¿Qué ejercicio deseas ejecutar (introducir el número de ejercicio?\n");
            System.out.print("1. Decir si un número es par o impar.\n");
            System.out.print("2. Decir si un carácter está en mayúsculas o minúsculas.\n");
            System.out.print("3. Decir cuál es el mayor de tres números.\n");
            System.out.print("4. Comprobar si una hora facilitada es válida.\n");
            System.out.print("5. Decir los días que tienen un mes.\n");
            System.out.print("6. Mostrar ordenados dos números.\n");
            System.out.print("7. Mostrar si un número es +/- o par/impar (tres versiones).\n");
            System.out.print("8. Mostrar cuántos + y - hay en un listado y su media diferenciada.\n");

            ejerc=LeeTeclado.readInt();
            switch (ejerc) {
                
                // ejercicio 1 (par/impar)
                case 1:
                    Ejercicio1.ejercicio1();
                    break;
                // ejercicio 2 (mays/mins)
                case 2:
                    Ejercicio2.ejercicio2();
                    break;
                // ejercicio 3 (mayor de 3 números)
                case 3:
                    Ejercicio3.ejercicio3();
                    break;                
                // ejercicio 4 (hora válida)
                case 4:
                    Ejercicio4.ejercicio4();
                    break;
                // ejercicio 5 (validar mes, decir días y mostrar texto)
                case 5:
                    Ejercicio5.ejercicio5();
                    break;
                // ejercicio 6 (mayor de 2 números)
                case 6:
                    Ejercicio6.ejercicio6();
                    break;
                // ejercicio 7 (positivo/negativo y par/impar, tres versiones)
                case 7:
                    Ejercicio7.ejercicio7();
                    break;
                // ejercicio 8 (contar positivos/negativos y decir su media diferenciada)
                case 8:
                    Ejercicio8.ejercicio8();
                    break;                      
                // en caso de que se introduzca un valor que no corresponda con ninguno de los ejercicios                
                default:
                    System.out.print("ERROR: El número introducido no corresponde a ninguno de los ejercicios.\n");    
                    break;
            }

            System.out.print("¿Deseas ejecutar otro ejercicio?(s/n) ");
            otro=LeeTeclado.readStr();

        } while (otro.equals("s"));

        LeeTeclado.cierraSc(); // cerramos solo una vez el Scanner, lo hacemos en 'main()'
    } // fin del main()
} // fin de la clase principal Ejercicios2{}