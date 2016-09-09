

import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many years do you plan to work?");
		int YearsToWork = input.nextInt(); //Sets the int YearsToWork equal to planned years to work
		
		System.out.println("What is your expected average return on investment as a decimal");
		double AnnualReturn1 = input.nextDouble();
		while (AnnualReturn1 > .20 || AnnualReturn1 < 0 ) {
			System.out.println("Please enter a number between 0 and .20");
			AnnualReturn1 = input.nextDouble(); //Sets the double AnnualReturn1 equal to investment return within boundaries .20 and 0
		}
		
		System.out.println("How long do you want to draw");
		int DrawPeriod = input.nextInt(); //Sets int DrawPeriod equal to the input
		
		System.out.println("What is your required income?");
		int MonthlyIncome = input.nextInt(); //Sets int MonthlyIncome equal to the input
		
		System.out.println("What is your expected SSI income?");
		int SSIIncome = input.nextInt(); //Sets int SSIIncome equal to the input
		
		System.out.println("What is your expected average return on investment after retirement as a decimal");
		double AnnualReturn2 = input.nextDouble();
		while (AnnualReturn2 > .03 || AnnualReturn2 < 0 ) {
			System.out.println("Please enter a number between 0 and .03");
			AnnualReturn2 = input.nextDouble(); //Sets the double AnnualReturn2 equal to investment return within boundaries .03 and 0
		}
		int CompoundingPeriod = 12; //Sets int CompoundingPeriod equal to the the assumed 12 or 12 compounding periods of the monthly input per year
		
		double TotalNeeded = (MonthlyIncome-SSIIncome)*((1-Math.pow(1/(1+(AnnualReturn2/CompoundingPeriod)),(DrawPeriod*CompoundingPeriod)))/(AnnualReturn2/CompoundingPeriod));
		
		double Md = TotalNeeded*((AnnualReturn1/CompoundingPeriod)/(Math.pow(1+(AnnualReturn1/CompoundingPeriod),(YearsToWork*CompoundingPeriod))-1));
		
		System.out.println("You need to save " + Md + " to live for "+DrawPeriod+" Years");
	}

	}

