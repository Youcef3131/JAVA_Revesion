
public class Client {
    private String nom;
    private String prenom;
    private int numero;

    public Client() {

    }

    public Client(String nom, String prenom, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Client: " + this.nom + " " + this.prenom + " " + this.numero;
    };

    public void afficher() {
        System.out.println(this.toString());
    }
}
