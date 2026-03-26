package vue;
import vue.Arene;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPseudo;
	private Arene frmArene;


	/**
	 * Launch the application.
	 */

	private void btnPrecedent_clic() {
		System.out.println("Précédent");
	}
	
	private void btnSuivant_clic() {
		System.out.println("Suivant");
	}
	
	private void btnGo_clic() {
		this.frmArene = new Arene();
		this.frmArene.setVisible(true);
		this.dispose();
	}
	
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("Choice");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(143, 244, 119, 20);
		contentPane.add(txtPseudo);
		txtPseudo.setColumns(10);
		
		JLabel lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnPrecedent_clic();
			}
		});
		lblPrecedent.setBounds(57, 145, 46, 46);
		contentPane.add(lblPrecedent);
		
		JLabel lblSuivant = new JLabel("");
		lblSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnSuivant_clic();
			}
		});
		lblSuivant.setBounds(291, 145, 46, 46);
		contentPane.add(lblSuivant);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGo_clic();
			}
		});
		lblGo.setBounds(301, 192, 74, 72);
		contentPane.add(lblGo);
		
		JLabel lblFond = new JLabel("");
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);
		
		String chemin = "fonds/fondchoix.jpg";
		URL resource = getClass().getClassLoader().getResource(chemin);
		lblFond.setIcon(new ImageIcon(resource));

	}

}
