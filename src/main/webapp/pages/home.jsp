<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>


<a href="/?lang=en">English</a> <br><br>
<a href="/?lang=tm">Tamil</a> <br><br>
<a href="/?lang=hi">Hindi</a> <br><br>




<h1><s:message code="lebal.welcome"/></h1>


<form action="addstudent">

<s:message code="lebal.roll"/> :<input type="text" name="roll"><br><br>

<s:message code="lebal.name"/> :<input type="text" name="name"><br><br>

<s:message code="lebal.marks"/> :<input type="text" name="marks"><br><br>


<input type="submit" value=<s:message code="lebal.button" />>


</form>




</body>
</html>