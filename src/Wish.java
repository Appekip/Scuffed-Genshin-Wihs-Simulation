
public class Wish {

	int pity4 = 0;
	int pity5 = 0;
	int fiveCount = 0;
	int fourCount = 0;
	
	int wcount = 0;
	
	
	public Wish(int four, int five) {
		this.pity4 = four;
		this.pity5 = five;
	}
	
	public void pity4Count (){
		pity4++;
	}
	public void pity5Count (){
		pity5++;
	}
	
	public int getPity4Count() {
		return pity4;
	}
	
	public int getPity5Count() {
		return pity5;
	}
	
	public void resetPityCount() {
		pity5 = 0;
		pity4 = 0;
	}
	
	public void resetPity4Count() {
		pity4 = 0;
	}
	
	public void setFiveCount(int c) {
		this.fiveCount = c;
		}
	
	public void setFourCount(int b) {
			this.fourCount = b;
		}
	
	public void addFourCount() {
		fourCount++;
	}
	
	public void addFiveCount() {
		fiveCount++;
	}
	
	public int getFourCount() {
		return fourCount;
	}
	
	public int getFiveCount() {

			return fiveCount;
		}
	

	public void plusFourCount(int x) {
		
		fourCount = fourCount + x;
		
	}

	public void plusFiveCount(int x) {
		fiveCount = fiveCount + x;
		
	}

	public void pluswCount(int x) {
		
		wcount = wcount + x;
		
	}
	
	public int getwCount() {
		return wcount;
	}
}

