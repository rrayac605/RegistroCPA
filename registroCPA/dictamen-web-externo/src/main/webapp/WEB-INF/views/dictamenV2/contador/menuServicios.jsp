<%@ include file="../../general/taglibs.jsp"%>

<link type="text/css" href="<spring:url value="/static/resources/css/comunes/comunes.css"/>" rel="stylesheet" />

<script type="text/javascript" src="<spring:url value="/static/resources/js/comunes/dialogoMensaje.js" htmlEscape="true" />"></script>
<script type="text/javascript" src="<spring:url value="/static/resources/js/dictamenV2/contador/menuServicios.js" htmlEscape="true" />"></script>

<div class="row">
	<h2><spring:message code="label.menu.servicios.titulo"/></h2>
	<hr class="red">
</div>
<div class="row">
	<h4><spring:message code="label.menu.servicios.subtitulo"/></h4>
</div>
<div class="row">
	<p><spring:message code="parrafo.menu.servicios.descripcion.seccion"/></p>
</div>
</br>
<div class="row">
	<fieldset style="border: 1px solid #CCC; padding: 50px; background-color: #f7f7f9;">
		<div class="row">
			<div class="col-md-4 text-center">
				<img id="idImgRegistroContador" src="<spring:url value="/static/resources/imagenes/icono_indice_gris.jpg" htmlEscape="true" />" 
					style="opacity: 0.2;" class="cursor" title="Registro Contador"/>
			</div>
			<div class="col-md-4 text-center">
				<img id="idImgReactivacionContador" src="<spring:url value="/static/resources/imagenes/icono_indice_gris.jpg" htmlEscape="true" />" 
					style="opacity: 0.2;" class="cursor" title="Reactivaci&oacute;n Contador"/>
			</div>
			<div class="col-md-4 text-center">
				<img id="idImgActualizacionContador" src="<spring:url value="/static/resources/imagenes/icono_indice_gris.jpg" htmlEscape="true" />" 
					style="opacity: 0.2;" class="cursor" title="Actualizaci&oacute;n de datos"/>
			</div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-4 text-center">
				<a id="idHrefRegistroContador" style="text-decoration: none; color: #000000; font-size: 17px; font-weight: bold;">
					<spring:message code="label.menu.servicios.menu.registro.contador"/>
				</a>
			</div>
			<div class="col-md-4 text-center">
				<a id="idHrefReactivacionContador" style="text-decoration: none; color: #000000; font-size: 17px; font-weight: bold; opacity: 0.2;">
					<spring:message code="label.menu.servicios.menu.reactivacion.contador"/>
				</a>
			</div>
			<div class="col-md-4 text-center">
				<a id="idHrefActualizacionContador" style="text-decoration: none; color: #000000; font-size: 17px; font-weight: bold; opacity: 0.2;">
					<spring:message code="label.menu.servicios.menu.actualizacion.contador"/>
				</a>
			</div>
		</div>
		</br></br>
		<div class="row">
			<div class="col-md-4 text-center">
				<img id="idImgBajaContador" src="<spring:url value="/static/resources/imagenes/icono_indice_gris.jpg" htmlEscape="true" />" 
					style="opacity: 0.2;" class="cursor" title="Solicitud de baja"/>
			</div>
			<div class="col-md-4 text-center">
				<img id="idImgAcreditacionMembresia" src="<spring:url value="/static/resources/imagenes/icono_indice_gris.jpg" htmlEscape="true" />" 
					style="opacity: 0.2;" class="cursor" title="Acreditaci&oacute;n y membres&iacute;a"/>
			</div>
		</div>
		</br>
		<div class="row">
			<div class="col-md-4 text-center">
				<a id="idHrefBajaContador" style="text-decoration: none; color: #000000; font-size: 17px; font-weight: bold; opacity: 0.2;">
					<spring:message code="label.menu.servicios.menu.baja.contador"/>
				</a>
			</div>
			<div class="col-md-4 text-center">
				<a id="idHrefAcreditacionMembresia" style="text-decoration: none; color: #000000; font-size: 17px; font-weight: bold; opacity: 0.2;">
					<spring:message code="label.menu.servicios.menu.acreditacion.membresia"/>
				</a>
			</div>
		</div>
	</fieldset>
</div>
</br>
<form:form id="idFrmMenuServicios" action="<%=request.getContextPath()%>/dictamenV2/contador/registro/init.do" method="post"></form:form>