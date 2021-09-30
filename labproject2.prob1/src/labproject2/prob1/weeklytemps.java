package labproject2.prob1;

public class weeklytemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}


	
	 
	 public double getMax(double[]temps) {
		 double max=0.0;
		for(int i=0;i<=max;i++) {
			if(temps[i]>max) {
				max=temps[i];
			}
		}
	 return max;
	 }
	



	public double getMin(double[]temps) {
		double min=0.0;
		for(int i=0; i>=min;i++) {
			if(temps[i]<min){
				min=temps[i];
			}
		}
		
		return min;
	}


public String getRange(double[]temps) {
	double min=getMin(temps);
	double max=getMax(temps);
	
	String range=String.format("%.1f- %.1f",min,max);
	return range;
	
}
public double getMean(double[]temps) {
	double sum=0.0;
	for(int i=0; i<temps.length;i++) {
		sum+=temps[i];
		
	}
	double mean=sum/temps.length;
	return mean;
}


public int getExtreme(double[]temps) {
	int count=0;
	for(int i=0;i<temps.length; i++) {
		if(temps[i]<=5||temps[i]>=95){
			count+=1;
		}
		
	}
	return count;
}




}