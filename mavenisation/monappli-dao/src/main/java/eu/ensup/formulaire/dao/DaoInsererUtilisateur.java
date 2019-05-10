package eu.ensup.formulaire.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import eu.ensup.formulaire.domaine.Utilisateur;

public class DaoInsererUtilisateur {

	public static boolean sauverEnBase(Utilisateur utilisateur) {

		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String login = "root";
		String passwd = "";
		Connection cn = null;
		Statement st = null;
		int id = 2;

		System.out.println(utilisateur);
		
		try {

			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, passwd);
			

			// Etape 3 : Création d'un statement
			st = cn.createStatement();

			String sql = "INSERT INTO `utilisateur` (`login`,`mdp`) VALUES ('" + utilisateur.login + "','" + utilisateur.pwd + "')";

			// Etape 4 : exécution requête
			st.executeUpdate(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				// Etape 6 : libérer ressources de la mémoire.
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return true;
	}

}
