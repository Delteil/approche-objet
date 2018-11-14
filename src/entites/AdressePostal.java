package entites;

public class AdressePostal {
	
	public int numeroRue = -1;
	public String nomRue = "";
	public int codePostal = 0;
	public String ville = "";

	public void afficheAdressePostal() {
		System.out.println("numéro de rue => " + numeroRue + " nom de la rue => " + nomRue + " code postal => " + codePostal + " ville => " + ville);
	}
}
