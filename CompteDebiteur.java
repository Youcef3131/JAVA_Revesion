
public class CompteDebiteur extends Banque.Compte {
    private static double seuil;

    public CompteDebiteur(Client cl, int numero, double solde, Banque banque) {
        banque.super(cl, numero, solde);
    }

    public static double getSeuil() {
        return seuil;
    }

    public static void setSeuil(double seuil) {
        CompteDebiteur.seuil = seuil;
    }

    public void retirer(double montant) {
        if (this.getSolde() - montant < this.seuil) {
            System.out.println("Retrait impossible");
        } else {
            this.setSolde(this.getSolde() - montant);
        }
    }

    public String toString() {
        return "Compte debiteur n°" + this.getNumero() + " de " + this.getNomClient() + " " + this.getPrenomClient()
                + " : solde = " + this.getSolde() + " seuil = " + this.seuil;
    };
}
