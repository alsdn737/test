package practice;


public class Prompt {
	static int[] ordinaryYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	
	public void getDaysOfYearAndMonth(int getYear,int getDaysOfMonth) {
			
		
		   System.out.println("MO TU WE TH FR SA SU");
		for (int i = 1; i <= getDaysOfMonth; i++) {
			System.out.printf(" %2d", i);
			if(i%7==0) {
				System.out.println();
			}
			
		}
		}
	}

		
		
