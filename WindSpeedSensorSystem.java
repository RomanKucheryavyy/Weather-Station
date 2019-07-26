package Weather;
/**
 * @author Steve Mwangi
 */
public class WindSpeedSensorSystem extends WeatherSystem {
	public String location = "Seattle";
	public int wind = 128;
	
	public WindSpeedSensorSystem() {

	}

	public void displayOutsideWind() {
		System.out.println("The Wind Speed is: " + getWind());
	}
	
	public int getWind() {
		return wind;
	}

}
