package perfectsum;
import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		double d=sc.nextDouble();
		PerfectSquare p=new PerfectSquare();
		boolean b=false;
		b=p.isPerfect(d);
		if(b==true){
			System.out.println("the number is perfect sum");
		}
		else{
			System.out.println("the number is not perfect square sum");
		}
		sc.close();
		}
}
	class PerfectSquare{
		double n;
		double i,j;
		//double arr[]=new double[100];
		boolean temp=false;
		List<Double> li = new ArrayList<Double>();
		
		
		
		
		boolean isPerfect(double a){
		
		for(i=0;i<(int)a;i++) {
		int k=(int)Math.sqrt(i);
		
			if(k*k == i) {
				
				li.add(i);
				}
			}
		Double[] arr = li.toArray(new Double[0]);
		for(i=0;i<arr.length;i++) {
			for(j=i;j<arr.length;j++) {
				if(arr[(int)i]+arr[(int)j]==a) {
			
				 temp= true;			
			}
		}
		
		}
		
		return temp;
	}
	}

