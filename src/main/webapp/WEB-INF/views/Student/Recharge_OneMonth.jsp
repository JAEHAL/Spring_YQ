<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1개월 충전 내역</title>
</head>
<body>
<a href="ViewRecharge.Page">뒤로</a>
<center>
<h2>1개월 사용 내역</h2>
<table border="1">
	<tr>
		<th>날짜</th><th>충전 금액</th>
	</tr>
	<c:forEach items="${onemonth}" var="onemonth">
	<tr>
		<td>${onemonth.date}</td>
		<td>${onemonth.mn_price}</td>
	</tr>
</c:forEach>
</table>
</center>
</body>
</html>