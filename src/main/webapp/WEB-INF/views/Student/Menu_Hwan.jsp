<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>환과대 메뉴</title>
</head>
<body>
<a href="Menu.do">뒤로</a>
<center>
<h2>환과대 메뉴</h2>
<table border="1">
	<tr>
		<th>메뉴명</th><th>가격</th><th>종류</th><th>매진</th>
	</tr>
	<c:forEach items="${hwan_menu}" var="hwan">
	<tr>
		<td>${hwan.mn_name}</td>
		<td>${hwan.mn_price}</td>
		<td>${hwan.mn_type}</td>
		<td>${hwan.mn_sold}</td>
	</tr>
	</c:forEach>
</table>
</center>
</body>
</html>