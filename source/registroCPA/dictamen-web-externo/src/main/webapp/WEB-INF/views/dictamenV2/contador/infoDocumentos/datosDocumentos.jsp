<%@ include file="../../../general/taglibs.jsp"%>

<link type="text/css" href="<spring:url value="/static/resources/css/comunes/comunes.css"/>" rel="stylesheet" />

<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/jquery-fileupload/jquery.ui.widget.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/jquery-fileupload/jquery.iframe-transport.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/jquery-fileupload/jquery.fileupload.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoDocumentos/formFileUpload.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoDocumentos/datosDocumentos.js" htmlEscape="true" />"></script>

<div class="row">
	<h3><spring:message code="label.registro.contador.subtitulo.paso.adjuntar.documentos"/></h3>
</div>
<div class="row">
	<p><spring:message code="parrafo.registro.contador.descripcion.adjuntar.documentos"/></p>
</div>
<br/>
<form:form id="idFrmDatosDocumentos" class="form-horizontal" role="form">
	<div id="idDivDocumentosAdjuntos"></div>
</form:form>
<br/>
<table ><td width=""></table>