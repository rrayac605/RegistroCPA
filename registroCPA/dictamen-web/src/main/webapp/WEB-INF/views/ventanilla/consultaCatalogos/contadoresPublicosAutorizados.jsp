<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../general/taglibs.jsp"%>
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/resources/js/dictamenVentanilla/consultaCatalogos/datosContadoresPublicos.js"></script>
    
    <style type="text/css">
        .filter{
            font-size: 10px;
        }
    </style>
</head>
<body>
<form:form id="formaContaPublicAutorizados">


<div style="width: 1010px">
    <table id="table-filtros" class="table table-striped table-bordered">
        <tr>
            <td>
                <spring:message code="label.cpa.apellido.paterno"/>
                <input type="text" class="form-control filter" id="cpaApellidoPaterno" name="cpaApellidoPaterno"/>
            </td>
            <td>
                <spring:message code="label.cpa.apellido.materno"/>
                <input type="text" class="form-control filter" id="cpaApellidoMaterno" name="cpaApellidoMaterno"/>
            </td>
            <td>
                <spring:message code="label.cpa.nombres"/>
                <input type="text" class="form-control filter" id="cpaNombre" name="cpaNombre"/>
            </td>
        </tr>
        <tr>
            <td>
                <spring:message code="label.cpa.curp"/>
                <input type="text" class="form-control filter" id="cpaCurp" name="cpaCurp"/>
            </td>
            <td>
                <spring:message code="label.cpa.numero.registro"/>
                <input type="text" class="form-control filter" id="cpaNumeroRegistro" name="cpaNumeroRegistro"/>
            </td>
            <td>
                <spring:message code="label.cpa.status"/>
                <select class="form-control filter" id="selectCpaStatus" name="selectCpaStatus">
                <option value="">--Seleccione una opción--</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <spring:message code="label.cpa.delegacion"/>
                <select class="form-control filter" id="selectCpaDelegacion" name="selectCpaDelegacion" onchange="recuperaSubdelegacionesPorDelegacion()">
                <option value="">--Seleccione una opción--</option>
                </select>
            </td>
            <td>
                <spring:message code="label.cpa.subdelegacion"/>
                <select class="form-control filter" id="selectCpaSubdelegacion" name="selectCpaSubdelegacion">
                <option value="">--Seleccione una opción--</option>
                </select>
            </td>
        </tr>
    </table>
 <hr/>
  <table id="tablaContadorPublico"
         class="table table-striped table-bordered">
  </table>
</div>

</form:form>
</body>
</html>
