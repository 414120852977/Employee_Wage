package ComputationProblem;

public class Main {
	public static void main(String[] args) {
		System.out.println("** WELCOME TO EMPLOYEE WAGE COMPUTATION **");
		System.out.println();
		CheckEmployee e = new CheckEmployee();
		e.Compute();
		CalDailyEmpWage e1 = new CalDailyEmpWage();
		e1.Compute();
		PartTime e2 = new PartTime();
		e2.Compute();
		SwitchCase  e3 = new SwitchCase ();
		e3.Compute();
		empWageMonth e4 = new empWageMonth();
		e4.Compute();
		CalWageTillCon e5 = new CalWageTillCon();
		e5.Compute();
		ComputeEmpWage e6 = new ComputeEmpWage();
		e6.Compute();
		WagesMultipleCompanies e7 =new WagesMultipleCompanies();
		e7.ComputeEmpWage("dmart", 20, 10, 2);
		WagesMultipleCompanies e8 = new WagesMultipleCompanies();
		e8.ComputeEmpWage("Tata", 25, 10, 5);
	
	}

}
