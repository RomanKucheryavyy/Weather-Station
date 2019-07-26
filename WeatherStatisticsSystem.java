package Weather;
/**
 * @author Steve Mwangi
 */
public class WeatherStatisticsSystem extends WeatherSystem {

	public WeatherStatisticsSystem() {
		new TemperatureSensorSystem();
		new TimeSensorSystem();
		new RainfallSensorSystem();
		new WindSpeedSensorSystem();
	}
}
