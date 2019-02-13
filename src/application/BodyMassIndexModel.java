package application;

public class BodyMassIndexModel {
	
	public double  getBMI( double height, double weight) {
		return weight /Math.pow(height, 2.0);
	}
	
	public String getBMIDes(Integer bmi) {
		
		if (bmi < 18.5 ) {
            return "sottopeso";
        }

        else if (bmi >= 18.5 && bmi < 25) {
           return "normale";
        }

        else if (bmi >= 25 && bmi < 30) {
            return "sovrappeso";
        }

        else if (bmi >= 30) {
            return "obero";
        } 
		
		return "";
		
	}

}
