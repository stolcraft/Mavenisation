package eu.ensup.formulaire.service;

import eu.ensup.formulaire.dao.DaoInsererUtilisateur;
import eu.ensup.formulaire.domaine.Utilisateur;


public class ServiceGestionUtilisateur {

	public boolean insereUtilisateur(Utilisateur utilisateur) {

		boolean resultat;
		DaoInsererUtilisateur DIU = new DaoInsererUtilisateur();
		resultat = DaoInsererUtilisateur.sauverEnBase(utilisateur);
		return resultat;
		
	}


	
}
