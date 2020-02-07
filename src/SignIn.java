import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import MainFrame.LandingPage;;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the frame.
	 */
	public SignIn() {
		setTitle("SignIn Form");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 395, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(-109, 5, 504, 340);
		lblNewLabel_2.setIcon(new ImageIcon(SignIn.class.getResource("/images/pic.jpg")));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Keep Too");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(159, 356, 65, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(".....We Got You....");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(114, 382, 93, 14);
		panel.add(lblNewLabel_4);
		
		Button button = new Button("SignIn");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username = textFieldUsername.getText();
				String password = new String(passwordFieldPassword.getPassword());
				if(password.contains("Pass@123")&& username.contains("Rivaldo")) {
					dispose();
					passwordFieldPassword.setText(null);
					textFieldUsername.setText(null);					
					MainFrame.LandingPage mains = new MainFrame.LandingPage();
					MainFrame.LandingPage.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "foutieve login gegevens","Login error", JOptionPane.ERROR_MESSAGE);				
					passwordFieldPassword.setText(null);	
				}
	
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setBackground(new Color(241, 57, 83));
		button.setBounds(491, 272, 194, 42);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("Gebruikers Naam:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(452, 71, 126, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(452, 183, 151, 32);
		contentPane.add(lblNewLabel_1);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(452, 100, 279, 32);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		passwordFieldPassword = new JPasswordField();
		passwordFieldPassword.setBounds(452, 214, 279, 32);
		contentPane.add(passwordFieldPassword);
		
		Button Reset = new Button("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldUsername.setText(null);
				passwordFieldPassword.setText(null);
			}
		});
		Reset.setForeground(Color.WHITE);
		Reset.setFont(new Font("Dialog", Font.BOLD, 14));
		Reset.setBackground(Color.GRAY);
		Reset.setBounds(703, 405, 76, 24);
		contentPane.add(Reset);
	}
}

