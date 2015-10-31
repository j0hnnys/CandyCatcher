package Controller;
import java.util.ArrayList;

import javax.swing.JFrame;

import Model.GameIcon;


public class IconRunner implements Runnable {
	
	private ArrayList<GameIcon> icon;
	private JFrame frame;
	int delay;
	
	public IconRunner(ArrayList<GameIcon> candyIconsToMove, JFrame frameToRepaint) {
		
		icon = candyIconsToMove;
		frame = frameToRepaint;
		delay = (int) (Math.random() * 1000) + 50;
		
	}

	@Override
	public void run() {
		
		while (true) {
			
			try {
				
				for (int i = 0; i < icon.size(); i++) {

					delay = (int) (Math.random() * 50) + 50;
					Thread.sleep(delay);
					
					icon.get(i).setX(icon.get(i).getX() - 75);

					frame.repaint();
					
					if (icon.get(i).getX() < 0) {
					
						icon.get(i).setX(1100);
					}
				}
				
				
			} catch  (InterruptedException e) {
				
			}
		}
	}

}
