package tema3;

public class UsaCirculo{
    public static void main(String[] args) {
        Circulo circulo1=new Circulo();
        System.out.println(circulo1);
        circulo1.posx=0;
        circulo1.posy=0;
        circulo1.radio=10;

        // Probamos el método 'calcularPerimetro()' de la clase 'Circulo'
        System.out.printf("El perímetro del círculo de radio %d es %.2f.\n",circulo1.radio,circulo1.calcularPerimetro());
        
        // Probamos el método 'calcularArea()' de la clase 'Circulo'
        System.out.printf("El área del círculo de radio %d es %.2f.\n",circulo1.radio,circulo1.calcularArea());
    }
}