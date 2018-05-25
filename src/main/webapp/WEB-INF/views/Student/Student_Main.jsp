<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생 메인페에지</title>
</head>
<body>
<div style="position:absolute; top:10px; left:370px">
<a href="Student_Info.do">
<c:forEach items="${login_name}" var="name">
${name}님
</c:forEach>
</a>
<form method="post" action="Logout.do">
<input type="submit" value="로그아웃"></form>
</div>
		<form method="post" action="Menu.do">
		<input type="submit" value="메뉴보기"></form>
		<form method="post" action="Recharge.Page">
		<input type="submit" value="충전하기"></form>
		<form method="post" action="ViewUse.do">
		<input type="submit" value="사용내역"></form>
		<form method="post" action="ViewRecharge.do">
		<input type="submit" value="충전내역"></form>
</body>
</html>