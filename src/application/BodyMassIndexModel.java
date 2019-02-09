package application;

public class BodyMassIndexModel {
	
	public double  getBMI( double height, double weight) {
		return weight /Math.pow(height, 2.0);
	}
	
	public String getBMIDes(Integer bmi) {
		
		if (bmi < 18.5 ) {
            return "Underweight";
        }

        else if (bmi >= 18.5 && bmi < 25) {
           return "Normal";
        }

        else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        }

        else if (bmi >= 30) {
            return "Obese";
        } 
		
		return "";
		
	}

}
