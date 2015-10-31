package Controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Model.CatcherIcon;

/**
 * IconMouseListener adds a listener the frame so that wherever you click,
 * the candy catcher would move there.
 * @author Johnny
 *
 */
public class IconMouseListener implements MouseListener {
	
	private CatcherIcon iconToMove;
	private JFrame frame;
	private int x, y;
	
	public IconMouseListener(CatcherIcon i, JFrame frameToRepaint) {
		iconToMove = i;
		frame = frameToRepaint;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
 
	}

	/**
	 *	This event causes the candy catcher to move to
	 *	the mouse's position
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		//		Mouse click coordinates
			int x = e.getX();
			int y = e.getY();

			iconToMove.setX(x - iconToMove.getIconWidth()/2);
			iconToMove.setY(y - iconToMove.getIconHeight()/2);
			
			frame.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
