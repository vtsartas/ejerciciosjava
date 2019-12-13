package tema4.ejlibro;

public class LibroInfantil extends Libro{
    private int edadRecomendada=18;

    // método constructor de la clase, incluye la herencia con 'super()'
    public LibroInfantil(String titulo, String iSBN, boolean abierto, int numPaginas, int paginaActual,int edadRecomendada) {
        super(titulo, iSBN, abierto, numPaginas, paginaActual);
        this.edadRecomendada = edadRecomendada;
    }

    
    // getter/setter de la clase
    public int getEdadRecomendada() {
        return edadRecomendada;
    }
    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    
    // ********** OTROS MÉTODOS ****************

    // método para ver si el libro es recomendable para la edad indicada
    public boolean esRecomendable (int edadninyo) {

        if (edadninyo>=edadRecomendada){
            return true;
        }
        else{
            return false;
        }
    }
    
    // obtener los atributos del libro infantil (incluyen con 'super' los heredados de 'Libro')
    public String getAtributosLibro() {
        return super.getAtributosLibro()+" Edad recomendada: "+this.edadRecomendada;
    }

}