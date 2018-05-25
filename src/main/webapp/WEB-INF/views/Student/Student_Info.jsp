<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <c:if test="${empty login_info}">
	<jsp:forward page='Login.do' />
</c:if> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생 정보 페이지</title>
</head>
<body>
<form method="post" action="back_main">
<input type="submit" value="뒤로"></form><br><br>
<table cellpadding="20px" style="position:relative; left: 150px; top:20px;">
	<tr>
		<td>이름 : </td>
		<td>${login_info.stu_name}</td>
	</tr>
   	<tr>
		<td>학번 : </td>
		<td>${login_info.stu_id}</td>
	</tr>
   	<tr>
		<td>잔액 : </td>
		<td>${login_info.stu_change}</td>
	</tr>
</table>
<form method="post" action="Usage.do">
<input type="submit" value="사용">
</form>
</body>
</html>