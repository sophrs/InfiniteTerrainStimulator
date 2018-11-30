package infiniteTerrainStimulator;

import java.util.Scanner;

public class Game {
	
	////////Attributes/////////////
	
	
	//////Constructors//////////////
	

	////////////Methods/////////////
	
    public static void startGame() {
	
    	System.out.println("You awaken to find yourself in a barren moor. Try Look");
    	Scanner Look = new Scanner(System.in);
    	String look = Look.nextLine();
  	
    }
    
    public static void pickDirection() {
    	
    	boolean picked = true;
    	do {
    		System.out.println("Try North, South, East or West");
    		Scanner Direction = new Scanner(System.in);
        	String direction = Direction.nextLine();
        	
        	if (direction.contentEquals("North")) {
        		Compass.goNorth();
        		picked = true;
        	}
        	else if (direction.contentEquals("East")) {
        		Compass.goEast();
        		picked = true;
        	}
        	else if(direction.contentEquals("South")) {
        		Compass.goSouth();
        		picked = true;
        	}
        	else if(direction.contentEquals("West")) {
        		Compass.goWest();
        		picked = true;
    		}
    	
    	} while (picked); }
    		
    	
    	
    	
	
    public static void endGame() {
    	
    	if (Dial.item == "treasure") {
    		System.out.println("You win! The end.");
    		
    	}
    	
    	else {
    		System.out.println("Oh no! you were eaten by a monster! you lose. The end");
    	}
    
	
	}}
	
