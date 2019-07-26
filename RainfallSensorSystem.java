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
		System.out.println(" The Weather is: " + displayWeather());
	}
	
	public String displayWeather() {
		return "displayed";
	}
	
	public double getRainAmount() {
		return rain;
	}

}
