package tema7;

/* devolver el objeto cliente de mayor edad
 */
public class MasClientes {

    private String nombre;
    private int edad;

    public MasClientes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

        final int NUM_CLIENTES=5;

        MasClientes [] listado=new MasClientes[NUM_CLIENTES];

        //MasClientes cli=new MasClientes("",0);

        int i;

        LeeTeclado.iniSc();

        
        for (i=0;i<NUM_CLIENTES;i++){

            MasClientes cli=new MasClientes("",0);

            System.out.println("Introduce el nombre del cliente "+i+": ");
            cli.nombre=LeeTeclado.readStr();
            System.out.println("Introduce la edad del cliente "+i+": ");
            cli.edad=LeeTeclado.readInt();

            listado[i]=cli;
        }

        System.out.println("El cliente de mayor edad es "+listado[mayor(listado)].getNombre()+" y tiene "+listado[mayor(listado)].getEdad()+" años.");

        LeeTeclado.cierraSc();
        
    }

    public static int mayor(MasClientes [] listacli){

        int j;
        int may=0;

        for (j=1;j<listacli.length; j++){
            if(listacli[j].getEdad()>listacli[may].getEdad()){
                may=j;
            }
        }

        return may;
    }
    
}