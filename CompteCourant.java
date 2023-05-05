
public class CompteCourant extends Banque.Compte {
    public CompteCourant(Client cl, int numero, double solde, Banque banque) {
        banque.super(cl, numero, solde);
    }

    public void retirer(double montant) {
        this.setSolde(this.getSolde() - montant);
    }

    public String toString() {
        return "Compte courant: " + this.getNumero() + " " + this.getSolde() + " " + this.getNomClient() + " "
                + this.getPrenomClient();
    }
}
