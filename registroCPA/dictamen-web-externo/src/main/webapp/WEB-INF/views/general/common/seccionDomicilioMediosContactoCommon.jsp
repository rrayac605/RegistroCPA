<%@ include file="../../general/taglibs.jsp"%>

<c:set var="contextPath" value="<%=request.getContextPath()%>" />

<!-- VARIABLES DE VALIDACION DE DOMICILIO Y MEDIOS DE CONTACTO -->
<input type="hidden" id="hdnIdTipoValidacionMedios" value="${idTipoValidacionMedios}"/>
<input type="hidden" id="hdnIdTipoValidacionDomicilio" value="${idTipoValidacionDomicilio}"/>
			
<!-- VALIDACIONES DE DOMICILIO Y MEDIOS DE CONTACTO -->
<div class="alertValidationMessage" validation-url="/gestionMediosContacto-web//medios/contacto/validarMediosContactoExistente/${idTipoValidacionMedios}/${idPersona}" ></div>
<div class="alertValidationMessage" validation-url="/gestionDomicilios-web/domicilio/nacional/ubicar/validarDomicilioExistente/${idTipoValidacionDomicilio}/${idPersona}" ></div>
	
<!-- SECCIONES DE DOMICILIO Y MEDIOS DE CONTACTO (PAGINAS A CARGAR EN CASO DE EXITO) -->
<div id="divSeccionMediosContactoCommon"></div>
<div id="divSeccionDomiciliosCommon"></div>