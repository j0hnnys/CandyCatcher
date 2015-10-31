package View;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.Icon;

import Model.GameIcon;


public class IconDrawer implements Icon {
	
	private ArrayList<GameIcon> icons; 

	/**
	 * IconsDrawer acts as a View components. It merely paints all
	 * icons that are added to it's ArrayList of icons, with any
	 * regard for the icon's property values.
	 * @param iconsToDraw
	 */
	public IconDrawer(ArrayList<GameIcon> iconsToDraw) {
		
		icons = iconsToDraw;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		
		for (int i = 0; i < icons.size(); i++) {
			icons.get(i).paintIcon(c, g, x, y);
		}
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Adds multiple icons for IconDrawer to paint
	 * @param iconsToAdd the ArrayList of icons to add
	 */
	public void addMultipleicons(ArrayList<GameIcon> iconsToAdd) {
		icons.addAll(iconsToAdd);
	}
	
	/**
	 * Adds a single icon for IconDrawer to paint
	 * @param iconToAdd the icon to add
	 */
	public void addIcon(GameIcon iconToAdd) {
		icons.add(iconToAdd);
	}
	
}
