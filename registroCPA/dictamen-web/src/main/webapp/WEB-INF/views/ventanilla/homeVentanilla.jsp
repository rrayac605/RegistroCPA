<%@ include file="../general/taglibs.jsp"%>

<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenVentanilla/initVentanilla.js" htmlEscape="true" />"></script>

<div class="instrucciones col-sm-8" style="min-height: 400px;">
	<p>
	<spring:message code="label.ventanilla.home.texto"/></p>
	</br>
	<div class="well" style="background-color: white;">
		<div id="idDivMenuRegistro">
			<ol id="idOlMenuContador">
				<li class="ui-widget-content" id="1"
					title="Autorizaciones/Rechazos">
					<spring:message code="label.ventanilla.home.autorizacion"/>
				</li>
				<li class="ui-widget-content" id="2"
					title="Bajas"><spring:message code="label.ventanilla.home.bajas"/>
				</li>
				<li class="ui-widget-content" id="3"
					title="Actualizaci&oacute;n de Estatus">
					<spring:message code="label.ventanilla.home.actualizacion.estado"/>
				</li>
				<li class="ui-widget-content" id="4"
					title="Consulta de Dict&aacute;menes">
					<spring:message code="label.ventanilla.home.consulta.dictamenes"/>
				</li>
				<li class="ui-widget-content" id="5"
					title="Consulta de Cat&aacute;logos">
					<spring:message code="label.ventanilla.home.consulta.catalogos"/>
				</li>
				<li class="ui-widget-content" id="6"
					title="Reportes">
					<spring:message code="label.ventanilla.home.reportes"/>
				</li>
			</ol>
		</div>
	</div>
</div>

		<form id="idFrmMenuRegistro" action="<%=request.getContextPath()%>/contadorPublico/index.do" method="post">
			<input type="hidden" id="seleccionFiltro" name="seleccionFiltro"  />
		</form>

<div id="dialog-confirm-common" title="Mensaje del Sistema"	class="ui-dialog-content"	style="width: auto; min-height: 18.2px; height: auto;">
</div>