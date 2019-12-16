package tema4;


public class Reloj {
    private int hora=0;
    private int minuto=0;
    private int segundo=0;

    private int alarmaHora=0;
    private int alarmaMinuto=0;

    private boolean mostrar24h=false;
    private boolean alarmaActiva=false;

    public Reloj(int hora, int minuto, int segundo, int alarmaHora, int alarmaMinuto, boolean mostrar1224h,
            boolean alarmaActiva) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.alarmaHora = alarmaHora;
        this.alarmaMinuto = alarmaMinuto;
        this.mostrar24h = mostrar1224h;
        this.alarmaActiva = alarmaActiva;
    }

    
    // getters/setters de la clase 'ejReloj'

    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        if (hora>=0 && hora<=23) {
            this.hora = hora;
        }
        else {
            this.hora = 0;
        }
    }

    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if (minuto>=0 && minuto<=59){
            this.minuto = minuto;
        }
        else {
            this.minuto = 0;
        }
    }

    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        if (segundo>=0 && segundo<=59){
            this.segundo = segundo;
        }
        else {
            this.segundo = 0;
        }
    }

    public int getAlarmaHora() {
        return alarmaHora;
    }
    public void setAlarmaHora(int alarmaHora) {
        if (alarmaHora>=0 && alarmaHora<=23) {
            this.alarmaHora = alarmaHora;
        }
        else {
            this.alarmaHora = 0;
        }
    }

    public int getAlarmaMinuto() {
        return alarmaMinuto;
    }

    public void setAlarmaMinuto(int alarmaMinuto) {
        if (alarmaMinuto>=0 && alarmaMinuto<=59) {
            this.alarmaMinuto = alarmaMinuto;
        }
        else {
            this.alarmaMinuto = 0;
        }
    }

    public boolean isMostrar24h() {
        return mostrar24h;
    }

    public void setMostrar24h(boolean mostrar24h) {
        this.mostrar24h = mostrar24h;
    }

    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }

    public void setAlarmaActiva(boolean alarmaActiva) {
        this.alarmaActiva = alarmaActiva;
    }

    public void activarAlamrma(){
        this.setAlarmaActiva(true);
    }
    public void desactivarAlamrma(){
        alarmaActiva=false;
    }

    public void mostrar12(){
        mostrar24h=false;
    }
    public void mostrar24(){
        mostrar24h=true;
    }


    public String mostrarHORA() {
        
        String texto="HORA ACTUAL: ";

        if ((this.isMostrar24h()==false) && (this.getHora()>=12)){
            if (this.getHora()==12){
                texto=texto+(this.getHora())+":"+this.getMinuto()+"."+this.getMinuto()+" pm";
            }
            else{
                texto=texto+(this.getHora()-12)+":"+this.getMinuto()+"."+this.getMinuto()+" pm";
            }
        }
        else if (this.isMostrar24h()==false){
            texto=texto+(this.getHora())+":"+this.getMinuto()+"."+this.getMinuto()+" am";
        }
        else {
            texto=texto+(this.getHora())+":"+this.getMinuto()+"."+this.getMinuto()+" (24h)";
        }
        return texto;
    }
}