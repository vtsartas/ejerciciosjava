package tema3;

import java.util.Scanner; // importamos el método Scanner para recibir datos por teclado

public class UsaMatematicas {
    public static void main(String[] args) {

        Matematicas mate1=new Matematicas(0,0); // creamos el objeto 'mate1' de la clase 'Matematicas' e inicializamos a 0 sus dos valores

        String leerotro; // variable que controla si queremos realizar otro cálculo
        String opera; // aquí tendremos qué operación elegimos realizar
        String otraop; // la usaremos para ver si hacemos otro cálculo con los mismos valores
        Scanner valor=new Scanner(System.in); // creamos un objeto 'valor' de clase 'Scanner'

        // Mostramos el atributo estático PI de la clase 'Matematicas'. Para ello no es necesario crear ningún objeto
        System.out.println("Valor estático PI="+Matematicas.PI+".");

        do {
            // pedimos los dos valores que emplearemos en las operaciones
            System.out.println("Introduce el primer valor:");
            mate1.num1=valor.nextInt(); // leemos el primer valor
            System.out.println("Introduce el segundo valor:");
            mate1.num2=valor.nextInt(); // leemos el segundo valor

            do {
                // Preguntaremos qué operación se desea realizar
                System.out.println("¿Qué operación deseas realizar?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
                opera=valor.next();
                switch (opera){
                    case "1":
                        // Mostramos la suma usando el método no estático. Se aplica al objeto sobre el que queremos operar
                        System.out.println("(método no estático) La suma "+mate1.num1+"+"+mate1.num2+"="+mate1.sumar()+".");
                        // Mostramos la suma usando el método ESTÁTICO. Se aplica al objeto sobre el que queremos operar
                        System.out.println("(método estático) La suma "+mate1.num1+"+"+mate1.num2+"="+Matematicas.sumarEstatico(mate1.num1,mate1.num2)+".");
                        break;
                    case "2":
                        // Mostramos la resta usando el método no estático. Se aplica al objeto sobre el que queremos operar
                        System.out.println("La resta "+mate1.num1+"-"+mate1.num2+"="+mate1.restar()+".");
                        // Mostramos la resta usando el método ESTÁTICO. Se aplica al objeto sobre el que queremos operar
                        System.out.println("(método estático) La resta "+mate1.num1+"-"+mate1.num2+"="+Matematicas.restarEstatico(mate1.num1,mate1.num2)+".");
                        break;
                    case "3":
                        // Mostramos la multiplicación usando el método no estático. Se aplica al objeto sobre el que queremos operar
                        System.out.println("La multiplicación "+mate1.num1+"*"+mate1.num2+"="+mate1.multiplicar()+".");
                        // Mostramos la multiplicación usando el método ESTÁTICO. Se aplica al objeto sobre el que queremos operar
                        System.out.println("(método estático) La multiplicación "+mate1.num1+"*"+mate1.num2+"="+Matematicas.multiEstatico(mate1.num1,mate1.num2)+".");
                        break;
                    case "4":
                        // Mostramos la división usando el método no estático. Se aplica al objeto sobre el que queremos operar
                        System.out.println("La división "+mate1.num1+"/"+mate1.num2+"="+mate1.dividir()+".");
                        // Mostramos la división usando el método ESTÁTICO. Se aplica al objeto sobre el que queremos operar
                        System.out.println("(método estático) La división "+mate1.num1+"/"+mate1.num2+"="+Matematicas.diviEstatico(mate1.num1,mate1.num2)+".");
                        break;
                }

                // Preguntamos si se desea realizar otra operación con los mismos valores
                System.out.println("¿Deseas realizar otra operación con estos valores?(s/n)");
                otraop=valor.next();            
            } while (otraop.equals("s"));

            // si no se desea realizar otra operación con los mismos valores preguntamos si se desea introducir unos nuevos o terminar
            System.out.println("¿Deseas introducir nuevos valores?(s/n)");
            leerotro=valor.next();

        } while (leerotro.equals("s"));
     
        valor.close(); // cerramos el Scanner

        int n1=15,n2=13,n3=9,auxi;
        auxi=Matematicas.sumarEstatico(n1, n2);
        System.out.println("Suma con auxiliar: Primer paso "+n1+"+"+n2+"="+auxi+". Segundo paso "+auxi+"+"+n3+"="+Matematicas.sumarEstatico(auxi, n3)+".");
        System.out.println("Suma anidando el método: "+n1+"+"+n2+"+"+n3+"="+Matematicas.sumarEstatico(Matematicas.sumarEstatico(n1,n2),n3)+".");

    } // final del 'main'
    
} // final de la clase 'UsaMatematicas'