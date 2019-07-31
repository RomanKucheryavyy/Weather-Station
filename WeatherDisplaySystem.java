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
		//System.out.println(wind);
		WindSpeedSensorSystem windSpeed = new WindSpeedSensorSystem();
		windSpeed.displayOutsideWind();
	}
	
	public void displayRain() {
		RainfallSensorSystem system = new RainfallSensorSystem();
	}
	
	public void displayTime() {
		TimeSensorSystem timeSystem = new TimeSensorSystem();
		timeSystem.displayTime();
	}
	
	public void displayTemperature() {
		TemperatureSensorSystem system = new TemperatureSensorSystem();
	}
	
	public void displayWeatherStatistics(){
		System.out.println(temp + rain + time + wind);
	}
	
	public void displaySettings() {
		SettingsSystem settingSystem = new SettingsSystem();
		
	}
}
