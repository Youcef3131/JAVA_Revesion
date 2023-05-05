
import java.util.*;
import java.util.Vector;

public class Banque {
    private String nom;
    private String prenom;
    private Vector<Banque.Compte> comptes = new Vector<Banque.Compte>();
    private Vector<Client> clients = new Vector<Client>();
    private Iterator<Banque.Compte> itCom = this.comptes.iterator();
    private Iterator<Client> itCl = this.clients.iterator();

    public abstract class Compte {
        private Client client;
        private int numero;
        private double solde;

        public Compte(Client client, int numero, double solde) {
            this.client = client;
            this.numero = numero;
            this.solde = solde;
        }

        public Client getClient() {
            return this.client;
        }

        public int getNumero() {
            return this.numero;
        }

        public double getSolde() {
            return this.solde;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void setSolde(double solde) {
            this.solde = solde;
        }

        public void deposer(double montant) {
            this.solde += montant;
        }

        public void retirer(double montant) {
            this.solde -= montant;
        }

        abstract public String toString();

        public void afficher() {
            System.out.println(this.toString());
        }

        public String getNomClient() {
            return this.client.getNom();
        }

        public String getPrenomClient() {
            return this.client.getPrenom();
        }

        public void setNomClient(String nom) {
            this.client.setNom(nom);
        }

        public void setPrenomClient(String prenom) {
            this.client.setPrenom(prenom);
        }
    }

    public Banque() {

    }

    public Banque(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Compte chercherCompte(int numero) {
        while (this.itCom.hasNext()) {
            Compte compte = (Compte) this.itCom.next();
            if (compte.getNumero() == numero) {
                return compte;
            }
        }
        return null;
    }

    public void ajouterCompte(Compte compte) {
        this.comptes.add(compte);
    }

    public void supprimerCompte(int numero) {
        Compte compte = this.chercherCompte(numero);
        if (compte != null) {
            this.comptes.remove(compte);
        }
    }

    public int nbComptes() {
        return this.comptes.size();
    }

    public Client chercherClient(int numero) {
        while (this.itCl.hasNext()) {
            Client client = (Client) this.itCl.next();
            if (client.getNumero() == numero) {
                return client;
            }
        }
        return null;
    }

    public void ajouterClient(Client cl) {
        this.clients.add(cl);
    }

    public void supprimerClient(int numero) {
        Client client = this.chercherClient(numero);
        if (client != null) {
            this.clients.remove(client);
        }
    }

    public int nbClients() {
        return this.clients.size();
    }

    public void modifierClient(int numero, String nom, String prenom) {
        Client client = this.chercherClient(numero);
        if (client != null) {
            client.setNom(nom);
            client.setPrenom(prenom);
        }
    }

    public String afficher(Vector v) {
        String s = "";
        for (int i = 0; i < v.size(); i++) {
            s += v.get(i).toString() + "\n";
        }
        return s;
    }
}
