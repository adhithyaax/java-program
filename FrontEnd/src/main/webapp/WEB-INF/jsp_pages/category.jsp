<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Category</title>
</head>
<body>
<table border='0' width='480px' align='center'>
<tr>
   <td align='center'><h1>category </h1></td>
</tr>
<c:url var="action" value="/addcategory" ></c:url>
<form:form action="${action}" method="get" commandName="categoryModel">

<table border='0' width='480px' align='center'>
<tr>
    <td align='center'><label>category Id:</label></td>
    <td><form:input type="text" placeholder="enter category id" path="catID"  /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<tr>
    <td align='center'>categoryname:</td>
    <td><form:input type="text" name="categoryname" placeholder="categoryname" path="catName" /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>desc:</td>
    <td><form:input type="text" name="categorydesc" placeholder="enter category desc" path="catDesc" /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

    <tr><td align='center'><input type='submit' name='REGISTER' value="register"></td>
</tr>

<strong>Category List</strong>
<c:if test="${not empty list}">

	<table style="border: 1px solid black;">	<tr><th>Category Id</th><th>CategoryName</th><th>Options</th></tr>
			<c:forEach var="listValue" items="${list}">
			<tr>	<td>${listValue.catID}</td><td>${listValue.catName}</td>
		<td>	<form action="deletecategory"><button name="categoryId"  type="submit"  value=${listValue.catID}>Delete</button></form>
			<form action="editcategory"><button name="categoryId" type="submit" value=${listValue.catID} >Edit</button></form>
			</td></tr>
			</c:forEach>

</table>
</c:if>

</form:form>



</body>
</html>