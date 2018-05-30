<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생 충전 내역 페이지</title>
</head>
<body>
<form method="post" action="back_main">
<input type="submit" value="뒤로"></form>
<br/>
<form action="OneWeek_recharge.do" method="post">
<input type="submit" value="1주일"></form>
<form action="OneMonth_recharge.do" method="post">
<input type="submit" value="1개월"></form>
<form action="ThreeMonth_recharge.do" method="post">
<input type="submit" value="3개월"></form>
</body>
</html>