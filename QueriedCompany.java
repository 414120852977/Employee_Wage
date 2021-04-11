package ComputationProblem;

import java.util.Scanner;

public class QueriedCompany {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int MAX = 2;
	public static final int MIN = 0;
	
	public void TotalWageComp() {
		System.out.println("Enter a name of a company :");
		Scanner sc = new Scanner(System.in);
		String cname = sc.nextLine();
		System.out.println("enter a employee rate per hr :");
		int emprateperhr = sc.nextInt();
		System.out.println("no of working days:");
		int workday = sc.nextInt();
		System.out.println("enter a maximum hours per month :");
		int maxhrpermonth = sc.nextInt();
		System.out.println("you reached");
		
		int emphr = 0, empdailywage = 0, monthlyempwage = 0, totalemphr =0, monthworkday = 0 ;
		while(totalemphr <= maxhrpermonth && monthworkday <= workday ) {
			monthworkday++;
		
			int num = (int) (Math.random() * (MAX - MIN + 1) + MIN);
		
		switch(num) {
		case IS_FULL_TIME :
			emphr = 8;
			break;
		case IS_PART_TIME :
			emphr = 4;
			break;
		default :
			emphr = 0;
		}

		empdailywage =  emprateperhr * emphr;
		monthlyempwage = maxhrpermonth * empdailywage;
		System.out.println("company is :"+cname + " " +"monthlyempwage :"+monthlyempwage +" "+ "daily employee wage is :"+empdailywage);
	}
}
	
	
	public static void main(String[] args) {
		
		
		QueriedCompany queriedcompany = new QueriedCompany();
		queriedcompany.TotalWageComp();
	}

}
