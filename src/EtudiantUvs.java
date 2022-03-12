import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EtudiantUvs {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EtudiantUvs window = new EtudiantUvs();
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
	public EtudiantUvs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GESTION DES ETUDIANT DE L'UVS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(513, 30, 341, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "PRENOM ET NOM", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel.setBounds(37, 106, 330, 155);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 38, 65, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nom");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 89, 65, 14);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(85, 36, 222, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 87, 222, 20);
		panel.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ADRESSE ET NUMERO DE TELEPHONE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_1.setBounds(427, 106, 330, 155);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Adresse");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setBounds(10, 38, 65, 14);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Telephone");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 89, 65, 14);
		panel_1.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(85, 36, 222, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(85, 87, 222, 20);
		panel_1.add(textField_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "EMAIL ET INE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_2.setBounds(37, 300, 330, 155);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_3.setBounds(10, 38, 65, 14);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("INE");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(10, 89, 65, 14);
		panel_2.add(lblNewLabel_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(85, 36, 222, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(85, 87, 222, 20);
		panel_2.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PRENOM NOM  ET TELEPHONE DE VOS TUTEUR", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_3.setBounds(427, 300, 330, 220);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Prenom");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_4.setBounds(10, 38, 65, 14);
		panel_3.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Nom");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3.setBounds(10, 89, 65, 14);
		panel_3.add(lblNewLabel_1_1_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(85, 36, 222, 20);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(85, 87, 222, 20);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(85, 133, 222, 20);
		panel_3.add(textField_8);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Telephone");
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3_1.setBounds(10, 135, 65, 14);
		panel_3.add(lblNewLabel_1_1_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Filiere", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(37, 466, 330, 54);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selectionne une filiere", "INGENIERIE LOGICIELLE", "SYSTEME INRASTRUCTURE ET RESEAUX", "MULTIMEDIA", "INFORMATIQUE ET DEVELOPPEMENT D'APPLICATION", "ART GRAPHIQUE NUMERIQUE", "MATH APPLIQUE INFORMATIQUE", "SCIENCE POLIITIQUE", "SCIENCE JURIDIQUE", "SCIENCE JURIDIQUE ET POLITIQUE", " "}));
		comboBox.setBounds(59, 11, 160, 20);
		panel_4.add(comboBox);
		
		JButton btnNewButton = new JButton("Valide");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(356, 527, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "La liste des etudiants", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBounds(789, 106, 571, 349);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 21, 551, 317);
		panel_5.add(table);
		
		JButton btnNewButton_1 = new JButton("Modifier");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(789, 497, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Supprimer");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBounds(904, 497, 98, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Effacer");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_2.setBounds(1024, 497, 89, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Professeurs");
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_3.setBounds(1144, 497, 117, 23);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Filieres");
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_4.setBounds(1271, 497, 89, 23);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Quit");
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_5.setBounds(1271, 54, 89, 23);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Administrateur");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Professeur pro = new Professeur();
				pro.frame.setVisible(true);

			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_6.setBounds(1111, 54, 141, 23);
		frame.getContentPane().add(btnNewButton_1_6);
	}
}
