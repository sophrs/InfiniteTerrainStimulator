package infiniteTerrainStimulator;

public class Dial {
	////////aTTRIBUTES////////
	
	String distance;
	static String item;
	
	///////cONSTRUCTORS/////////
	public Dial(){
		this.distance = "100m";
		this.item = "treasure";
		
		
	}
	
	
	////////Methods///////
	
	public String getdistance() {
		return this.distance;
	}

	public String getitem() {
		return this.item;
	}
}
