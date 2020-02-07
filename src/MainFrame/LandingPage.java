package MainFrame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class LandingPage extends JFrame {

	String [] pompkeuze = {"Pomp een","Pomp twee","Pomp drie"};
	JComboBox POMP = new JComboBox(pompkeuze);
	
	String [] OlieType = {"Diesel","Unleaded","Super Unleaded"};
	private JPanel contentPane;
	private JTextField textFieldbedrag;
	private JTextField textFieldlitters;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage frame = new LandingPage();
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
	public LandingPage() {
		setTitle("Golden Station");
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
		panel.setBounds(394, 0, 395, 439);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Button Unblock = new Button("UNBLOCK");
		Unblock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Unblock.setForeground(Color.WHITE);
		Unblock.setFont(new Font("Dialog", Font.BOLD, 14));
		Unblock.setBackground(new Color(241, 57, 83));
		Unblock.setActionCommand("UNBLOCK");
		Unblock.setBounds(109, 44, 194, 30);
		panel.add(Unblock);
		
		Button BLOCK = new Button("BLOCK");
		BLOCK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BLOCK.setForeground(Color.WHITE);
		BLOCK.setFont(new Font("Dialog", Font.BOLD, 14));
		BLOCK.setBackground(new Color(154, 205, 50));
		BLOCK.setActionCommand("BETAAL");
		BLOCK.setBounds(109, 97, 194, 42);
		panel.add(BLOCK);
		
		Button button = new Button("BETAAL");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setActionCommand("BETAAL");

		button.setForeground(Color.WHITE);
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setBackground(new Color(0, 0, 255));
		button.setBounds(50, 261, 194, 42);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("POMP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(10, 14, 126, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AANTAl LITERS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(10, 133, 89, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOlieType = new JLabel("OLIE TYPE");
		lblOlieType.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblOlieType.setBackground(Color.LIGHT_GRAY);
		lblOlieType.setBounds(10, 54, 126, 32);
		contentPane.add(lblOlieType);
		
		JLabel lblBedragSrd = new JLabel("BEDRAG SRD");
		lblBedragSrd.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBedragSrd.setBackground(Color.LIGHT_GRAY);
		lblBedragSrd.setBounds(10, 97, 89, 27);
		contentPane.add(lblBedragSrd);
		
		POMP.setBounds(108, 17, 105, 26);
		POMP.setSelectedIndex(0);
		POMP.addActionListener(POMP);
		contentPane.add(POMP);
		
		JComboBox comboBoxolietype = new JComboBox(OlieType);
		comboBoxolietype.setBounds(108, 60, 151, 26);
		comboBoxolietype.setSelectedIndex(0);
		comboBoxolietype.addActionListener(POMP);
		contentPane.add(comboBoxolietype);
		
		textFieldbedrag = new JTextField();
		textFieldbedrag.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				MainFrame.PompEEN info = new MainFrame.PompEEN();
				double bedragtest= Double.parseDouble(textFieldbedrag.getText());
				info.setBedrag(bedragtest / info.getTypeolievalue());
		       textFieldbedrag.setText(Double.toString(info.getBedrag()));
		       
			}
		});

		textFieldbedrag.setBounds(109, 100, 150, 24);
		contentPane.add(textFieldbedrag);
		textFieldbedrag.setColumns(10);
		
		textFieldlitters = new JTextField();
		textFieldlitters.setBounds(109, 136, 150, 24);
		contentPane.add(textFieldlitters);
		textFieldlitters.setColumns(10);

		textFieldlitters.setEditable(false);
		
		POMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== POMP) {
					MainFrame.Pomp mains = new MainFrame.Pomp();
					JComboBox cb = (JComboBox)e.getSource();
					String msg= (String)cb.getSelectedItem();
					switch(msg) {
					case "Pomp een": 		
					mains.setKeuzepomp(msg);
					lblBedragSrd.setText(msg);
					break;
					case "Pomp twee":
					mains.setKeuzepomp(msg);
					lblBedragSrd.setText(msg);
					break;
					case "Pomp drie":
					mains.setKeuzepomp(msg);
					lblBedragSrd.setText(msg);
					break;
					default:lblBedragSrd.setText("weqriiwekmqrewrwq");
					}
				}
			}
		});
		comboBoxolietype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== comboBoxolietype) {
					MainFrame.PompEEN info = new MainFrame.PompEEN();
					JComboBox cb = (JComboBox)e.getSource();
					String msg= (String)cb.getSelectedItem();
					switch(msg) {
					case "Diesel": 
					info.setTypeolievalue(5.88);
					break;
					case "Unleaded": 
					info.setTypeolievalue(6.41);
					break;
					case "Super Unleaded":
					info.setTypeolievalue(6.66);
					break;
					default:lblOlieType.setText("weqriiwekmqrewrwq");
					}
				}
			}
		});

		
	}
}
