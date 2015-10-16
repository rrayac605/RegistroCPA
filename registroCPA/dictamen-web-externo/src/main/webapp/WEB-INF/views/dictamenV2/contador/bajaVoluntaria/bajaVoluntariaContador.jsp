<%@ page import="com.google.gson.Gson" %>
<%@ page import="com.google.gson.GsonBuilder" %>
<%@ include file="../../../general/taglibs.jsp"%>

<script>
	<%
	    GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.setDateFormat("dd/MM/yyyy HH:mm:ss");
	    Gson GSON = gsonBuilder.create();
    %>
	var ndtContadorPublicoAutDTO = <%=GSON.toJson(request.getAttribute("ndtContadorPublicoAutDTO"))%>;
	var personaFisica = <%=GSON.toJson(request.getAttribute("personaFisica"))%>;
	var personaMoral = <%=GSON.toJson(request.getAttribute("personaMoral"))%>;
</script>

<link type="text/css" href="<spring:url value="/static/resources/css/comunes/comunes.css"/>" rel="stylesheet" />

<script type="text/javascript" src="/gestionSolicitud-web/static/resources/js/delta/firma-digital/FirmaDigital.js"></script>

<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/dialogoMensaje.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/firmaDigitalInit.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/bajaVoluntaria/bajaVoluntariaContador.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/visor/visorAcuse.js" htmlEscape="true" />"></script>

<form:form action="<%=request.getContextPath()%>/dictamen/contador/bajaVoluntaria/guardarBajaVoluntariaContador.do" id="idFrmBajaVoluntariaContador" method="post">
</form:form>
<div class="row">
	<h2><spring:message code="label.menu.servicios.titulo.baja.voluntaria"/></h2>
	<hr class="red">
</div>
<div id="idDivSubtituloPasoUno" class="row">
	<h5><spring:message code="label.baja.voluntaria.subtitulo.paso.uno.tramite"/></h5>
</div>
<div id="idDivSubtituloPasoDos" class="row">
	<h5><spring:message code="label.baja.voluntaria.subtitulo.paso.dos.tramite"/></h5>
</div>
<div id="idDivSubtituloPasoTres" class="row">
	<h5><spring:message code="label.baja.voluntaria.subtitulo.paso.tres.tramite"/></h5>
</div>
<div id="idDivSubtituloPasoCuatro" class="row">
	<h5><spring:message code="label.baja.voluntaria.subtitulo.paso.cuantro.tramite"/></h5>
</div>
<br/>
<div class="row">
	<div id="idDivDatosGenerales">
		<jsp:include page="../infoGeneral/datosGenerales.jsp"></jsp:include>
	</div>
	<div id="idDivComentariosBajaVoluntaria">
		<jsp:include page="../infoBajaVoluntaria/datosBajaVoluntaria.jsp"></jsp:include>
	</div>
	<div id="idDivVistaPreliminar">
		<jsp:include page="../infoPreliminar/datosPreliminares.jsp"></jsp:include>
	</div>
	<div id="idDivResumenRegistro">
		<jsp:include page="../resumenRegistro/resumenRegistro.jsp"></jsp:include>
	</div>
</div>
</br>
<div id="idDivLabelDatosRequeridos" class="row">
	<label style="text-align: left; color: #D0021B;" class="col-md-3 control-label">
		<span class="required">*</span><spring:message code="label.campo.requerido"/>
	</label>
</div>
<div class="row">
	<div class="text-right">
		<button type="button" id="idBtnCancelar" class="btn btn-default" onclick="salirMenuServicios();"><spring:message code="boton.cancelar"/></button>
		<button type="button" id="idBtnContinuar" class="btn btn-primary" onclick="cambiarPagina(1);"><spring:message code="boton.continuar"/></button>
		<button type="button" id="idBtnFinalizarTramite" class="btn btn-primary"><spring:message code="boton.aceptar"/></button>
		<button type="button" id="idBtnSalirTramite" class="btn btn-danger" onclick="salirMenuServicios();"><spring:message code="boton.salir.tramite"/></button>
	</div>
</div>
<div class="iconos-pie m-t-xl">
	<hr style="margin-bottom: 30px;" class="red">
	<div class="row">
		<div class="col-md-4 text-center">
			<span class="glyphicon glyphicon-book"></span>
			<span><spring:message code="link.guia.usuario"/></span>
		</div>
		<div class="col-md-4 text-center">
			<span class="icon-phone"></span>
			<span><spring:message code="link.contacto"/></span>
		</div>
		<div class="col-md-4 text-center">
			<span class="glyphicon glyphicon-question-sign"></span>
			<span><spring:message code="link.preguntas.frecuentes"/></span>
		</div>
	</div>
</div>
<div id="firmaDigitalComponent"></div>
<div id="visorTramitesDictamen" >
 	<form action="/firmaElectronicaWeb/rest/imss/buscarSeguimiento" class = "formNotBlock" method="post" target="firmaIframe" id="formaAcuse">
    	<input type="hidden" name="params" id="idTramite"/>
	</form>
	<form action="/firmaElectronicaWeb/rest/imss/buscarArchivos" class = "formNotBlock" method="post" target="firmaIframe" id="formaAdjuntos">
		<input type="hidden" name="params" id="idTramite"/>
	</form>
	
	<iframe id="firmaIframe" name="firmaIframe" height="500" width="850" style="display: none;"></iframe>
</div>