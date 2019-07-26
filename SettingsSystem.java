package Weather;
/**
 * This is the setting class for the program.
 * 
 * @author Steve Mwangi
 */
public class SettingsSystem extends WeatherSystem{
	public String g1 = "Greetings User";
	public String g2 = "Greetings Maintenance";
	public String g3 = "Issues";

	public SettingsSystem() {
		displayGreetingView(1);
		displayGreetingView(4);
		setGreetingView();
		displayMaintenaceWarning();
	}

	public void displayGreetingView(int x) {
		if(x==1) {
			System.out.println(g1);
			
		} else {
			System.out.println(g2);
		}
		
	}
	
	public void displayMaintenaceWarning() {
		System.out.println("STOP! WARNING! WARNING! WARNING!");
	}
	
	public void setGreetingView() {
		System.out.println("Greetings View Set");
	}
}
