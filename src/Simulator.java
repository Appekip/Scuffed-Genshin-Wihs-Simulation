import java.util.Random;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random Randomizer = new Random();
		Wish w = new Wish(0, 0);
		Wishrng Wishrand = new Wishrng();
		
	
		
			
				while (w.getFiveCount() < 1) {//Loops until Five Star count gets to 1
					
					Wishrand.addsimC(1);//Raises the amount of simulation cycles by one
					
					Wishrand.setC(0); //Resets the Wish Counter for the next simulation
					w.resetPityCount(); //Resets the Pity for the next simulation
					Wishrand.wisher(89);//Runs the simulation, parameter decides the amount of Wishes 
					w.plusFiveCount(Wishrand.get5());//Saves the value of the last simulations Five Stars
					w.plusFourCount(Wishrand.get4());//Saves the value of the last simulations Four Stars
					w.pluswCount(Wishrand.getwCount());//Saves the amount of wishes done
	
			
			}
				

	
		
		System.out.println("Simulation ends ----------------");
		System.out.println("Total number of simulations: " + Wishrand.getsimC());
		System.out.println("Total Wish Count: " + w.getwCount());
		System.out.println("Total Five Star Count: " + w.getFiveCount());
		System.out.println("Total Four Star Count: " + w.getFourCount());
		
		
	
	}
}
