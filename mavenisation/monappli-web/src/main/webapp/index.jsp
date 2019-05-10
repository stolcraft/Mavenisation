<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SITE WEB</title>
</head>
<body>
	<h1>SITE WEB</h1>

	<!-- On intègre un formulaire à la page HTML -->
	<form id="test" action="Connection" method="post">
		<div>
			<label for="nom">Login :</label> <input type="text" id="name"
				name="loginuser">
		</div>
		<div>
			<label for="prenom">MDP :</label> <input id="text" name="mdpuser" />
		</div>
		<input type="submit" value="Envoyer">

	</form>
</body>
</html>