<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier</title>
</head>
<body>
<table border='0' width='480px' align='center'>
<tr>
   <td align='center'><h1>Supplier </h1></td>
</tr>
<c:url var="action" value="/addsupplier" ></c:url>
<form:form action="${action}" method="get" commandName="supplierModel">

<table border='0' width='480px' align='center'>
<tr>
    <td align='center'><label>Supplier Id:</label></td>
    <td><form:input type="text" placeholder="enter supplier id" path="supplierID"  /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<tr>
    <td align='center'>Supplier Name:</td>
    <td><form:input type="text" name="suppliername" placeholder="suppliername" path="supplierName" /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>Desc:</td>
    <td><form:input type="text" name="supplierdesc" placeholder="enter supplierdesc" path="supplierDesc" /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

    <tr><td align='center'><input type='submit' name='REGISTER' value="ADD Supplier"></td>
</tr>
</table>
</form:form>
</body>
</html>