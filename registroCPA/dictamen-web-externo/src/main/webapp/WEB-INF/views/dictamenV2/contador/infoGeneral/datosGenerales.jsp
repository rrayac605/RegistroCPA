<%@ include file="../../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoGeneral/datosGenerales.js" htmlEscape="true" />"></script>

<div class="row">
	<h5><spring:message code="label.registro.contador.subtitulo.paso.datos.generales"/></h5>
</div>
<div class="row" id="idDivDescripcionDatosGenerales">
	<p><spring:message code="parrafo.registro.contador.descripcion.datos.generales"/></p>
</div>
<br/>
<form:form id="idFrmDatosGenerales" class="form-horizontal" role="form">
	<input type="hidden" id="idHdnIdPersona" name="hdnIdPersona" 
		value="${ndtContadorPublicoAutDTO.usuarioSesion.idPersona}">
	<!-- Domicilio SAT -->
	<input type="hidden" id="idHdnCveIdDomicilio" name="hdnCveIdDomicilio" 
		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.clave}">
	<!-- Domicilio PERSONA FISICA FISCAL -->
	<input type="hidden" id="idHdnCveIdPfdomFiscal" name="hdnCveIdPfdomFiscal" 
		value="${ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cveIdPfdomFiscal}">
	<input type="hidden" id="idHdnCveIdR1DatosPersonales" name="hdnCveIdR1DatosPersonales" 
		value="${ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cveIdR1DatosPersonales}">
	<input type="hidden" id="idHdnCveIdPersonafContacto1" name="hdnCveIdPersonafContacto1" 
		value="${ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].listNdtR1Formacontactos[0].cveIdPersonafContacto}">
	<input type="hidden" id="idHdnCveIdPersonafContacto2" name="hdnCveIdPersonafContacto2" 
		value="${ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].listNdtR1Formacontactos[1].cveIdPersonafContacto}">
	<div class="form-group">
  		<label style="text-align: left;" class="col-md-1 control-label" for="idTxtNomContador">
  			<spring:message code="label.registro.contador.nombre.contador"/>
  		</label>
	   	<div class="col-sm-6">
	    	<input type="text" id="idTxtNomContador" class="form-control" disabled="disabled"
	    		value="${ndtContadorPublicoAutDTO.usuarioSesion.nombreCompleto}">
	    </div>
	    <label style="text-align: left;" class="col-md-1 control-label" for="idTxtRfcContador">
  			<spring:message code="label.registro.contador.rfc.contador"/>
  		</label>
	   	<div class="col-sm-4">
	    	<input type="text" id="idTxtRfcContador" class="form-control" disabled="disabled"
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.rfc}">
	    </div>
 	</div>
 	<div class="row">
	 	<h5><spring:message code="label.separador.seccion.domicilioFiscal"/></h5>
	</div>
	<br/>
	<div class="form-group">
  		<label style="text-align: left;" class="col-md-1 control-label" for="idTxtCalleContador">
  			<spring:message code="label.domicilio.calle"/>
  		</label>
	   	<div class="col-sm-5">
	    	<input type="text" id="idTxtCalleContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.calle}">
	    </div>
	    <label style="text-align: left;" class="col-md-1 control-label" for="idTxtNumExtContador">
  			<spring:message code="label.domicilio.numExterior"/>
  		</label>
	   	<div class="col-sm-2">
	    	<input type="text" id="idTxtNumExtContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.numExterior1}">
	    </div>
	    <label style="text-align: left;" class="col-md-1 control-label" for="idTxtNumIntContador">
  			<spring:message code="label.domicilio.numInterior"/>
  		</label>
	   	<div class="col-sm-2">
	    	<input type="text" id="idTxtNumIntContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.numExteriorAlf}">
	    </div>
 	</div>
 	<div class="form-group">
  		<label style="text-align: left;" class="col-md-1 control-label" for="idTxtContadorRefPrimaria">
  			<spring:message code="label.domicilio.refPrimaria"/>
  		</label>
	   	<div class="col-sm-5">
	    	<input type="text" id="idTxtRefPrimariaContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.vialidadReferenciaPrimaria.nombre}">
	    </div>
	    <label style="text-align: left;" class="col-md-1 control-label" for="idTxtContadorRefSecundaria">
  			<spring:message code="label.domicilio.refSecundaria"/>
  		</label>
	   	<div class="col-sm-5">
	    	<input type="text" id="idTxtRefSecundariaContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.vialidadReferenciaSecundaria.nombre}">
	    </div>
 	</div>
	<div class="form-group">
  		<label style="text-align: left;" class="col-md-1 control-label" for="idTxtLocalidadContador">
  			<spring:message code="label.domicilio.estado"/>
  		</label>
	   	<div class="col-sm-3">
	    	<input type="text" id="idTxtLocalidadContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.asentamiento.localidad.municipio.entidadFederativa.nombre}">
	    </div>
	    <label style="text-align: left; width: 9.9%" class="col-md-1 control-label" for="idTxtContadorMunicipio">
  			<spring:message code="label.domicilio.municipio"/>
  		</label>
	   	<div class="col-sm-3">
	    	<input type="text" id="idTxtMunicipioContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.asentamiento.localidad.municipio.nombre}">
	    </div>
	    <label style="text-align: left; width: 6.7%" class="col-md-1 control-label" for="idTxtContadorAsentamiento">
  			<spring:message code="label.domicilio.asentamiento"/>
  		</label>
	   	<div class="col-sm-3">
	    	<input type="text" id="idTxtAsentamientoContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.asentamiento.nombre}">
	    </div>
 	</div>
 	<div class="form-group">
  		<label style="text-align: left;" class="col-md-1 control-label" for="idTxtCodPostalContador">
  			<spring:message code="label.domicilio.codPostal"/>
  		</label>
	   	<div class="col-sm-2">
	    	<input type="text" id="idTxtCodPostalContador" class="form-control" disabled="disabled" 
	    		value="${ndtContadorPublicoAutDTO.personaFiscal.domicilioFiscal.codigoPostal.codigoPostal}">
	    </div>
 	</div>
	<br/>
	<div class="row">
	 	<h5><spring:message code="label.registro.contador.subtitulo.medios.contacto"/></h5>
	</div>
	<br/>
	<div class="form-group">
  		<label style="text-align: left;" class="col-md-3 control-label" for="idTxtEmailContador">
  			<span class="required">*</span><spring:message code="label.registro.contador.correo.electronico"/>
  		</label>
	   	<div class="col-sm-7">
	    	<input type="text" id="idTxtEmailContador" name="txtEmailContador" class="form-control" placeholder="Correo electr&oacute;nico"
	    		value="${medioContactoEmail}">
	    </div>
 	</div>
	<div class="form-group">
  		<label id="idLblConfirEmailContador" style="text-align: left;" class="col-md-3 control-label" for="idTxtConfirEmailContador">
  			<span class="required">*</span><spring:message code="label.registro.contador.confirmacion.correo.electronico"/>
  		</label>
	    <div class="col-sm-7">
	    	<input type="text" id="idTxtConfirEmailContador" name="txtConfirEmailContador" onpaste="return false" 
	    		class="form-control" placeholder="Correo electr&oacute;nico">
	    </div>
 	</div>
 	<div class="form-group">
  		<label style="text-align: left;" class="col-md-3 control-label" for="idTxtTelFijoContador">
  			<span class="required">*</span><spring:message code="label.registro.contador.telefono.fijo"/>
  		</label>
	    <div class="col-sm-7">
	    	<input type="text" id="idTxtTelFijoContador" name="txtTelFijoContador" maxlength="13" class="form-control" placeholder="Tel&eacute;fono"
		    	value="${medioContactoTelFijo}">
	    </div>
 	</div>
 	<br/>
 	<div class="row">
	 	<h5><spring:message code="label.registro.contador.subtitulo.datos.profesionales"/></h5>
	</div>
	<br/>
 	<div class="form-group">
  		<label style="text-align: left;" class="col-md-3 control-label" for="idTxtNomInstituto">
  			<span class="required">*</span><spring:message code="label.registro.contador.escuela"/>
  		</label>
	   	<div class="col-sm-7">
	    	<input type="text" id="idTxtNomInstituto" name="txtNomInstituto" class="form-control" placeholder="Escuela o Instituci&oacute;n"
	    		value="${ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].desTituloExpedidoPor}">
	    </div>
 	</div>
	<div class="form-group">
  		<label style="text-align: left;" class="col-md-3 control-label" for="idTxtNumCedula">
  			<span class="required">*</span><spring:message code="label.registro.contador.numero.cedula"/>
  		</label>
	    <div class="col-sm-7">
	    	<input type="text" id="idTxtNumCedula" name="txtNumCedula" maxlength="13" class="form-control" placeholder="N&uacute;mero de C&eacute;dula"
	    		value="${ndtContadorPublicoAutDTO.listNdtR1DatosPersonales[0].cedulaProfesional}">
	    </div>
 	</div>
</form:form>
<br/>