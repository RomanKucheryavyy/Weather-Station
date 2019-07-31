package Weather;
import java.util.Scanner;

/**
 * The Weather System.
 * 
 * @author Steve Mwangi
 */
public class WeatherSystem {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		display();

	}
	
	public static void display() {
		
		int userInput;
		WeatherDisplaySystem weather = new WeatherDisplaySystem();
		
		System.out.println("Welcome: Choose from options below(Enter the number corresponding with option)");
		System.out.println("1. Rain");
		System.out.println("2. Temperature");
		System.out.println("3. Time");
		System.out.println("4. Wind");
		System.out.println("5. Settings");
		
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();
		
		if(userInput == 1) {
			weather.displayRain();
		} if (userInput == 2) {
			weather.displayTemperature();
		} if (userInput == 3) {
			weather.displayTime();
		} if (userInput == 4) {
			weather.diplayWind();
		} if (userInput == 5) {
			weather.displaySettings();
		}
		
		System.out.println("Press any key & enter to go back to main menu:");
		input.next();
		display();
	}
	

}
