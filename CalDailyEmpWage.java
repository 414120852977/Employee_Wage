package ComputationProblem;

public class CalDailyEmpWage {
	public static final int MAX=1;
	public static final int MIN=0;
	public static final int EMP_WAGE_PER_HR=20;
	
	
	public void Compute(){
		int emphr=0,empdailywage=0;
		int num = (int) (Math.random()*(MAX-MIN+1)+MIN);
		
		if(num == 1)
		{
			System.out.println("Employee is Present");
			emphr=8;
			empdailywage = EMP_WAGE_PER_HR * emphr;
			System.out.println("Employee Daily Wage is :"+empdailywage);
			
			
		}
		
		else
		{
			System.out.println("Employee is abscent");
		}
	}

}
