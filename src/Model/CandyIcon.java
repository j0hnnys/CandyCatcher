package Model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JFrame;


public class CandyIcon extends GameIcon {

	private int x_position;
	private int y_position;

	private final int CANDY_HEIGHT = 10;
	private final int CANDY_WIDTH = 10;
	
	public CandyIcon(int x_pos, int y_pos) {
		x_position = x_pos;
		y_position = y_pos;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2 = (Graphics2D) g;
		
		Ellipse2D.Double candy = new Ellipse2D.Double(x_position, y_position, getIconWidth(), getIconHeight());
		g2.setColor(Color.PINK);
		g2.fill(candy);
	}

	@Override
	public int getIconWidth() {
		return CANDY_WIDTH;
	}

	@Override
	public int getIconHeight() {
		return CANDY_HEIGHT;
	}
	

    // Returns the x_position of the catcher
    public int getX() {
    	return x_position;
    }
    
    // Returns the y_position of the catcher
    public int getY() {
    	return y_position;
    }
    
    // Sets the x_position to x
    public void setX(int x) {
    	x_position = x;
    }
    
    // Sets the y_position to y
    public void setY(int y) {
    	y_position = y;
    }

	/**
	 * Generates an ArrayList of CandyIcon objects in random y_positions.
	 * @param x_pos
	 * @param y_pos
	 * @return
	 */
	public static ArrayList<GameIcon> generateCandyIcons(JFrame frame, int numberOfCandies) {
		ArrayList<GameIcon> generatedCandies = new ArrayList<GameIcon>();
		int randomY_Position;
		
		for (int i = 0; i < numberOfCandies; i++) {
			
			randomY_Position = (int) (Math.random() * frame.getHeight());

			//	Generated candies' x_position starts at end of frame
			generatedCandies.add(new CandyIcon(frame.getWidth()-50, randomY_Position));
		}
		
		return generatedCandies;
	};
    
}
