package commandes;

import serveur.GerantDeClient;
import serveur.TchatServer;

public interface Commande {
	boolean onCommand(TchatServer ts, GerantDeClient sender, String[] args);
	boolean estAffichable();
	String getError();
	String getDescription();
}