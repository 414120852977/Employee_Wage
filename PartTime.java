package ComputationProblem;

public class PartTime {
	public static final int MAX=2;
	public static final int MIN=0;
	public static final int EMP_WAGE_PER_HR=20;
	
	
	public void Compute(){
		int emphr=0,empdailywage=0;
		int num = (int) (Math.random()*(MAX-MIN+1)+MIN);
		
		if(num == 2)
		{
			System.out.println("Employee is full time");
			emphr=8;
			
		}
		else if(num == 1)
		{
			System.out.println("Employee is part time");
			emphr=4;
			
		}
		
		else
		{
			System.out.println("Employee is abscent");
		}
		
		empdailywage = EMP_WAGE_PER_HR * emphr;
		System.out.println("Employee Daily Wage is :"+empdailywage);
	}


}
