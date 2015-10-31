package View;

import javax.swing.JFrame;


public class GameBoardFrame extends JFrame {
	
	/**
	 * Serial id
	 */
	private static final long serialVersionUID = 1L;
	
	private final int X_LOCATION = 100;
	private final int Y_LOCATION = 100;
	private final int WIDTH = 1200;
	private final int HEIGHT = 700;

	
	public GameBoardFrame() {
		super();
		setLocation(X_LOCATION, Y_LOCATION);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	
}
