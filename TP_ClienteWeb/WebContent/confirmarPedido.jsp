<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dto.PedidoDTO"%>
<%@page import="java.util.List"%>
<%@page import="businessDelegate.BusinessDelegate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirmar Pedido</title>
</head>
<body>

	<h2>Ingrese el ID del Pedido a validar</h2>
	<div>
		<form action="ControladorWeb?action=validarPedido" method="post">
			<table cellpadding="2" cellspacing="2" border="1" width="60%">
				<tr>
					<td><b>id Pedido:</b></td>
					<td><input type="text" name="IdPedido"></td>
					<td><input type="submit" id="btnSubmit" value="Validar Pedido">
				</tr>
			</table>
		</form>
	</div>


</body>
</html>