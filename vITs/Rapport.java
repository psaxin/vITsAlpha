package vITs;

import javax.swing.JPanel;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jdesktop.swingx.JXDatePicker;

import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Rapport extends JPanel {
	private JTextField tfNamn;
	private JTextField tfSemester;
	private JTextField tfAntalFrukost;
	private JTextField tfAntalLunch;
	private JTextField tfAntalMiddag;
	private JTextField textField;
	private JComboBox<String> cbLand;
	
	

	/**
	 * Create the panel.
	 */
	public Rapport() {
		setLayout(null);
		
		JPanel jpMaltid = new JPanel();
		jpMaltid.setBorder(new TitledBorder(null, "M\u00E5ltider", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpMaltid.setBounds(12, 244, 194, 129);
		add(jpMaltid);
		jpMaltid.setLayout(null);
		
		JLabel lblAntalFrukost = new JLabel("Antal frukost");
		lblAntalFrukost.setBounds(16, 31, 86, 16);
		jpMaltid.add(lblAntalFrukost);
		
		JLabel lblAntalLunch = new JLabel("Antal lunch");
		lblAntalLunch.setBounds(25, 60, 75, 16);
		jpMaltid.add(lblAntalLunch);
		
		JLabel lblAntalMiddag = new JLabel("Antal middag");
		lblAntalMiddag.setBounds(12, 89, 86, 16);
		jpMaltid.add(lblAntalMiddag);
		
		tfAntalFrukost = new JTextField();
		tfAntalFrukost.setBounds(114, 28, 63, 22);
		jpMaltid.add(tfAntalFrukost);
		tfAntalFrukost.setColumns(10);
		
		tfAntalLunch = new JTextField();
		tfAntalLunch.setBounds(114, 57, 63, 22);
		jpMaltid.add(tfAntalLunch);
		tfAntalLunch.setColumns(10);
		
		tfAntalMiddag = new JTextField();
		tfAntalMiddag.setColumns(10);
		tfAntalMiddag.setBounds(114, 86, 63, 22);
		jpMaltid.add(tfAntalMiddag);
		
		JPanel jpUppdrag = new JPanel();
		jpUppdrag.setBorder(new TitledBorder(null, "Uppdrag", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		jpUppdrag.setBounds(12, 13, 356, 218);
		add(jpUppdrag);
		jpUppdrag.setLayout(null);
		
		JLabel lblNamn = new JLabel("Uppdragsnamn");
		lblNamn.setBounds(44, 27, 103, 16);
		jpUppdrag.add(lblNamn);
		
		JLabel lblSemester = new JLabel("Antal semesterdagar");
		lblSemester.setBounds(12, 114, 135, 16);
		jpUppdrag.add(lblSemester);
		
		JLabel lblStartdatum = new JLabel("Startdatum");
		lblStartdatum.setBounds(66, 56, 81, 16);
		jpUppdrag.add(lblStartdatum);
		
		JLabel lblSlutdatum = new JLabel("Slutdatum");
		lblSlutdatum.setBounds(72, 85, 68, 16);
		jpUppdrag.add(lblSlutdatum);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setBounds(103, 143, 48, 16);
		jpUppdrag.add(lblLand);
		
		tfNamn = new JTextField();
		tfNamn.setBounds(159, 24, 175, 22);
		jpUppdrag.add(tfNamn);
		tfNamn.setColumns(10);
		
		tfSemester = new JTextField();
		tfSemester.setColumns(10);
		tfSemester.setBounds(159, 111, 48, 22);
		jpUppdrag.add(tfSemester);
		
		cbLand = new JComboBox<String>();
		cbLand.setBounds(159, 140, 175, 22);
		jpUppdrag.add(cbLand);
		
		JLabel lblNewLabel = new JLabel("Utl\u00E4gg");
		lblNewLabel.setBounds(92, 172, 56, 16);
		jpUppdrag.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(159, 169, 68, 22);
		jpUppdrag.add(textField);
		textField.setColumns(10);
		
		JLabel lblKr = new JLabel("kr");
		lblKr.setBounds(232, 172, 56, 16);
		jpUppdrag.add(lblKr);
		
		JButton btnSubmit = new JButton("Skicka");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setBounds(12, 386, 98, 25);
		add(btnSubmit);
		
		JButton btnSparaUtkast = new JButton("Spara utkast");
		btnSparaUtkast.setBounds(125, 386, 116, 25);
		add(btnSparaUtkast);
		
		JButton btnRensaFlt = new JButton("Rensa f\u00E4lt");
		btnRensaFlt.setBounds(253, 386, 115, 25);
		add(btnRensaFlt);
		
		
		JXDatePicker startDate = new JXDatePicker();
        startDate.setDate(Calendar.getInstance().getTime());
        startDate.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        startDate.setVisible(true);
        startDate.setBounds(159, 52, 120, 23);
        jpUppdrag.add(startDate);
        
        JXDatePicker endDate = new JXDatePicker();
        endDate.setDate(Calendar.getInstance().getTime());
        endDate.setFormats(new SimpleDateFormat("dd.MM.yyyy"));
        endDate.setVisible(true);
        endDate.setBounds(159, 82, 120, 23);
        jpUppdrag.add(endDate);
        
        

        
	
		
		fillCbLand();
	}
	
	public void fillCbLand() {

			File data = new File("C:\\Users\\klas_000\\git\\vITsAlpha\\vITs\\resource\\country.txt"); 
	        String line;
	        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
	        cbLand.setModel(model);
	       

	        try {	
	                FileReader fr = new FileReader(data);
	                BufferedReader br = new BufferedReader(fr);

	                while ((line = br.readLine()) != null) {
	                    model.addElement(line);
	                    System.out.println(line);
	                }

	                fr.close();
	                br.close();

	            } catch (IOException e) {
	                System.out.println();
	            }
	        }
}
	

