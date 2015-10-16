<%@ include file="../general/taglibs.jsp"%>

<script src="${staticResourcesPath}/js/widget/widget.js"></script>
<script src="${staticResourcesPath}/js/portlet/portlet.js"></script>

<script type="text/javascript" src="<spring:url value="/static/resources/js/delta/home.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="/gestionSolicitud-web/static/resources/js/delta/firma-digital/FirmaDigital.js"></script>
<script type="text/javascript" src="/gestionIndividuo-consulta-web/static/resources/js/wizard/fisica/modificacion/medios/particulares/modificacionMediosParticularesWizard.js"></script>
<script type="text/javascript" src="/wizard-web/static/resources/js/delta/wizard/ProcesandoSolicitudCmp.js"></script>

<div id="homecontenido" class="container">
	<input type="hidden" id="idHdnIdPersona" value="${usuario.idPersona}" />
	<div class="row">
		<div class="contenedor-widget col-xs-4">
			<div class="widget"
				widget-url="/dictamen-web-externo/widget/dictamen/initWidgetDictamen/${usuario.idPersona}.do"></div>
		</div>
		<div class="contenedor-portlet col-xs-8">

			<div class="portlets">
				<div class="portlet"
					portlet-url="/dictamen-web-externo/portlet/dictamen/initPortletDictamen/${usuario.idPersona}.do"></div>
			</div>
		</div>
	</div>
</div>

<div id="wizardDictamenElectronico"></div>
<div id="firmaDigitalComponent"></div>
<div id="wizardDatosActualizacion"></div>
<div id="procesandoSolicitudComponent"></div>

<div id="visorTramitesDictamen" >
 	<form action="/firmaElectronicaWeb/rest/imss/buscarSeguimiento" class = "formNotBlock" method="post" target="firmaIframe" id="formaAcuse">
    	<input type="hidden" name="params" id="idTramite"/>
	</form>
	<form action="/firmaElectronicaWeb/rest/imss/buscarArchivos" class = "formNotBlock" method="post" target="firmaIframe" id="formaAdjuntos">
		<input type="hidden" name="params" id="idTramite"/>
	</form>
	
	<iframe id="firmaIframe" name="firmaIframe" height="500" width="850" style="display: none;"></iframe>
</div>