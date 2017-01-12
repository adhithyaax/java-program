<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='0' width='480px' align='center'>
<tr>
   <td align='center'><h1>category </h1></td>
</tr>
<form:form action="categorysuccess" method="post" commandName="user" >
<table border='0' width='480px' align='center'>
<tr>
    <td align='center'><label>category Id:</label></td>
    <td><input type='text' name='categoryid' placeholder="enter your name" path="categoryid" required/ ></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<tr>
    <td align='center'>categoryname:</td>
    <td><input type='text' name='categoryname' placeholder="categoryname" path="password"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>desc:</td>
    <td><input type='text' name='desc' placeholder="enter your desc" path="desc" /></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<table border='0' width='480px' align='center'>
<tr>

    <td align='center'><input type='submit' name='REGISTER' value="register"></td>
</tr>
</table>
</table>

</table>

</form:form>




</body>
</html>