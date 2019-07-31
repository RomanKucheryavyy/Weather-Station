package Weather;

/**
 * This is the Temperature Sensor System
 * for determining the temperature readings.
 * 
 * @author Steve Mwangi
 * @version 2.1
 */
public class TemperatureSensorSystem extends WeatherSystem {
	public int temp = 72;
	public String location = "Seattle";

	public TemperatureSensorSystem() {
		System.out.println("For Location: " + location + " the Temperature is " + getTemp() + " degrees Farenheit");
	}
	
	public void displayTemp() {
		System.out.println("Temperature is: " + temp);
	}
	
	public int getTemp() {
		return temp;
	}

}
