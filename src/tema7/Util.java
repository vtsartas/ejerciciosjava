package tema7;

public class Util{

    public static boolean compruebaDia(int num){
        return (num>0&&num<8)?true:false;
    }

    public static String diaSemana(int num){
        String diaretorno="";
        switch (num) {
            case 1:
                diaretorno="lunes";
                break;
            case 2:
                diaretorno="martes";
                break;
            case 3:
                diaretorno="miércoles";
                break;
            case 4:
                diaretorno="jueves";
                break;
            case 5:
                diaretorno="viernes";
                break;
            case 6:
                diaretorno="sábado";
                break;
            case 7:
                diaretorno="domingo";
                break;
            default:
                diaretorno="ERROR";
                break;
        } // fin del switch
        
        return diaretorno;

    } // fin del método  diaSemana()


    // lo hacemos ahora con un simple array en lugar de un switch
    public static String diaSemArray(int num){
        String [] dialista={"lunes","martes","miércoles","jueves","viernes","sábado","domingo"};
        return dialista[num-1];
    } // fin del método  diaSemArray()

    // escribir los días de la semana en número y letra
    public static void diasSemana(){
        String listadias="";
        int i;
        for (i=1;i<8;i++){
            listadias=listadias+i+":"+diaSemArray(i)+" ";
        }
        listadias+="\n";
        System.out.print(listadias);
            
    } // fin del método diasSemana()

} // fin de la clase Util{}