package ComputationProblem;

public class CalWageTillCon {
	public static final int MAX=2;
	public static final int MIN=0;
	public static final int EMP_WAGE_PER_HR=20;
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int MONTH_WORK_DAY=20;
	public static final int MAX_HR_IN_MONTH=10;
	
	
	
	public void Compute(){
		int emphr=0,empdailywage=0,monthlyempwage=0,totalemphr=0,monthworkday=0;
		while(totalemphr <= MAX_HR_IN_MONTH && monthworkday <= MONTH_WORK_DAY ){
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

		empdailywage = EMP_WAGE_PER_HR * emphr;
		monthlyempwage = MONTH_WORK_DAY * empdailywage;
		System.out.println("monthly wage of a employee :"+monthlyempwage);
		
		}

	}

}

