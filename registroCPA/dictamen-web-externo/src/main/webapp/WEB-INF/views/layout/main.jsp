<%@ include file="../general/taglibs.jsp"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="max-age=100, must-revalidate" />
<meta name="description"
	content="Instituto Mexicano del Seguro Social Portal DELTA" />

<!-- GOBMX -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta lang="es">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<%-- <jsp:include page="staticResources.jsp"></jsp:include> --%>

<jsp:include page="staticResources.jsp">
    <jsp:param value="true" name="isGobMxIncluded"/>
</jsp:include>

<script>
	var context_path = '<%= request.getContextPath()%>';

	$(function(){
		$('form:not(.formNotBlock)').submit(function(){
			$.blockUI();
		});
	});
</script>

</head>

<body>
	<main class="page">
     	<div class="container top-buffer">
      		<tiles:insertAttribute name="contenido" />
     	</div>
    </main>
    
<%-- 	<tiles:insertAttribute name="encabezado" /> --%>

<!-- 	<div id="cuerpo" class="page"> -->
<%-- 		<tiles:insertAttribute name="contenido" /> --%>
<!-- 	</div> -->
	
<%-- 	<tiles:insertAttribute name="pie" /> --%>
	
	<div style="display: none;">
		<c:set var="contextpath" value="<%=request.getContextPath()%>" />
		<form id="formCerrarSesion"
			action="${pageContext.servletContext.contextPath}/j_spring_security_logout"
			method="get"></form>
	</div>
	
	<div id="dialogEndOfSession" style="display: none"
		title="Sesi&oacute;n terminada por inactividad">
		<span>Su sesi&oacute;n se ha desactivado debido a inactividad.</span>
	</div>
	
	<script src="http://cdn.imss.gob.mx/qa/gobmx.js"></script>
</body>
</html>