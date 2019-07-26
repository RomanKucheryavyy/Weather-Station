package Weather;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Steve Mwangi
 */
public class WeatherDisplaySystem extends WeatherSystem {
	public int temp = 64;
	public int wind = 128;
	public double rain = 4.5;
	public String time;
	public String location = "Seattle";
			

	/**
	 * 
	 */
	public WeatherDisplaySystem() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    time = formatter.format(date); 
	}

	public void diplayWind() {
		System.out.println(wind);
	}
	
	public void displayRain() {
		System.out.println(rain);
	}
	
	public void displayTime() {
		System.out.println(time);
	}
	
	public void displayWeatherStatistics(){
		System.out.println(temp + rain + time + wind);
	}
}
