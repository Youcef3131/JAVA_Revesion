
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banque b = new Banque("BNA", "Alger");
		Client c1 = new Client("Hachichi", "Assia", 1);
		Client c2 = new Client("Boussaid", "Ilhem", 2);
		Client c3 = new Client("Benzaid", "Chafika", 3);
		Client c4 = new Client("Chenait", "Manel", 4);
		b.ajouterClient(c1);
		b.ajouterClient(c2);
		b.ajouterClient(c3);
		b.ajouterClient(c4);
		Banque.Compte cpt1, cpt2, cpt3, cpt4, cpt5;
		cpt1 = new CompteCourant(c1, 1, 1000, b);
		cpt2 = new CompteCourant(c2, 2, 2000, b);
		cpt3 = new CompteCourant(c3, 3, 5000, b);
		cpt4 = new CompteCourant(c4, 4, 40000, b);
		cpt5 = new CompteCourant(c1, 5, -1000, b);
		b.ajouterCompte(cpt1);
		b.ajouterCompte(cpt2);
		b.ajouterCompte(cpt3);
		b.ajouterCompte(cpt4);
		b.ajouterCompte(cpt5);

		c1.afficher();
		c2.afficher();
		c3.afficher();
		c4.afficher();
		cpt1.afficher();
		cpt2.afficher();
		cpt3.afficher();
		cpt4.afficher();
		cpt5.afficher();
		System.out.println("Nombre de clients: " + b.nbClients());
		System.out.println("Nombre de comptes: " + b.nbComptes());
	}

}
