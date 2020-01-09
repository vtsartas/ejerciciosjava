package ejercicios2;

public class Sumas{
    private int sumapositivos;
    private int contarpos;
    private int sumanegativos;
    private int contarneg;
    private int contarceros;

    public Sumas(int sumapositivos, int sumanegativos,int contarpos, int contarneg, int contarceros) {
        this.sumapositivos = sumapositivos;
        this.sumanegativos = sumanegativos;
        this.contarpos = contarpos;
        this.contarneg = contarneg;
        this.contarceros = contarceros;
    }

    public int getSumapositivos() {
        return sumapositivos;
    }

    public void setSumapositivos(int sumapositivos) {
        this.sumapositivos = sumapositivos;
    }

    public int getSumanegativos() {
        return sumanegativos;
    }

    public void setSumanegativos(int sumanegativos) {
        this.sumanegativos = sumanegativos;
    }

    public int getContarpos() {
        return contarpos;
    }

    public void setContarpos(int contarpos) {
        this.contarpos = contarpos;
    }

    public int getContarneg() {
        return contarneg;
    }

    public void setContarneg(int contarneg) {
        this.contarneg = contarneg;
    }

    public int getContarceros() {
        return contarceros;
    }

    public void setContarceros(int contarceros) {
        this.contarceros = contarceros;
    }

    

} // fin de la clase Sumas{}