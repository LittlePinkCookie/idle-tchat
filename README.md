IDLETCHAT
=========

#Démarrage
	1. Se placer à la racine et compiler l'ensemble du projet à l'aide de la compile list (javac @compile.list)
		un warning apparaîtra à la compilation, il faut l'ignorer
	2. Exécutez le serveur (java serveur.TchatServer [portNumber])
		si aucun port n'est renseigné, le port 8003 sera attribué par défaut
	3. Pour exécuter le client en mode CUI : java client.Client
	4. Pour exécuter le client en mode GUI : java client.controler.Controler
	
	
#Utilisation
	~ CUI :
		Entrez votre pseudo
		Entrez l'adresse du serveur auquel vous souhaitez accéder
		Enjoy :)
		
	~ GUI :
		Menu "Client" -> "Connexion"
		Entrez l'adresse du serveur auquel vous souhaitez accéder
		Entrez votre pseudo
		Enjoy :)
		
	De nombreuses commandes existent. Pour les lister, faites /help.
	
		
#Administration
	Il existe dans IdleTchat un système d'administration. Pour devenir administrateur, entrez cette commande : /adminlogin idle8003
	Être administrateur vous permet d'accéder à toutes les commandes listées dans le /adminhelp
	

#Déconnexion
	Pour vous déconnecter, vous pouvez utiliser la commande /quit (fonctionne en CUI et GUI) ou utiliser le menu Client > Déconnexion (fonctionne uniquement en GUI) 
	
	
	
	
#Notes sur le code
	Le code de notre serveur est légerement différent de celui-ci des autres. 
	En effet, de par l'utilisation d'une IHM possédant une liste de client connectés, nous étions dans l'obligation d'envoyer des objets entre le serveur et client. Ainsi
	nous avons du sérialiser tout le traffic Serveur -> Client (par conséquent les tests avec NC ne fonctionneront pas).
	
	Il est facilement faisable de rajouter des commandes à votre guise. Il suffit de créer une classe implémentant l'interface Commande, et d'ajouter celle-ci dans 
	TchatServeur à l'aide la méthode addCommande(String nomCommande, Commande cmd);
	
	