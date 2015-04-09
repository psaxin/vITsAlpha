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
	private JTextField apCountryTf;
	private JTextField apDateTf;
	private JTextField apAmountTf;

	
	/**
	 * Create the panel.
	 */
	public advancePayment() {
		setLayout(null);
		fillAssignmentAp();
		
		apNameTf = new JTextField();
		apNameTf.setEditable(false);
		apNameTf.setBounds(154, 52, 174, 20);
		add(apNameTf);
		apNameTf.setColumns(10);
		
		apCountryTf = new JTextField();
		apCountryTf.setEditable(false);
		apCountryTf.setBounds(154, 108, 174, 20);
		add(apCountryTf);
		apCountryTf.setColumns(10);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(154, 27, 46, 14);
		add(lblNamn);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setBounds(154, 83, 46, 14);
		add(lblLand);
		
		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setBounds(154, 139, 46, 14);
		add(lblDatum);
		
		apDateTf = new JTextField();
		apDateTf.setEditable(false);
		apDateTf.setBounds(154, 164, 174, 20);
		add(apDateTf);
		apDateTf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u00D6nskat belopp ");
		lblNewLabel.setBounds(154, 195, 72, 14);
		add(lblNewLabel);
		
		apAmountTf = new JTextField();
		apAmountTf.setBounds(154, 222, 174, 20);
		add(apAmountTf);
		apAmountTf.setColumns(10);
		
		JLabel lblVljUppdrag = new JLabel("V\u00E4lj uppdrag");
		lblVljUppdrag.setBounds(10, 27, 89, 14);
		add(lblVljUppdrag);
		
		JButton apSendBtn = new JButton("Ans\u00F6k");
		apSendBtn.setBounds(412, 221, 89, 23);
		add(apSendBtn);
		
		Choice apAssignmentCb = new Choice();
		apAssignmentCb.setBounds(10, 52, 89, 20);
		add(apAssignmentCb);

	}
	
	protected void fillNameAp()
	{
		String a;
		apNameTf.setText(a);
		
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
	
	protected void fillAssignmentAp()
	{}
}

