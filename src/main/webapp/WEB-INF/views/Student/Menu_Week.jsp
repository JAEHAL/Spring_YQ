<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주간 메뉴</title>
</head>
<body><!-- 
<form action="back_page" method="post">
<input type="submit" value="뒤로">
</form> -->
<!-- <a href="Menu.do">뒤로</a> -->
<center>
<h2>주간 메뉴</h2>
<table border="1">
	<tr>
		<th>장소</th><th>날짜</th><th>메뉴명</th><th>가격</th><th>종류</th>
	</tr>
	<c:forEach items="${week_menu}" var="week">
	<tr>
		<td>${week.chain}</td>
		<td>${week.date}</td>
		<td>${week.mn_name}</td>
		<td>${week.mn_price}</td>
		<td>${week.mn_type}</td>
	</tr>
	</c:forEach>
</table>
</center>
</body>
</html>