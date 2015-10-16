<%@ include file="../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/dialogoMensaje.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/login/loginSession.js" htmlEscape="true" />"></script>

<div class="row">
	<h2>Contador Público Autorizado</h2>
	<hr class="red">
</div>
<div class="row">
	<h3>Paso 1: Iniciar</h3>
</div>
<div class="row">
	<h3>Tener a la mano:</h3>
</div>
<div class="row">
	<ul>
  		<li>CURP</li>
  		<li>RFC</li>
	</ul>
</div>
<div class="row">
	<h3>Favor de ingresar los siguientes datos:</h3>
</div>

<form:form id="idFrmLoginSession" action="${pageContext.request.contextPath}/login/dictamenV2/loginSession.do" method="post">
	<fieldset style="border: 1px solid #CCC; padding: 50px;">
		<div class="form-group">
			<label style="text-align: left;" class="col-md-4 col-md-offset-1 control-label" for="idTxtCurpLogin"> 
				CURP<span class="required">*</span>:
			</label>
			<div class="col-md-6">
				<input type="text" maxlength="18" class="form-control" name="txtCurpLogin" id="idTxtCurpLogin">
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-4 col-md-offset-1 control-label"> </label>
			<div class="col-md-6">
				¿No te sabes tu CURP? <a target="_blank" href="https://consultas.curp.gob.mx/CurpSP/">Consúltala aquí.</a>
			</div>
		</div>
		<div class="form-group">
			<label style="text-align: left;" class="col-md-4 col-md-offset-1 control-label" for="idTxtRfcLogin">
				RFC<span class="required">*</span>:
			</label>
			<div class="col-md-6">
				<input type="text" id="idTxtRfcLogin" name="txtRfcLogin" maxlength="13" placeholder="Ingresa tu RFC" class="form-control">
			</div>
		</div>
		<br/>
		<div class="row">
			<div style="text-align: left" class="col-md-10 col-md-offset-1 col-sm-12 col-xs-12">
				Los campos marcados con <strong><span class="required">*</span></strong> son obligatorios.
			</div>
		</div>
	</fieldset>
	<br>
	<!-- Controles -->
	<div class="row">
		<div class="col-sm-12 text-right">
			<button type="button" id="idLnkAvisoPrivacidadLogin" class="btn btn-link">Aviso de privacidad</button>
			<button type="button" id="idBtnContinuarLogin" class="btn btn-primary">Continuar</button>
		</div>
	</div>
</form:form>