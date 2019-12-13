package tema4.ejlibro;

public class Libro {
    // atributos de la clase 'Libro'
    private String titulo;
    private String ISBN;
    private boolean abierto=false;
    private int numPaginas;
    private int paginaActual=0;

    // método constructor de la clase 'Libro'
    public Libro(String titulo, String iSBN, boolean abierto, int numPaginas, int paginaActual) {
        this.titulo = titulo;
        this.ISBN = iSBN;
        this.abierto = abierto;
        this.numPaginas = numPaginas;
        this.paginaActual = paginaActual;
    }


    // getters/setters de la clase
    

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public boolean isAbierto() {
        return abierto;
    }
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }
    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    // otros métodos de la clase

    public void abrir(){
        this.abierto=true;
    }

    public void cerrar(){
        this.abierto=false;
    }


    public String getAtributosLibro() {
        
        return "Título: " + this.titulo +
        " ISBN: " + this.ISBN +
        " ¿Abierto?: " + this.abierto +
        " Número de páginas: " + this.numPaginas +
        " Página actual: " + this.paginaActual;

    }
    
}