package Weather;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Steve Mwangi
 */
public class TimeSensorSystem extends WeatherSystem{
	public String time;
	

	/**
	 * 
	 */
	public TimeSensorSystem() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    time = formatter.format(date); 	
	}

	
	public void setTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    time = formatter.format(date);
	}
	
	public String getTime() {
		return time;
	}
	
	public void displayTime() {
		System.out.println(time);
	}
}
