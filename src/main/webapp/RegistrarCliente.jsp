<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Cliente</title>
</head>
<body bgcolor="#c5dec9" >

<h1  align="center" >
Registrar CLiente
</h1>

<%-- CREAR FORMULARIO --%>
<%-- ACTION HACE QUE REGRESE A MI CONTROLADOR CLIENTE --%>
<form action="ControladorCliente" method="post">
<table align="center" >

<tr>
<td> nombre</td>
<td> <input  type="text" name="nombre"> </td>		 
</tr>

<tr>
<td> Apellido</td>
<td> <input  type="text" name="apellido"> </td>		 
</tr>

<tr>
<td> DNI</td>
<td> <input  type="text" name="dni"> </td>		 
</tr>

<tr>
<td> Email</td>
<td> <input  type="text" name="email"> </td>		 
</tr>

<tr>
<td> Telefono</td>
<td> <input  type="text" name="telfono"> </td>		 
</tr>

<tr>
<td> Sexo</td>
<td> <input  type="text" name="sexo"> </td>		 
</tr>

<tr>
<td> Nacionalidad</td>
<td> <input  type="text" name="nacionalidad"> </td>		 
</tr>

<%-- AGREGAR BOTON DE REGISTAR --%>
<tr>
<td colspan="2"> 
<input type="submit"  value="Registar">
</td>	 
</tr>


</table>
</form>
</body>
</html>