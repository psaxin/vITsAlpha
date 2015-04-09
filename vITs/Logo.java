package vITs;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Logo extends JPanel {

	/**
	 * Create the panel.
	 */
	public Logo() {
		setBackground(Color.WHITE);
		
		JLabel logotyp = new JLabel("");
		logotyp.setIcon(new ImageIcon(Logo.class.getResource("/vITs/resource/vITsLogga.gif")));
		add(logotyp);

	}

}
