package vITs;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

	private JPanel mainPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 * HEJ JOHAN
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 467);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		mainPane.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(5, 5, 560, 412);
		mainPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.setBounds(5, 147, 545, 265);
		mainPanel.add(mainTabbedPane);
		
		JTabbedPane reportTP = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.addTab("Rapportering", null, reportTP, null);
		
		JPanel newReportPanel = new JPanel();
		reportTP.addTab("Skapa ny", null, newReportPanel, null);
		newReportPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		newReportPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 42, 86, 20);
		newReportPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel changeReportPanel = new JPanel();
		reportTP.addTab("Komplettera", null, changeReportPanel, null);
		
		JPanel manageReportsPanel = new JPanel();
		mainTabbedPane.addTab("Hantera rapporter", null, manageReportsPanel, null);
		
		JPanel applyTravelExpensesPanel = new JPanel();
		mainTabbedPane.addTab("S\u00F6k reseers\u00E4ttning", null, applyTravelExpensesPanel, null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/vITs/resource/vITsLogga.gif")));
		lblNewLabel.setBounds(5, 0, 508, 147);
		mainPanel.add(lblNewLabel);
	}
}
