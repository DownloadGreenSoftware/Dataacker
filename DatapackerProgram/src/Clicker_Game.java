// Imports necessary classes
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Defines the class
public class Clicker_Game {
    // Gui object
	public Clicker_Game() {
		
		// Creates the window
		JFrame frame = new JFrame();
		
		// Creates the buttons and text
		JButton button = new JButton("Click me");
		JLabel label = new JLabel("Clicks: 0");
		JLabel welp = new JLabel("Click limit: 128");
		JButton upgrades = new JButton("Upgrades");
		
		// Creates the panel to add the buttons and text on
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		panel.add(welp);
		panel.add(upgrades);
		
		// Other configurations
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clicker game");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
        // Displays the Gui
		new Clicker_Game();
	}

}
