package labproject2.prob1;

public class TestWeeklyTemps {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[ ] testTemps= {32.5,88.3,0.3,100.3,56.3,23.5,99.3};
		weeklytemps lastweek=new weeklytemps();
		System.out.println("");
		System.out.println(lastweek.getMean(testTemps));
	}
	
	
	
}
