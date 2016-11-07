
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
    private int anio;
    
    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarBasi()
    {
		dia = 1;
		mes = 1;
		anio = 1;
	}
	
	public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
	{
		dia = nuevoDia;
		mes = nuevoMes;
		anio = nuevoAnio;
	}
	
	public void avanzarFecha() 
	{
	
		dia = dia + 1;
		if (dia == 31) {
			dia = 1;
			mes = mes + 1;		
			if (mes == 13){
				mes = 1;
				anio = anio + 1;
				if ( anio == 100) {
					anio = 1;
				}			
			}		
			
		}		
	}
	
	public String mostrarFecha() {
	    String textoDevolver;
	    
		String diaTexto = "" + dia;
		if(dia < 10){
			diaTexto = "0" + dia;
		}
		String mesTexto;
		if (mes < 10){
			mesTexto = "0" + mes + "";
		}
		else {
			mesTexto = mes + "";
		}
		String anioTexto;
		if(anio < 10){
			anioTexto = "0" + anio;
		}
		else{
			anioTexto = anio + "";
		}
		
		textoDevolver = diaTexto + "-" + mesTexto + "-" + anioTexto;
	    return textoDevolver;
	}

}




