<%@ include file="../../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoTerminosCondiciones/datosTerminosCondiciones.js" htmlEscape="true" />"></script>

<form:form id="idFrmDatosTerminosCondiciones" class="form-horizontal" role="form">
 	<div class="row">
  		<h3><spring:message code="label.registro.contador.subtitulo.paso.datos.terminos"/></h3>
	</div>
	<br/>
	<fieldset style="border: 1px solid #CCC; padding: 50px;">
		<div class="row">
			<spring:message code="label.registro.contador.parrafo.uno.terminos.condiciones" htmlEscape="false" argumentSeparator=";"
				arguments="${ndtContadorPublicoAutDTO.usuarioSesion.nombreCompleto};${ndtContadorPublicoAutDTO.personaFiscal.rfc};" />
			<br/><br/>
			<spring:message code="label.registro.contador.parrafo.dos.terminos.condiciones"/>
			<br/><br/>
			<spring:message code="label.registro.contador.parrafo.tres.terminos.condiciones"/>
			<br/><br/>
			<spring:message code="label.registro.contador.parrafo.cuatro.terminos.condiciones"/>
			<br/><br/>
			<spring:message code="label.registro.contador.parrafo.cinco.terminos.condiciones"/>
		</div>
	</fieldset>
</form:form>