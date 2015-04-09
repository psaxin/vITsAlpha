
package vITs;

import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login extends JFrame {


	private JTextField txtUsername;
	private JPasswordField passwordField;

	

	/*	DBConnect db = new DBConnect();

	

		private String getUserName() {
			
			String userName = txtUsername.getText();

			String sql = "Select UID from Utbildare "
					+ "where Utbildare.UID = " + userName;


			try {
				String aid = db.readDB(sql);
				txtUsername.setText(aid);

			} catch (Exception e) {

			}

			getPassword();
		}

		private void getPassword() {

			String userName = txtUsername.getText();

			String sqlFraga = "Select password from Utbildare "
					+ "where Utbildare.UID = " + userName;

			try {
				String password = passwordField.getText();

				String dbPassword = db.fetchSingle(sqlFraga);

				if (password.equals(dbPassword)) {

					MainFrame main = new MainFrame();
					main.setVisible(true);

				}


			}
			catch (Exception e) {

			} 

		} */

		public Login() {


			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 591, 467);
			JPanel loginPane = new JPanel();
			loginPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(loginPane);
			loginPane.setLayout(null);

			JPanel loginPanel = new JPanel();
			loginPanel.setBounds(10, 0, 560, 412);
			loginPane.add(loginPanel);
			loginPanel.setLayout(null);


			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setBounds(25, 0, 508, 147);
			lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/vITs/resource/vITsLogga.gif")));
			loginPanel.add(lblNewLabel);

			JLabel lblUsername = new JLabel("Username:");
			lblUsername.setBounds(72, 199, 68, 23);
			loginPanel.add(lblUsername);

			txtUsername = new JTextField();
			txtUsername.setBounds(72, 225, 68, 20);
			loginPanel.add(txtUsername);
			txtUsername.setColumns(10);

			JLabel lblPassword = new JLabel("Password:");
			lblPassword.setBounds(72, 256, 68, 23);
			loginPanel.add(lblPassword);

			passwordField = new JPasswordField();
			passwordField.setBounds(72, 279, 68, 20);
			loginPanel.add(passwordField);

			JButton btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					MainFrame main = new MainFrame();
					main.setVisible(true);
					dispose();
				}
			});
			btnLogin.setBounds(263, 278, 89, 23);
			loginPanel.add(btnLogin);
		}	
	}