import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//Purpose: how give an activity, the amount of energy put in.
		//It tells you how many calories were burnt completing said task,
		//and also compares it to the amount of energy needed to do 
		//another task.
		
		
		//Should be made simple, for people to understand who
		//don't take physics. 
		//user-a-bility? usability?????? 
		
		
		
		//uses elements from Unit3PhysSolver.
		Scanner in=new Scanner(System.in);
		
		double work=0;
		double time=0;
		double power=0;
		
		double equiv=0;
		//find POWER
			System.out.println("Total work (in J)?");
			
			work=in.nextDouble();
			
			System.out.println("Total time taken (in seconds)?");
			time=in.nextDouble();
			
			power=(work/time);
			
			System.out.println((power)+(" Watts of energy were used."));
			System.out.println("");
			System.out.println("A watt is measured in 'joules used per second.'");
			System.out.println(("For every second, you used ")+(power)+(" watts."));
			
			System.out.println(" ");
			System.out.print("This is close to the amount of power required to");
			
			
			//this is saying
			//:If power is greater than 0 AND power is lower than 200, do x.
			if (power>0&&power<82) {
				System.out.print(" sleep.");
			}
				
				if (power>83&&power<150) {
					System.out.print(" sit at rest.");
					
			}
				
				if (power>151&&power<220) {
					System.out.print(" sit and study.");
				
				
			}
				
				if (power>221&&power<300) {
					System.out.print(" walk at 5km/h.");
					
					
				}
				
				if (power>301&&power<500) {
					System.out.print(" play tennis.");
				}
				
				if (power>501&&power<850) {
				System.out.print(" play basketball.");
			
			//if power=(>400) {
				//System.out.println();
				
	}

}

}