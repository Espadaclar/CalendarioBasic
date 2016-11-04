
/**
 * Write a description of class CalendarBasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarBasi
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anno;

    /**
     * 
     * Constructor for objects of class CalendarBasi
     */
    public CalendarBasi()
    {
        dia = 01;
        mes = 01;
        anno = 01;
    }

   /**
    *  método, fijar la fecha que va a almacenar el calendario indicando por parámetro el día, el mes y el año de dicha fecha. Solo van a 
    *  contemplarse años desde 2001 hasta 2099
    */
   public void setFecha(int dia2, int mes2, int anno2){
       if(anno2 < 2001 && anno2 > 2099){
           anno2 = 2001;
       }
       dia = dia2;
       mes = mes2;
       anno = anno2;  
   }
    
}





















