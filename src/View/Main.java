package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.annotation.Generated;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.IconMouseListener;
import Controller.IconRunner;
import Model.CandyIcon;
import Model.CatcherIcon;
import Model.GameHandler;
import Model.GameIcon;

public class Main {
    public static void main(String[] args) {
    	
        final JFrame frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setLocation(100, 100);
        
        //	Create all catcher icon components
        final CatcherIcon catcher = new CatcherIcon();
        final ArrayList<GameIcon> candies = CandyIcon.generateCandyIcons(frame, 20);
        
        //	Create game handler which handles the catcher and the candies
        GameHandler gameHandler = new GameHandler(catcher, candies);
        
        if (gameHandler.allIconsToDraw() == null )
        	System.out.println("nothing here");
                
        //	Add icons to an IconDrawer
        IconDrawer iconsToDraw = new IconDrawer(gameHandler.allIconsToDraw());
        
        //	Load CompoundIcon onto) JLabel
        JLabel label = new JLabel(iconsToDraw);
        
        //	Add label with all icons to frame
        frame.add(label);
        

        //	Add the button and a listener to the button
        JButton button = new JButton("Move the boy");
        frame.add(button, BorderLayout.SOUTH);
        
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				catcher.setX(catcher.getX()+10);
				frame.repaint();
			}
		});
        
        //	Add the mouse listener to be able move the catcher
        IconMouseListener mouseClickListener = new IconMouseListener(catcher, frame);
        frame.addMouseListener(mouseClickListener);
        
        //	Add runners to move candies
        IconRunner r1 = new IconRunner(candies, frame);
        
        //	Create thread with runners.
        Thread t1 = new Thread(r1);
        Thread gameThread = new Thread(gameHandler);
        
        t1.start();
        gameThread.start();
        
        //	Initiate frame values
        frame.setResizable(true);
        frame.setVisible(true);
        
    }
    
}
