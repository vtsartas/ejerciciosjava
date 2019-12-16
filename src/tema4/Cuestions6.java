package tema4;

public class Cuestions6 {
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        System.out.print(obj1.modificar(4) + " ");
        Clase1 obj2 = new Clase1();
        System.out.println(obj2.modificar(5) + " ");
    }
    
}

class Clase1 {
    static int p1, p2;
 
    public int modificar(int i) {
        System.out.println("(antes de usar) p1="+p1+" p2="+p2 + " ");
        p1 = p1 + i;
        p2 = p2 + i;
        System.out.println("p1="+p1+" p2="+p2 + " ");
        System.out.print(p2 + " ");
        return p1;
    }
}
