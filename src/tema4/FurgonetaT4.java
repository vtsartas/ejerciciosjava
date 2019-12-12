package tema4;

public class FurgonetaT4 extends VehiculoT4 {
        // atributos específicos para esta clase hija
        private int carga;
        private int volumen;

        // método constructor de la clase 'FurgonetaT4', usa 'super()' para llamar al constructor de 'VehiculoT4'
        public FurgonetaT4(String matricula,String marca,String modelo,String color,double tarifa,int carga,int volumen) {
            super(matricula, marca, modelo, color, tarifa);
            this.carga = carga;
            this.volumen = volumen;
        }
        
        // métodos ‘get’ de la subclase Furgoneta
        public int getCarga() {
            return this.carga;
        }
        public int getVolumen() {
            return this.volumen;
        }

        // sobreescribe el 'getAtributosT4()' de la clase padre para obtener los de la hija
        // se trataría de un POLIMORFISMO del método inicial
        public String getAtributosT4() {
            return super.getAtributosT4() + " Carga (kg): " + this.carga +" Volumen (m3): " + this.volumen;
        }
    
}