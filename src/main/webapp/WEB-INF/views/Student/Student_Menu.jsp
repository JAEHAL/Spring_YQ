<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메뉴 페이지</title>
</head>
<body>
<!--<a href="Login.do">뒤로</a> -->
<center>
<c:forEach items="${date}" var="today">
<h2><a href="MenuWeek.do">${today}</a></h2>
</c:forEach>
</center>
<form action="Insung.do" method="post">
<input type="submit" value="인성관"></form>
<form action="Hwan.do" method="post">
<input type="submit" value="환과대"></form>
<form action="Dorm.do" method="post">
<input type="submit" value="생활관"></form>
</body>
</html>