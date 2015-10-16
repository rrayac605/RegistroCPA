<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="row empty-state">
	<div class="row">
		<!-- Imagen -->
		<div class="col-xs-12 imagen">
			<i class="icon-file-text icon-5x"></i>
		</div>
	</div>
	<div class="row">
		<!-- Titulo -->
		<div class="col-xs-12 titulo">
					<spring:message
						code="label.wizard.solicitud.pasos.titulo" />
		</div>
	</div>
	<br>
	</br>

	<!-- Opciones -->
	<div class="row opciones">
		<!-- Opcion -->
		<div class="col-xs-6">

			<div class=" opcion">
				<div class="">
				</div>
				<div class="">
					<p class="paso">
						<spring:message code="label.wizard.solicitud.iniciar.titulo" />
					</p>
					<p class="descripcion">
						<spring:message code="label.wizard.solicitud.iniciar.descripcion" />
					</p>
				</div>
			</div>
		</div>
		<!-- Opcion -->
		<div class="col-xs-6 ">

			<div class=" opcion">

				<div class="">
				</div>
				<div class="">
					<p class="paso">
						<spring:message code="label.wizard.solicitud.capturar.titulo" />
					</p>
					<p class="descripcion">
						<spring:message
							code="label.wizard.solicitud.capturar.descripcion" />
					</p>
				</div>

			</div>
		</div>
	</div>
		
	<div class="row opciones">
		<!-- Opcion -->
		<div class="col-xs-6 ">

			<div class="opcion">

				<div class="">
				</div>
				<div class="">
					<p class="paso">
						<spring:message code="label.wizard.solicitud.cuestionario.titulo" />
					</p>
					<p class="descripcion">
						<spring:message
							code="label.wizard.solicitud.cuestionario.descripcion" />
					</p>
				</div>

			</div>
		</div>
		<!-- Opcion -->
		<div class="col-xs-6 ">

			<div class="opcion">

				<div class="">
				</div>
				<div class="">
					<p class="paso">
						<spring:message code="label.wizard.solicitud.finalizar.titulo" />
					</p>
					<p class="descripcion">
						<spring:message
							code="label.wizard.solicitud.finalizar.descripcion" />
					</p>
				</div>

			</div>
		</div>
	</div>

</div>