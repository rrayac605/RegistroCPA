<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IMSS Digital - Nuevo Dictamen Electr�nico</title>
</head>
<body>
<%
    request.getSession().setAttribute("curp", "DUSL821218HDFRLC09");
    request.getSession().setAttribute("rfc", "DUSL821218LN8");
    String redirectURL = "faces/views/welcome.xhtml";
    response.sendRedirect(redirectURL);
%>
</body>
</html>