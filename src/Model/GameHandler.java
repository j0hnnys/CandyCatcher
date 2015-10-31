package Model;

import java.util.ArrayList;


public class GameHandler implements Runnable {
	
	private CatcherIcon candyCatcher;
	private ArrayList<GameIcon> candies;
	
	private int points;
	private boolean gameOn;
	
	public GameHandler(CatcherIcon catcher, ArrayList<GameIcon> candies2) {
		
		points = 0;
		gameOn = true;
		
		candyCatcher = catcher;
		candies = candies2;
	}

	public ArrayList<GameIcon> allIconsToDraw() {
		
		ArrayList<GameIcon> allGameIcons = new ArrayList<GameIcon>();
		
		allGameIcons.addAll(candies);
		allGameIcons.add(candyCatcher);
		
		return allGameIcons;
	}
	
	@Override
	public void run() {
		
		while (gameOn) {
			
			for (GameIcon candy : candies) {
				
				if (candyCatcher.caughtCandy(candy)) {
					
					points++;
					candy.setX(1100);
				}
			}
		}
	}
	
	
	
}
