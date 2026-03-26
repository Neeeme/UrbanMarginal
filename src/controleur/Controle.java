package controleur;
import vue.EntreeJeu;


public class Controle {
	
	private EntreeJeu frmEntreeJeu ;

	private Controle() {
		this.frmEntreeJeu = new EntreeJeu();
		this.frmEntreeJeu.setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Controle();
	}

}
