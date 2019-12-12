package tema4;

public class VehiculoAlquiladoT4 {
    
    // atributos privados de la clase, solo accesibles desde la misma clase y con los métodos públicos definidos
    private ClienteT4 cliente; // objeto de las clase 'ClienteT4'
    private VehiculoT4 vehiculo; // objeto de la clase 'VehiculoT4'
    private int diaAlquiler;
    private int mesAlquiler;
    private int anyoAlquiler;
    private int totalDiasAlquiler;

    // método constructor de la clase 'VehiculoAlquiladoT4'
    public VehiculoAlquiladoT4(ClienteT4 cliente,VehiculoT4 vehiculo,int diaAlquiler,int mesAlquiler,int anyoAlquiler,int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anyoAlquiler = anyoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }


    // métodos get/set de la clase
    public ClienteT4 getClienteT4() {
        return cliente;
    }
    public void setClienteT4(ClienteT4 cliente) {
        this.cliente = cliente;
    }

    public VehiculoT4 getVehiculoT4() {
        return vehiculo;
    }
    public void setVehiculot4(VehiculoT4 vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }
    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }
    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public int getAnyoAlquiler() {
        return anyoAlquiler;
    }
    public void setanyoAlquiler(int anyoAlquiler) {
        this.anyoAlquiler = anyoAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }
    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    // final de los métodos get/set de la clase
    
}