package vITs;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import java.awt.Choice;

public class advancePayment extends JPanel {
	private JTextField apNameTf;
	private JTextField apDateTf;
	private JTextField apAmountTf;
	private JTextField apCommentTf;

	
	/**
	 * Create the panel.
	 */
	public advancePayment() {
		fillAssignmentCbAp();
		setLayout(null);
		
		apNameTf = new JTextField();
		apNameTf.setBounds(154, 52, 174, 20);
		apNameTf.setEditable(false);
		add(apNameTf);
		apNameTf.setColumns(10);
		
		JLabel apNameLbl = new JLabel("Namn");
		apNameLbl.setBounds(154, 27, 46, 14);
		add(apNameLbl);
		
		JLabel apDateLbl = new JLabel("Datum");
		apDateLbl.setBounds(154, 102, 46, 14);
		add(apDateLbl);
		
		apDateTf = new JTextField();
		apDateTf.setBounds(154, 127, 174, 20);
		apDateTf.setEditable(false);
		add(apDateTf);
		apDateTf.setColumns(10);
		
		JLabel apAmountLbl = new JLabel("\u00D6nskat belopp ");
		apAmountLbl.setBounds(154, 188, 72, 14);
		add(apAmountLbl);
		
		apAmountTf = new JTextField();
		apAmountTf.setBounds(154, 213, 174, 20);
		add(apAmountTf);
		apAmountTf.setColumns(10);
		
		JLabel apAssignmentLbl = new JLabel("V\u00E4lj uppdrag");
		apAssignmentLbl.setBounds(10, 27, 89, 14);
		add(apAssignmentLbl);
		
		JButton apSendBtn = new JButton("Ans\u00F6k");
		apSendBtn.setBounds(395, 212, 89, 23);
		add(apSendBtn);
		
		JComboBox apAssignmentCb = new JComboBox();
		apAssignmentCb.addPopupMenuListener(new PopupMenuListener() {
	
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
				
			fillNameAp();
			fillCountryAp();
			fillDateAp();

			}
	
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
		});
		apAssignmentCb.setBounds(10, 52, 113, 20);
		add(apAssignmentCb);
		
		apCommentTf = new JTextField();
		apCommentTf.setBounds(361, 52, 174, 150);
		add(apCommentTf);
		apCommentTf.setColumns(10);
		
		JLabel apCommentLbl = new JLabel("Kommentar");
		apCommentLbl.setBounds(361, 27, 78, 14);
		add(apCommentLbl);

	}
	
	protected void fillNameAp()
	{
		
		String a = apAssignmentCb.getSelectedItem();
		String sqlFraga = "Select Namn From Utbildare join Rapport on Rapport.idutbildare = utbildare.itutbildare where rapport.uppdrag = 'a'";
		

		apNameTf.setText();
		
	}
	
	protected void fillCountryAp()
	{
		String a;
		apCountryTf.setText(a);
		
	}

	protected void fillDateAp()
	{
		String a;
		apDateTf.setText(a);
	}
	
	protected void sendRequestAp()
	{
		
		
	}
	

	protected void fillAssignmentCbAp()
	{}

	protected void fillAssignmentAp()
	{
		
		
	}
}

