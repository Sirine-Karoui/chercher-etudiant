<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="controleur.php" method ="post">
Chercher: <input type="text" name="nomchercher"
value="">
<input type="submit" value="ok">
</form>
<table border="2" width="50%">
<tr>
<th> ID </th> <th> Nom </th> <th> Prénom
</th>
</tr>
<c:forEach items="${modele.etudiants}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.nom}</td>
<td>${e.prenom}</td>
</tr>
</c:forEach>
</table>
</body>
</html>