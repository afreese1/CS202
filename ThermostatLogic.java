
public class ThermostatLogic implements Temperature {
	
	public double convertToFahrenheit(double input) {
		
		double far;
		
		far = (input*9) / 5 + 32;
		return far;
	}
	
	public double convertToCelsius(double input) {
		
		double cel;
		
		cel = ((input-32)*5) / 9;
		return cel;		
	}

}
