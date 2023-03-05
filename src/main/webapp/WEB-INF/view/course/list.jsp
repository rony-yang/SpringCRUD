<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강신청 목록</title>
</head>

<body>
<c:forEach items="${list}" var="registration">
<table border="1">
	<tr>
		<td>userId : </td>
		<td><c:out value="${registration.userId}" /></td>
	</tr>
	<tr>
		<td>studyCode : </td>
		<td><c:out value="${registration.studyCode}" /></td>
	</tr>
	<tr>
		<td>studyCourse :</td> 
		<td><c:out value="${registration.studyCourse}" /></td>
	</tr>
	<tr>
		<td>studyStartDate : </td>
		<td><c:out value="${registration.studyStartDate}" /></td>
	</tr>
	<tr>
		<td>studyPrice : </td>
		<td><c:out value="${registration.studyPrice}" /></td>
	</tr>
	</table>
</c:forEach>
</body>
</html>