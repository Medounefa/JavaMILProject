import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Professeur {

	JFrame frame;
	private JTable table;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Professeur window = new Professeur();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Professeur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,1450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Espace d'administration");
		lblNewLabel.setBounds(576, 38, 384, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 90, 582, 319);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Ajout Professeur", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 157, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 36, 157, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nom");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(231, 11, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 115, 157, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Adresse");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 90, 46, 14);
		panel.add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(231, 115, 157, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telephone");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(231, 90, 97, 14);
		panel.add(lblNewLabel_1_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 191, 157, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(10, 166, 46, 14);
		panel.add(lblNewLabel_1_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(231, 191, 157, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("Fonction");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(231, 166, 67, 14);
		panel.add(lblNewLabel_1_5);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(37, 244, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModifier.setBounds(177, 244, 89, 23);
		panel.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer.setBounds(314, 244, 89, 23);
		panel.add(btnSupprimer);
		
		JLabel lblNewLabel_2 = new JLabel("Search by id");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(450, 90, 89, 14);
		panel.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(450, 115, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Liste Professeurs", null, panel_1, null);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 464, 269);
		panel_1.add(table);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(684, 90, 553, 319);
		frame.getContentPane().add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Secretaire", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_6 = new JLabel("Prenom");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_6.setBounds(10, 11, 46, 14);
		panel_2.add(lblNewLabel_1_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 36, 157, 20);
		panel_2.add(textField_7);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nom");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(231, 11, 46, 14);
		panel_2.add(lblNewLabel_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(231, 36, 157, 20);
		panel_2.add(textField_8);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Adresse");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(10, 90, 46, 14);
		panel_2.add(lblNewLabel_1_2_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 115, 157, 20);
		panel_2.add(textField_9);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Telephone");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3_1.setBounds(231, 90, 97, 14);
		panel_2.add(lblNewLabel_1_3_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(231, 115, 157, 20);
		panel_2.add(textField_10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Search by id");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(450, 90, 89, 14);
		panel_2.add(lblNewLabel_2_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(450, 115, 86, 20);
		panel_2.add(textField_11);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Email");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4_1.setBounds(10, 166, 46, 14);
		panel_2.add(lblNewLabel_1_4_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 191, 157, 20);
		panel_2.add(textField_12);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Status");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5_1.setBounds(231, 166, 67, 14);
		panel_2.add(lblNewLabel_1_5_1);
		
		JButton btnNewButton_1 = new JButton("Ajouter");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(37, 244, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnModifier_1 = new JButton("Modifier");
		btnModifier_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModifier_1.setBounds(177, 244, 89, 23);
		panel_2.add(btnModifier_1);
		
		JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_1.setBounds(314, 244, 114, 23);
		panel_2.add(btnSupprimer_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choisi un status", "Super Admin", "Admin"}));
		comboBox.setBounds(231, 191, 157, 20);
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Liste secretaires", null, panel_3, null);
	}
}
