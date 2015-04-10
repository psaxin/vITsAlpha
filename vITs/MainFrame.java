package vITs;


import java.awt.EventQueue;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login login = new Login();
					login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * test
	 */
	public MainFrame() {
	
        setDefaultCloseOperation(3);
        setTitle("vITs Resehantering");
        setPreferredSize(new Dimension(640, 480));
        setResizable(false);
       
        Logo logo = new Logo();
        add(logo);
        
        Tabs tabs = new Tabs();
        add(tabs);

        pack();
		
		/*
		 * KOD SOM INTE ÄR SWING
		 */
        DBConnect con = new DBConnect();
        try {
        System.out.println(con.readDB("select * from rapport").getString(1));
        } catch (Exception e) {
        	
        }
        
	
	}
}