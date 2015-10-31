package Model;

import java.util.ArrayList;

import javax.security.auth.x500.X500Principal;
import javax.swing.Icon;

/**
 * Every icon in the game should extend GameIcon so that we
 * can manipulate the icon's position in the frame.
 * 
 * @author Johnny
 *
 */
public abstract class GameIcon implements Icon {
	
	public abstract void setX(int xPos);
	public abstract void setY(int yPos);
	public abstract int getY();
	public abstract int getX();
	
	
}
