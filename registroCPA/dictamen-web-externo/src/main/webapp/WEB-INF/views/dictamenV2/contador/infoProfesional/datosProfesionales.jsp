<%@ include file="../../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoProfesional/datosProfesionales.js" htmlEscape="true" />"></script>

<div class="row">
	<h5><spring:message code="label.registro.contador.subtitulo.paso.datos.colegio"/></h5>
</div>
<br/>
<form:form id="idFrmDatosProfesionales" class="form-horizontal" role="form">
	<input type="hidden" id="idHdnCveIdR3ColegioXcontador" name="hdnCveIdR3ColegioXcontador" 
		value="${ndtContadorPublicoAutDTO.listNdtR3Colegios[0].cveIdR3ColegioXcontador}"/>
	<input type="hidden" id="idHdnCveMoralColegio" name="hdnCveMoralColegio" 
		value="${ndtContadorPublicoAutDTO.ndtColegioDTO.cveIdPersonaMoral}"/>
	<input type="hidden" id="idHdnCveIdColegio" name="hdnCveIdColegio" 
		value="${ndtContadorPublicoAutDTO.ndtDespachosDTO.cveIdDespacho}"/>
	<div class="form-group">
		<label style="text-align:left;" class="col-md-5 control-label" for="idTxtRfcColegio">
			<span class="required">*</span><spring:message code="label.registro.contador.rfc.colegio"/>
		</label>
	</div>
	<div class="form-group">
		<div class="col-md-6">
			<input type="text" id="idTxtRfcColegio" name="txtRfcColegio" class="form-control" placeholder="RFC"
				value="${ndtContadorPublicoAutDTO.ndtColegioDTO.rfc}">
		</div>
    	<button type="button" id="idBtnBuscarColegio" class="btn btn-primary"><spring:message code="boton.buscar"/></button>
	</div>
 	<div class="form-group">
		<label style="text-align: left;" class="col-md-6 control-label" for="idTxtNomColegio">
			<spring:message code="label.registro.contador.denominacion.razon.colegio"/>
		</label>
	</div>
	<div class="form-group">
		<div class="col-md-8">
			<input type="text" id="idTxtNomColegio" name="txtNomColegio" readonly="readonly" class="form-control" placeholder="Colegio" 
				value="${ndtContadorPublicoAutDTO.ndtColegioDTO.razonSocial}">
		</div>
	</div>
</form:form>