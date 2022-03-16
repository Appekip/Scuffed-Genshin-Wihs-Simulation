import java.util.Random;

public class Wishrng {
	
	int wcount = 0; //Counts all of the Wishes
	int five = 0;// Counts all the Five Stars
	int four = 0;// Counts all the Four Stars
	int simC = 0;//Count the number of simulations
	
	
	public void wisher(int x) {
	
	Random Randomizer = new Random();
	Wish w = new Wish(0, 0);
	w.resetPityCount();
	wcount = 0;
	System.out.println("New Simulation starts--------------");
	five = 0;//Resets the Five Star counter
	four = 0;//Resets the Four Star counter
	while (wcount < x) {

	int r = Randomizer.nextInt(1000);
	r += 1;
	
	if (w.getPity5Count() == 89) { //Check if 5 star pity
		
		five++; //Five Star count goes up by one
		
		wcount++; //Wish Count goes up by 1
		
		System.out.println("Five Star, Reached pity, Wish counter's at: " + wcount);
		
		System.out.println("Five Star number: " + five);
		
		w.resetPityCount();//Resets both pity counters
		
		
		
		
		
	}
	
	else if (w.getPity4Count() == 9){ //Check if 4 star pity
		
		four++; //Four Star count goes up by one
		
		wcount++; //Wish Count goes up by 1
		
		System.out.println("Four Star Reached pity, Wish counter's at: " + wcount);
		
		System.out.println("Four Star number: " + four);
		
		w.resetPity4Count();//Resets the Four Star pity counter
		
		w.pity5Count();//Raises the Five Star pity by one
		
		
		
	}
	
	else if (r <= 6) {
		five++; //Five Star count goes up by one
		
		wcount++; //Wish Count goes up by 1
		
		System.out.println("Five Star without pity, pity was at: " + w.getPity5Count() + ". Wishes were at: " + wcount);
		
		w.resetPityCount();//Resets both pity counters
		
		System.out.println("Five Star number: " + five);
		
		
		
	}
	
	else if (r >= 949) {
		four++; //Four Star count goes up by one
		
		wcount++; //Wish Count goes up by 1
		
		System.out.println("Four Star without pity, pity was at: " + w.getPity4Count() + ". Wishes were at: " + wcount);
		
		System.out.println("Four Star number: " + four);
		
		w.pity5Count();//Raises the Five Star pity by one
		
		w.resetPity4Count();//Resets the Four Star pity counter
		
		
		
	}
	
		else {
			w.pity4Count(); //Raises the Four Star pity by one
			
			w.pity5Count();//Raises the Five Star pity by one
			
			wcount++; //Wish Count goes up by 1
			
			//System.out.println("Three star, what a shame, Wish counter's at: " + wcount);
			}
	

	
		}
	
	System.out.println("Total Wish Count: " + wcount);
	System.out.println("Total Five Star Count: " + five);
	System.out.println("Total Four Star Count: " + four);
	}

public int get5() {//Returns the value of the Five Star counter 
	return five;
}

public int getwCount() {//Returns the value of the Wish counter 
	return wcount;
}

public int get4() {//Returns the value of the Four Star counter 
	return four;
}

public void set4(int x) {//Sets the value of the Four Star counter
	this.four = x;
}

public void set5(int x) {//Sets the value of the Five Star counter
	this.five = x;
}

public void setC(int x) {//Sets the value of the Wishs counter
	this.wcount = x;
}

public int getsimC() {
	return simC;
}



public void addsimC(int x) {
	simC = simC + x;
	
}

}
