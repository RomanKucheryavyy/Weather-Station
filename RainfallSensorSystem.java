package Weather;
/**
 * @author Steve Mwangi
 */
public class RainfallSensorSystem {
	public double rain = 3.4;
	public String location = "Seattle";

	/**
	 * 
	 */
	public RainfallSensorSystem() {
		displayOutsideWeather();
	}

	public void displayOutsideWeather() {
		System.out.println( displayWeather());
	}
	
	public String displayWeather() {
		return rain + " inches of rain in the last day";
	}
	
	public double getRainAmount() {
		return rain;
	}

}
