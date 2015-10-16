<%@ include file="../../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoDespacho/datosDespacho.js" htmlEscape="true" />"></script>

<form:form id="idFrmDatosDespacho" class="form-horizontal" role="form">
	<input type="hidden" id="idHdnTpoDespacho" name="hdnTpoDespacho" class="form-control" readonly="readonly" 
		value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].indTipoCpa}"/>
	<input type="hidden" id="idHdnCargoContador" name="hdnCargoContador" class="form-control" readonly="readonly"
		value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cargoQueDesempena}"/>
	<input type="hidden" id="idHdnCveIdR2Despacho" name="hdnCveIdR2Despacho" class="form-control" readonly="readonly"
		value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cveIdR2Despacho}"/>
	<input type="hidden" id="idHdnCveMoralDespacho" name="hdnCveMoralDespacho" 
		value="${ndtContadorPublicoAutDTO.ndtDespachosDTO.cveIdPersonaMoral}"/>
	<input type="hidden" id="idHdnCveIdPmdomFiscalDespacho" name="hdnCveIdPmdomFiscalDespacho" 
		value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cveIdPmdomFiscal}"/>
	<input type="hidden" id="idHdnCveIdDomicilioDespacho" name="hdnCveIdDomicilioDespacho" 
		value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].cveIdDomicilio}"/>
	<input type="hidden" id="idHdnCveIdDespacho" name="hdnCveIdDespacho" 
		value="${ndtContadorPublicoAutDTO.ndtDespachosDTO.cveIdDespacho}"/>
	
 	<div class="row">
  		<h5><spring:message code="label.registro.contador.subtitulo.paso.datos.despacho"/></h5>
	</div>
	<br/>
	<div class="form-group">
  		<label style="text-align: left;" class="col-md-4 control-label" for="profesionista">
  			<span class="required">*</span><spring:message code="label.registro.contador.perteneces.despacho"/>
  		</label>
	    <div class="col-sm-8">
	    	<select id="idSltTpoDespacho" name="sltTpoDespacho" class="form-control">
				<option value="default"><spring:message code="label.comun.seleccion.opcion"/></option>
				<option value="1">Despacho</option>
				<option value="2">Independiente</option>
			</select>
	    </div>
 	</div>
 	<div class="form-group">
       	<label style="text-align: left;" class="col-md-4 control-label">
       		<spring:message code="label.registro.contador.pregunta.tienes.trabajadores"/>
       	</label>
	    <div class="checkbox col-sm-1">
	       	<label>
	          	<input disabled="disabled" type="checkbox" id="idChkTieneTrabajadores" name="chkTieneTrabajadores"><spring:message code="label.comun.si"/>
	        </label>
	    </div>
	    <div class="checkbox col-sm-1">
	    	<label>
		       	<input disabled="disabled" type="checkbox" id="idChkNoTieneTrabajadores" name="chkNoTieneTrabajadores"><spring:message code="label.comun.no"/>
		    </label>
	    </div>
	    <label style="text-align: left;" class="col-sm-3 control-label" for="idTxtNumTrabajadores">
	    	<spring:message code="label.registro.contador.indicar.numero.trabajadores"/>
	    </label>
		<div class="col-sm-3">
			<input type="text" id="idTxtNumTrabajadores" name="txtNumTrabajadores" maxlength="5" class="form-control" placeholder="No." 
				value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].numTrabajadoresContratados}">
		</div>
  	</div>
  	<input type="hidden" id="idHdnValidaCheckbox" name="hdnValidaCheckbox" />
	<div class="form-group">
		<label style="text-align: left;" class="col-md-6 control-label">
			<span class="required">*</span><spring:message code="label.registro.contador.cargo.desempeña"/>
		</label>
		<label style="text-align: left;" class="col-md-6 control-label" for="idTxtTelFijoDespacho">
			<span class="required">*</span><spring:message code="label.registro.contador.telefono.oficina"/>
		</label>
	</div>
	<div class="form-group">
		<div class="col-md-6">
			
			<select id="idSltCargoDesemp" name="sltCargoDesemp" class="form-control">
				<option value="default"><spring:message code="label.comun.seleccion.opcion"/></option>
				<option value="Director">Director</option>
				<option value="Socio">Socio</option>
				<option value="Gerente">Gerente</option>
				<option value="Auditor">Auditor</option>
			</select>
		</div>
    	<div class="col-sm-6">
    		<input type="text" id="idTxtTelOficinaDespacho" name="txtTelOficinaDespacho" maxlength="13" class="form-control" placeholder="Tel&eacute;fono"
    			value="${ndtContadorPublicoAutDTO.listNdtR2Despachos[0].telefonoFijo}">
    	</div>
	</div>
	<div class="form-group">
		<label style="text-align:left;" class="col-md-6 control-label" for="idTxtRfcDespacho">
			<span class="required">*</span><spring:message code="label.registro.contador.rfc"/>
		</label>
	</div>
	<div class="form-group">
		<div class="col-md-6">
			<input type="text" id="idTxtRfcDespacho" name="txtRfcDespacho" maxlength="13" class="form-control" placeholder="RFC" 
				value="${ndtContadorPublicoAutDTO.ndtDespachosDTO.rfc}">
		</div>
    	<button type="button" id="idBtnBuscarDespacho" class="btn btn-primary"><spring:message code="boton.buscar"/></button>
	</div>
	<div class="form-group">
		<label style="text-align: left;" class="col-md-6 control-label" for="idTxtRazonSocialDespacho">
			<spring:message code="label.registro.contador.razon.social"/>
		</label>
	</div>
	<div class="form-group">
		<div class="col-md-8">
			<input type="text" id="idTxtRazonSocialDespacho" name="txtRazonSocialDespacho" readonly="readonly" class="form-control" 
				placeholder="Raz&oacute;n Social" value="${ndtContadorPublicoAutDTO.ndtDespachosDTO.razonSocial}">
		</div>
	</div>
</form:form>
<br/>