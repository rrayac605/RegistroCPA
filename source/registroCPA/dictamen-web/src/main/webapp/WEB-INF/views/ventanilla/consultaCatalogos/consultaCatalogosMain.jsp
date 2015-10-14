<%@ include file="../../general/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="<%=request.getContextPath()%>/static/resources/js/dictamenVentanilla/consultaCatalogos/consultaCatalogosMain.js"></script>

<title>Insert title here</title>
</head>
<body>

<spring:message code="label.tipo.catalogo"/>
                <select  id="selectTipoCatalogo" name="tipoCatalogo" onchange="selectTipoCatalogo()" class="form-control filter">
               		 <option value="-1">Seleccione Opcion</option>
               		 <option value="1">Contadores Publicos Autorizados</option>
               		 <option value="2">Despachos</option>
               		 <option value="3">Colegios y Asociaciones</option>
                </select>
<br>
<div id="contadoresPublicosAutorizadosDIV">
	<jsp:include page="contadoresPublicosAutorizados.jsp"></jsp:include>
</div>
<div id="despachosDIV">
	<jsp:include page="despachos.jsp"></jsp:include>
</div>
<div id="colegiosAsociacionesDIV">
	<jsp:include page="colegiosAsociaciones.jsp"></jsp:include>
</div>



</body>
</html>