<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1주일 사용 내역</title>
</head>
<body>
<a href="ViewUse.Page">뒤로</a>
<center>
<h2>1주일 사용 내역</h2>
<table border="1">
	<tr>
		<th>날짜</th><th>장소</th><th>메뉴명</th><th>가격</th>
	</tr>
	<c:forEach items="${oneweek}" var="oneweek">
	<tr>
		<td>${oneweek.date}</td>
		<td>${oneweek.chain}</td>
		<td>${oneweek.mn_name}</td>
		<td>${oneweek.mn_price}</td>
	</tr>
</c:forEach>
</table>
</center>
</body>
</html>