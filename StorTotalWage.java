package ComputationProblem;

public class StorTotalWage {
public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int MAX = 2;
	public static final int MIN = 0;

	public void computeTotalWage(String company, int emprateperhr, int noofworkingdays, int maxhourspermonth){
		
		int emphr = 0, empdailywage = 0, monthlyempwage = 0, totalemphr =0, monthworkday = 0 ;
		while(totalemphr <= maxhourspermonth && monthworkday <= noofworkingdays ) {
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
		monthlyempwage = maxhourspermonth * empdailywage;
		System.out.println("company is :"+company + " " +"monthlyempwage :"+monthlyempwage +" "+ "daily employee wage is :"+empdailywage);
		}
	}
	
	public static void main(String[] args) {
		
		StorTotalWage store = new StorTotalWage();
		store.computeTotalWage("tata motors",20,15,20);
		store.computeTotalWage("ashokpharma", 20, 5, 10);
		store.computeTotalWage("dream11", 30, 4, 12);
		store.computeTotalWage("paytm", 5, 5, 5);
		
	}

	
}

	
	 


