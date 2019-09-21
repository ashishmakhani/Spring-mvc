<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processform" modelattribute="student">
Firstname:<form:input path="firstname"/>
<br>
Lastname:<form:input path="lastname"/>
<br>
Country:
<form:select path="country">
<form:option value="india" label="india"/> 
<form:option value="uk" label="uk"/>
<form:option value="usa" label="usa"/>
</form:select>
<br>
Favourite Language:
Java: <form:radiobutton path="favouritelanguage" value="java"/>
Python: <form:radiobutton path="favouritelanguage" value="python"/>
C: <form:radiobutton path="favouritelanguage" value="C"/>
<br>
Operating System:
Linux<form:checkbox path="operatingsystem" value="linux"/>
Windows<form:checkbox path="operatingsystem" value="windows"/>
Mac<form:checkbox path="operatingsystem" value="mac"/>
<br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>