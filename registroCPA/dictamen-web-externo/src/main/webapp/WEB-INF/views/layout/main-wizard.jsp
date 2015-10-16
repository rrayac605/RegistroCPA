<%@ include file="../general/taglibs.jsp"%>
<!-- Main Wizard page template -->

<c:set var="contextpath" value="<%=request.getContextPath()%>" />

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="max-age=100, must-revalidate" />
<meta name="description"
	content="Instituto Mexicano del Seguro Social Portal DELTA" />
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<!-- GOBMX -->
<meta name="viewport" content="width=device-width, initial-scale=1">

<title><tiles:insertAttribute name="title" ignore="true" /></title>

<jsp:include page="staticResources.jsp"></jsp:include>

<script>
	var context_path = '<%=request.getContextPath()%>';

	$(function() {
		alertValidationMessage.init();

		$('form:not(.formNotBlock)').submit(function() {
			$.blockUI();
		});
	});
</script>
</head>

<!-- <body> -->
<!-- 	<div class="container-fluid"> -->
<!-- 		<div class="wizard"> -->
<%-- 			<tiles:insertAttribute name="contenido" /> --%>
<!-- 		</div> -->
<!-- 		<div id="pie"> -->
<%-- 			<tiles:insertAttribute name="pie" /> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- </body> -->

<body class="p-t-none">
    <main class="page m-t-none">
        <div class="container-fluid">    
            <div class="wizard row">
                <tiles:insertAttribute name="contenido" />
            </div>
        </div>
    </main>
    
    <!-- GobMx -->
    <script src="${staticResourcesPath}/js/gobmx/gobmx-fonts.js"></script>
</body>
</html>