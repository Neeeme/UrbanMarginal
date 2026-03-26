package vue;

import vue.Arene;
import vue.ChoixJoueur;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIp;
	private Arene frmArene;
	private ChoixJoueur frmChoixJoueur;


	/**
	 * Launch the application.
	 */
	private void btnStart_clic() {
		this.frmArene = new Arene();
		this.frmArene.setVisible(true);
		this.dispose();
	}
	
	private void btnConnect_clic() {
		this.frmChoixJoueur = new ChoixJoueur();
		this.frmChoixJoueur.setVisible(true);
		this.dispose();
	}
	
	private void btnExit_clic() {
		System.exit(0);
	}

	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 159);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		btnStart.setBounds(187, 11, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
			}
		});
		btnConnect.setBounds(187, 58, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic();
			}
		});
		btnExit.setBounds(187, 92, 89, 23);
		contentPane.add(btnExit);
		
		txtIp = new JTextField();
		txtIp.setText("127.0.0.1");
		txtIp.setBounds(60, 59, 119, 20);
		contentPane.add(txtIp);
		txtIp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("IP server :");
		lblNewLabel.setBounds(6, 62, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Connect an existing server :");
		lblNewLabel_1.setBounds(6, 37, 173, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Start a server :");
		lblNewLabel_2.setBounds(6, 15, 171, 14);
		contentPane.add(lblNewLabel_2);

	}

}
