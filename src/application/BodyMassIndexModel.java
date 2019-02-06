package application;

public class BodyMassIndexModel {
	
	public double  getBMI( double height, double weight) {
		return weight /Math.pow(height, 2.0);
	}

}
