

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
 <a href="success">ahkjfkas</a>
<table border='0' width='480px' align='center'>
<tr>
   <td align='center'><h1>Registration Form </h1></td>
</tr>
<form:form action="success" method="post" commandName="user" >
<table border='0' width='480px' align='center'>
<tr>
    <td align='center'><label>username:</label></td>
    <td><input type='text' name='username' placeholder="enter your name" path="username"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>studentid:</td>
    <td><input type='text' name='studentid' placeholder="enter your id" path="studentid"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>

<tr>
    <td align='center'>password:</td>
    <td><input type='text' name='password' placeholder="enter your sur name" path="password"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>email:</td>
    <td><input type='text' name='email' placeholder="enter your mailid" path="email"/></td>
</tr>
<tr> <td>&nbsp;</td> </tr>
<tr>
    <td align='center'>birthdate:</td>
    <td><input type='text' name='birthdate' placeholder="enter your DOB" path="birthdate"/></td>
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