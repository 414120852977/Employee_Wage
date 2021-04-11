package ComputationProblem;

public interface EmpWageBuilderMul {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int MAX=2;
	public static final int MIN=0;
	
	
	
	public static void ComputeEmpWage(String company,int emprateperhr,int noofworkingdays,int maxhourspermonth)
	{
		int emphr = 0,empdailywage = 0,monthlyempwage = 0,totalemphr =0,monthworkday=0;
		while(totalemphr <= maxhourspermonth && monthworkday <= noofworkingdays ){
			monthworkday++;
		
		int num = (int) (Math.random()*(MAX-MIN+1)+MIN);
		
		switch(num)
		{
		
		case IS_FULL_TIME :
			System.out.println("employee is full time");
			emphr=8;
			break;
		case IS_PART_TIME :
			System.out.println("employee is part time");
			emphr=4;
			break;
		default :
			System.out.println("employee is abscent");
		}

		empdailywage =  emprateperhr * emphr;
		monthlyempwage = maxhourspermonth * empdailywage;
		System.out.println("monthly wage of a employee :"+monthlyempwage);
		System.out.println("company is :"+company + " " +"monthlyempwage :"+monthlyempwage);
		
		
		}
		monthlyempwage = maxhourspermonth * empdailywage;

		

	}

	

	public static void main(String[] args) {
		EmpWageBuilder e = new EmpWageBuilder();
		e.ComputeEmpWage("dmart", 20, 10, 25);
		e.ComputeEmpWage("relaince", 30, 15, 30);
		e.ComputeEmpWage("tcs", 15, 24,30);
		
	}


}
