<%@ include file="../../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoBajaVoluntaria/datosBajaVoluntaria.js" htmlEscape="true" />"></script>

<div class="row">
	<h5><span class="required">*</span><spring:message code="label.baja.voluntaria.separador.seccion.motivo"/></h5>
</div>
<br/>
<form:form id="idFrmDatosBajaVoluntaria" class="form-horizontal" role="form">
	<div class="form-group">
    	<textarea id="idTxtAreaMotivoBajaVoluntaria" name="txtAreaMotivoBajaVoluntaria" class="form-control" placeholder="Motivo de la baja" maxlength="1000"></textarea>
  	</div>
</form:form>