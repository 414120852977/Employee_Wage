package ComputationProblem;

public class CheckEmployee {
	public static final int MAX=1;
	public static final int MIN=0;
	
	public void Compute(){
		int num = (int) (Math.random()*(MAX-MIN+1)+MIN);
		if(num == 1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is abscent");
		}
	}

}
