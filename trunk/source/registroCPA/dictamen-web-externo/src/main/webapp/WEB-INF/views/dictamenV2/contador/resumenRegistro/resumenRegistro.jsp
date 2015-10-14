<%@ include file="../../../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/infoResumen/resumenRegistro.js" htmlEscape="true" />"></script>

<form:form id="idFrmResumenRegistro" action="<%=request.getContextPath()%>/dictamenV2/contador/actualizacion/init.do" method="post"></form:form>
<div class="row">
	<h3><spring:message code="label.registro.contador.subtitulo.paso.resumen.tramite"/></h3>
</div>
<div class="row">
	<div class="alert alert-success">
		<strong><spring:message code="alerta.registro.contador.resumen.tramite"/></strong>
	</div>
</div>
<div class="row">
	<p><spring:message code="parrafo.registro.contador.descripcion.resumen.tramite"/></p>
</div>
<div class="row">
	<div>
		<table id="idTblResumenTramite" class="table table-bordered">
			<thead>
		       	<tr>
		         	<th><spring:message code="tabla.uno.header.uno"/></th>
		         	<th><spring:message code="tabla.uno.header.dos"/></th>
		         	<th><spring:message code="tabla.uno.header.tres"/></th>
		         	<th><spring:message code="tabla.uno.header.cuatro"/></th>
		         	<th><spring:message code="tabla.uno.header.cinco"/></th>
		    	</tr>
			</thead>
			<tbody>
		   		<tr>
		         	<td><label style="text-align: left;" class="control-label" id="idTxtFolioTramiteResumen"></label></td>
		         	<td><label style="text-align: left;" class="control-label" id="idTxtFecRegistroContadorResumen"></label></td>
		         	<td><label style="text-align: left;" class="control-label" id="idTxtRfcContadorResumen"></label></td>
		         	<td><label style="text-align: left;" class="control-label" id="idTxtRazSocialDespachoResumen"></label></td>
		         	<td><label style="text-align: left;" class="control-label" id="idTxtNomContadorResumen"></label></td>
		    	</tr>
			</tbody>
		</table>
	</div>
</div>
<div class="row text-right">
	<span><spring:message code="link.descarga.comprobante"/></span>
	<span class="glyphicon glyphicon-download-alt" onclick="visualizarAcuse()"></span>
</div>
<div class="row">
	<h3 style="color: #4A90E2;">
		<spring:message code="label.registro.contador.subtitulo.siguiente.pasos.resumen.tramite"/>
	</h3>
</div>
<div class="row">
	<div class="col-md-6 row">
		<p>
			<spring:message code="parrafo.registro.contador.descripcion.dos.resumen.tramite"/>
		</p>
  	</div>
  	<div class="col-md-offset-1 col-md-5 row">
	   	<fieldset style="background-color:#d9edf7; border: 1px solid #CCC; padding: 10px; ">
	      	<h4 style="color: #4A90E2;">
	      		<spring:message code="label.servicios.relacionados"/>
	      	</h4>
	      	<br>
	      	<ul>
	        	<li>
	        		<button type="button" id="idLinkActualizacionContador" class="btn btn-link">
	        			<spring:message code="label.menu.servicios.menu.actualizacion.contador"/>
	        		</button>
	        	</li>
	        	<br>
	        	<li>
	        		<button type="button" id="idLinkAcreditacionMembresia" class="btn btn-link">
	        			<spring:message code="label.menu.servicios.menu.acreditacion.membresia"/>
	        		</button>
	        	</li>
	        	<br>
		        <li>
		        	<button type="button" id="idLinkBajaContador" class="btn btn-link">
		        		<spring:message code="label.menu.servicios.menu.baja.contador"/>
		        	</button>
		        </li>
		        <br>
			</ul>
		</fieldset>
	</div>
</div>