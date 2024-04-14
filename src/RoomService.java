import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;

public class RoomService {

	private JFrame frmBdRoomservice;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	double a,b,c,d,e,f,g,h,i,j,k,l,m,n;
	double x,y,y1,y2,z;
	String x1,x2,x3,x4;
	JLabel lblNewLabel_3 = new JLabel();
	JLabel lblNewLabel_3_2 = new JLabel();
	JLabel lblNewLabel_3_3 = new JLabel();
	JLabel lblNewLabel_3_4 = new JLabel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomService window = new RoomService();
					window.frmBdRoomservice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RoomService() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBdRoomservice = new JFrame();
		frmBdRoomservice.setResizable(false);
		frmBdRoomservice.setFont(new Font("Arial Black", Font.ITALIC, 20));
		frmBdRoomservice.setTitle("B&D - RoomService");
		frmBdRoomservice.getContentPane().setBackground(Color.CYAN);
		frmBdRoomservice.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(10, 10, 400, 660);
		frmBdRoomservice.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(10, 10, 150, 35);
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 55, 150, 35);
		lblLastName.setBackground(new Color(0, 0, 255));
		lblLastName.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblLastName);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(10, 100, 150, 35);
		lblMobile.setBackground(new Color(0, 0, 255));
		lblMobile.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblMobile);
		
		JLabel lblDateOfBirth = new JLabel("Birthdate");
		lblDateOfBirth.setBounds(10, 145, 150, 35);
		lblDateOfBirth.setBackground(new Color(0, 0, 255));
		lblDateOfBirth.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblDateOfBirth);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(10, 190, 150, 35);
		lblNationality.setBackground(new Color(0, 0, 255));
		lblNationality.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNationality);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 235, 150, 35);
		lblEmail.setBackground(new Color(0, 0, 255));
		lblEmail.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblEmail);
		
		JLabel lblNewLabel_5_1 = new JLabel("Adults");
		lblNewLabel_5_1.setBounds(10, 370, 150, 35);
		lblNewLabel_5_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_5_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Check-out");
		lblNewLabel_4_1.setBounds(10, 325, 150, 35);
		lblNewLabel_4_1.setBackground(new Color(240, 255, 240));
		lblNewLabel_4_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Check-in");
		lblNewLabel_3_1.setBounds(10, 280, 150, 35);
		lblNewLabel_3_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Children");
		lblNewLabel_5_1_1.setBounds(10, 415, 150, 35);
		lblNewLabel_5_1_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_5_1_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		panel.add(lblNewLabel_5_1_1);
		
		textField = new JTextField();
		textField.setBounds(180, 10, 150, 35);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 55, 150, 35);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 145, 150, 35);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 100, 150, 35);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(180, 235, 150, 35);
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(180, 190, 150, 35);
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		JTextPane comboBox = new JTextPane();
		comboBox.setBounds(180, 280, 150, 35);
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(comboBox);
		
		JTextPane comboBox_1 = new JTextPane();
		comboBox_1.setBounds(180, 325, 150, 35);
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(comboBox_1);
		
		JTextField comboBox_1_1 = new JTextField();
		comboBox_1_1.setBounds(180, 370, 150, 35);
		comboBox_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(comboBox_1_1);
		
		JTextField comboBox_1_2 = new JTextField();
		comboBox_1_2.setBounds(180, 415, 150, 35);
		comboBox_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(comboBox_1_2);
		
		
	
		
	


		JButton btnNewButton = new JButton("Total");
		btnNewButton.setBounds(10, 500, 150, 100);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				x= Double.parseDouble(comboBox.getText());
				y= Double.parseDouble(comboBox_1.getText());
				y1 = Double.parseDouble(comboBox_1_1.getText());
				y2 = Double.parseDouble(comboBox_1_2.getText());
				z=(125*y1 + 62.5*y2)*(y-x);
				
				x1= String.format(" %.2f",z);
				lblNewLabel_3.setText(x1 + " $");
				
				a= Double.parseDouble(textField_6.getText()) * 1.25;
				b= Double.parseDouble(textField_7.getText()) * 1.75;
				c= Double.parseDouble(textField_8.getText()) * 2.25;
				d= Double.parseDouble(textField_9.getText()) * 1.50;
				f= Double.parseDouble(textField_10.getText()) * 1.75;
				g= Double.parseDouble(textField_11.getText()) * 2.50;
				h= Double.parseDouble(textField_12.getText()) * 1.35;
				i= Double.parseDouble(textField_13.getText()) * 1.75;
				j= Double.parseDouble(textField_14.getText()) * 4.25;
				k= Double.parseDouble(textField_15.getText()) * 2.75;
				
				l=(a + b + c + d  + f + g + h + i + j + k)*(y-x);
				
				x2 =String.format(" %.2f",l);
				lblNewLabel_3_2.setText(x2 + " $");
				
				m= (z + l)*5/100;
				x3 =String.format(" %.2f",m);
				lblNewLabel_3_3.setText(x3 + " $");
				
				n= z+l+m;
				x4 =String.format(" %.2f",n);
				lblNewLabel_3_4.setText(x4 + " $");
				


			}
		});
	
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setBounds(200, 45, 150, 25);
		
		
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(180, 500, 150, 100);
		btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		panel.add(btnReset);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(430, 10, 400, 0);
		frmBdRoomservice.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 191, 255));
		panel_2.setBounds(855, 10, 400, 660);
		frmBdRoomservice.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnSave.setBounds(42, 506, 150, 100);
		panel_2.add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmBdRoomservice.dispose();
			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		btnExit.setBounds(212, 506, 150, 100);
		panel_2.add(btnExit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 255));
		panel_5.setBounds(10, 10, 380, 457);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Thank you for your reservation!");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_4.setBounds(10, 10, 360, 171);
		lblNewLabel_4.setVisible(false);
		
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("You'll recieve an \r\ne-mail for confirmation");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_5.setBounds(0, 195, 380, 171);
		lblNewLabel_5.setVisible(false);
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 191, 255));
		panel_3.setBounds(435, 10, 400, 660);
		frmBdRoomservice.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Coffe");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { textField_6.setEditable(true);
			}
		});
		chckbxNewCheckBox.setBounds(6, 6, 150, 35);
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxCroissant = new JCheckBox("Croissant");
		chckbxCroissant.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {textField_7.setEditable(true);
			}
		});
		chckbxCroissant.setBounds(6, 52, 150, 35);
		chckbxCroissant.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxCroissant);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Eggs");
		chckbxNewCheckBox_1_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { textField_9.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_1.setBounds(6, 145, 150, 35);
		chckbxNewCheckBox_1_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxSandwich = new JCheckBox("Sandwich");
		chckbxSandwich.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { textField_8.setEditable(true);
			}
		});
		chckbxSandwich.setBounds(6, 99, 150, 35);
		chckbxSandwich.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxSandwich);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Salad");
		chckbxNewCheckBox_1_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {textField_11.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_2.setBounds(6, 238, 150, 35);
		chckbxNewCheckBox_1_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxFruits = new JCheckBox("Fruits");
		chckbxFruits.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { textField_10.setEditable(true);
			}
		});
		chckbxFruits.setBounds(6, 192, 150, 35);
		chckbxFruits.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxFruits);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Bacon");
		chckbxNewCheckBox_1_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { textField_13.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_3.setBounds(6, 332, 150, 35);
		chckbxNewCheckBox_1_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxNewCheckBox_1_3);
		
		JCheckBox chckbxTea = new JCheckBox("Tea");
		chckbxTea.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {textField_12.setEditable(true);
			}
		});
		chckbxTea.setBounds(6, 286, 150, 35);
		chckbxTea.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxTea);
		
		JCheckBox chckbxNewCheckBox_1_4 = new JCheckBox("Yogurt");
		chckbxNewCheckBox_1_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { textField_15.setEditable(true);
			}
		});
		chckbxNewCheckBox_1_4.setBounds(6, 425, 150, 35);
		chckbxNewCheckBox_1_4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxNewCheckBox_1_4);
		
		JCheckBox chckbxPancakes = new JCheckBox("Pancakes");
		chckbxPancakes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {textField_14.setEditable(true);
			}
		});
		chckbxPancakes.setBounds(6, 379, 150, 35);
		chckbxPancakes.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		panel_3.add(chckbxPancakes);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setEditable(false);
		textField_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_6.setColumns(10);
		textField_6.setBounds(223, 8, 150, 35);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setEditable(false);
		textField_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_7.setColumns(10);
		textField_7.setBounds(223, 54, 150, 35);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setEditable(false);
		textField_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_8.setColumns(10);
		textField_8.setBounds(223, 101, 150, 35);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setEditable(false);
		textField_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_9.setColumns(10);
		textField_9.setBounds(223, 147, 150, 35);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setText("0");
		textField_10.setEditable(false);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_10.setColumns(10);
		textField_10.setBounds(223, 194, 150, 35);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setEditable(false);
		textField_11.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_11.setColumns(10);
		textField_11.setBounds(223, 240, 150, 35);
		panel_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setText("0");
		textField_12.setEditable(false);
		textField_12.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_12.setColumns(10);
		textField_12.setBounds(223, 286, 150, 35);
		panel_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setEditable(false);
		textField_13.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_13.setColumns(10);
		textField_13.setBounds(223, 334, 150, 35);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setEditable(false);
		textField_14.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_14.setColumns(10);
		textField_14.setBounds(223, 381, 150, 35);
		panel_3.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setEditable(false);
		textField_15.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		textField_15.setColumns(10);
		textField_15.setBounds(223, 427, 150, 35);
		panel_3.add(textField_15);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 255));
		panel_4.setBounds(10, 472, 380, 178);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tax & Total");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(10, 10, 360, 25);
		panel_4.add(lblNewLabel_1);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Room");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(10, 45, 150, 25);
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Food");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_1.setBounds(10, 80, 150, 25);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Taxes");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2.setBounds(10, 115, 150, 25);
		panel_4.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Total");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2_2_1.setBounds(10, 153, 150, 25);
		panel_4.add(lblNewLabel_2_2_1);
		
		
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_2.setBackground(Color.BLUE);
		lblNewLabel_3_2.setBounds(200, 80, 150, 25);
		panel_4.add(lblNewLabel_3_2);
		
		
		lblNewLabel_3_3.setForeground(Color.WHITE);
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_3.setBackground(Color.BLUE);
		lblNewLabel_3_3.setBounds(200, 115, 150, 25);
		panel_4.add(lblNewLabel_3_3);
		
		
		lblNewLabel_3_4.setForeground(Color.WHITE);
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_4.setBackground(Color.BLUE);
		lblNewLabel_3_4.setBounds(200, 150, 150, 25);
		panel_4.add(lblNewLabel_3_4);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_5.setVisible(true);
				lblNewLabel_4.setVisible(true);
			}
		});
		
		
		frmBdRoomservice.setBackground(Color.WHITE);
		frmBdRoomservice.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Andre\\Desktop\\B&D.png"));
		frmBdRoomservice.setBounds(100, 100, 1280, 720);
		frmBdRoomservice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
