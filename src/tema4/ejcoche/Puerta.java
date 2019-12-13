package tema4.ejcoche;

public class Puerta {
    private boolean elevalunasElectrico=false;

    // método constructor de la clase
    public Puerta(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    // getter/setter de la clase
    public boolean isElevalunasElectrico() {
        return elevalunasElectrico;
    }
    public void setElevalunasElectrico(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }
    
}