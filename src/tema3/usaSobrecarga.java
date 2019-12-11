package tema3;

public class usaSobrecarga {
    public static void main(String[] args) {
        Sobrecarga objeto1=new Sobrecarga(5,7);
        Sobrecarga objeto2=new Sobrecarga(5,7,10);
        System.out.println("objeto1.sumar():"+objeto1.sumar());
        System.out.println("objeto1.sumar('dos'):"+objeto1.sumar("dos"));
        System.out.println("objeto1.sumar('otro'):"+objeto1.sumar("otro"));
        System.out.println("objeto1.sumar('tres'):"+objeto1.sumar("tres"));
        System.out.println("objeto1.sumar('int'):"+objeto1.sumar(50));
        System.out.println("objeto2.sumar():"+objeto2.sumar());
        System.out.println("objeto2.sumar('tres'):"+objeto2.sumar("tres"));
        System.out.println("objeto2.sumar('int'):"+objeto2.sumar(100));
    }
    
}