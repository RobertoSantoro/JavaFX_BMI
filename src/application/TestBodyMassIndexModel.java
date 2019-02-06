package application;

import java.util.Scanner;

public class TestBodyMassIndexModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BodyMassIndexModel model = new BodyMassIndexModel();
		Scanner input = new Scanner(System.in);
		
		System.out.print("height ? ");
        double height = input.nextDouble();
		//double height =1.81;
		
    	System.out.print("weight ? ");
        double weight = input.nextDouble();
		//double weight =90;
        System.out.println(model.getBMI(height, weight));
	}

}
