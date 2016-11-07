
/**
 * Write a description of class CalendarBasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarBasi
{
    // instance variables - replace the example below with your own
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anio;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarBasi()
    {
        dia = new DisplayDosDigitos(31);
        mes = new DisplayDosDigitos(13);
        anio = new DisplayDosDigitos(100);
    }

    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
    {
        dia.setValor(nuevoDia);
        mes.setValor(nuevoMes);
        anio.setValor(nuevoAnio);
    }

    public void avanzarFecha() 
    {
        dia.incrementaValor();
        //      if (dia.getValor() == 31) {
        //          mes.incrementaValor();
        //          dia.setValor(1);  
        //          if (mes.getValor() == 13){
        //              mes.incrementaValor(); 
        //              mes.setValor(1);
        //              anio.incrementaValor();
        //              if ( anio.getValor() == 100) {
        //                  anio.setValor(1);
        //              }           
        //          }       
        //          
        //        }   
        if (dia.getValor() == 1) {
         mes.incrementaValor();
         if (mes.getValor() == 1){
             anio.incrementaValor();
             if ( anio.getValor() == 100) {
                anio.setValor(1);
             }           
         }       
         
       } 
    }

    public String mostrarFecha() {
        String textoDevolver;

        String diaTexto = dia.getValorDelDisplay();
        String mesTexto = mes.getValorDelDisplay();
        String anioTexto = anio.getValorDelDisplay();

        textoDevolver = diaTexto + "-" + mesTexto + "-" + anioTexto;
        return textoDevolver;
    }

}

