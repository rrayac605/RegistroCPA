<!-- JSP Inicial del Widget de Persona Fisica. -->
<%@ include file="../../general/taglibs.jsp"%>

<script type="text/javascript"
	src="<spring:url value="/static/resources/js/delta/portlet/dictamen/portletDictamen.js" htmlEscape="true" />"></script>

<div class="contenedor" id="portletDictamen"
	portlet-url="/dictamen-web-externo/portlet/dictamen/detallePortletDictamen/${idPersona}.do"
	portlet-name="portletDictamen" portlet-id-principal="${idPersona}"
	portlet-id-tercero="${idPersona}">

	<div class="encabezado"></div>
	<div class="cuerpo">

		<div class="titulo">
			<span class="title"> <spring:message
					code="label.portlet.titulo.dictamen" />
			</span>

			<div class="controles">
				<a class="widget-tool widget-refresh" style="display: none;"><i
					class="icono-refrescar"></i></a> <a
					class="widget-tool widget-move handle"><i class="icono-mover"></i></a>
				<a class="widget-tool widget-resize"> <i class="icono-abrir"></i>
				</a>
			</div>
		</div>

		<div class="descripcion" style="display: none;">
			<p>
				<spring:message code="label.portlet.descripcion.dictamen" />
			</p>
		</div>

		<div class="contenido" style="display: none;" already-loaded="false">
			<div style="text-align: center; vertical-align: middle;">
				<img alt="" src="${staticResourcesPath}/imagenes/loading.gif" />
			</div>
		</div>
	</div>

	<div class="estado"></div>

	<div class="pie">
		<div class="opciones">
			<div class="btn-group">
				<a class="btn btn-sm btn-primary" id="accionesDictamen" href="#"> <spring:message
						code="label.menus.acciones" />
				</a> <a class="btn btn-sm btn-primary dropdown-toggle" data-toggle="dropdown"
					href="#"><span class="caret"></span></a>
				<ul id="opcionesPortletDictamen" class="dropdown-menu pull-right">
					<li class="removable"><a id="abrirWizardDictamenPortlet">Contadores P&uacute;blicos
					</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>