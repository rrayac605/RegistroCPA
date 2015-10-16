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
<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/registro/registroContador.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/visor/visorAcuse.js" htmlEscape="true" />"></script>

<form:form action="<%=request.getContextPath()%>/dictamen/contador/registro/guardarContador.do" id="idFrmRegistroContador" method="post">
</form:form>
<div class="row">
	<h2><spring:message code="label.menu.servicios.titulo"/></h2>
	<hr class="red">
</div>
<div class="row">
	<ul class="pagination pull-right">
  		<li class="disabled" id="idLinkPaginaInicio">
  			<span>&laquo;</span>
  		</li>
	  	<li class="active" id="idLinkPaginaUno">
	  		<span title="Datos personales" data-placement="top" data-toggle="tooltip" id="tooltipPaso1">
	  			<spring:message code="numero.paginacion.uno"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaDos">
	  		<span title="Datos del despacho" data-placement="top" data-toggle="tooltip" id="tooltipPaso2">
	  			<spring:message code="numero.paginacion.dos"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaTres">
	  		<span title="Datos del colegio" data-placement="top" data-toggle="tooltip" id="tooltipPaso3">
	  			<spring:message code="numero.paginacion.tres"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaCuatro">
	  		<span title="Adjuntar Documentos" data-placement="top" data-toggle="tooltip" id="tooltipPaso4">
	  			<spring:message code="numero.paginacion.cuatro"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaCinco">
	  		<span title="Vista preliminar" data-placement="top" data-toggle="tooltip" id="tooltipPaso5">
	  			<spring:message code="numero.paginacion.cinco"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaSeis">
	  		<span title="T&eacute;rminos y condiciones" data-placement="top" data-toggle="tooltip" id="tooltipPaso6">
	  			<spring:message code="numero.paginacion.seis"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaSiete">
	  		<span title="Finalizar el Tr&aacute;" data-placement="top" data-toggle="tooltip" id="tooltipPaso7">
	  			<spring:message code="numero.paginacion.siete"/>
	  		</span>
	  	</li>
	  	<li class="disabled" id="idLinkPaginaFinal">
	  		<span>&raquo;</span>
	  	</li>
	</ul>
</div>
<div class="row">
	<div id="idDivDatosGenerales">
		<jsp:include page="../infoGeneral/datosGenerales.jsp"></jsp:include>
	</div>
	<div id="idDivDatosDespacho">
		<jsp:include page="../infoDespacho/datosDespacho.jsp"></jsp:include>
	</div>
	<div id="idDivDatosProfesionales">
		<jsp:include page="../infoProfesional/datosProfesionales.jsp"></jsp:include>
	</div>
	<div id="idDivDatosDocumentos">
		<jsp:include page="../infoDocumentos/datosDocumentos.jsp"></jsp:include>
	</div>
	<div id="idDivVistaPreliminar">
		<jsp:include page="../infoPreliminar/datosPreliminares.jsp"></jsp:include>
	</div>
	<div id="idDivTerminosCondiciones">
		<jsp:include page="../infoTerminosCondiciones/datosTerminosCondiciones.jsp"></jsp:include>
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
<br>
<div class="row">
	<div class="col-sm-2">
		<button type="button" id="idBtnCancelar" class="btn btn-primary" onclick="salirMenuServicios();"><spring:message code="boton.cancelar"/></button>
	</div>
	<div class="text-right">
		<button type="button" id="idLinkAvisoPrivacidad" class="btn btn-link"><spring:message code="link.aviso.privacidad"/></button>
		<button type="button" id="idBtnAnterior" class="btn btn-default" onclick="cambiarPagina(-1);"><spring:message code="boton.anterior"/></button>
		<button type="button" id="idBtnContinuar" class="btn btn-primary" onclick="cambiarPagina(1);"><spring:message code="boton.continuar"/></button>
		<button type="button" id="idBtnFinalizarTramite" class="btn btn-primary"><spring:message code="boton.aceptar"/></button>
		<button type="button" id="idBtnCancelarTerminos" class="btn btn-default" onclick="cambiarPagina(-1);"><spring:message code="boton.cancelar"/></button>
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