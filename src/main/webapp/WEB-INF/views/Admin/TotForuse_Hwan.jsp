<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>환과대 정산 페이지</title>
</head>
<body>
<center>    
    <!-- 환과대 -->
	<table align="center" cellpadding="20px">
	<tr><td>
	<form method="post" action="AdminInsungTot.do">
	<input type="text" name="revenue">
	<input type="submit" value="조회">
	</form>
	</td></tr>
	<tr><td>원하는 월 입력 : ex)2017-07</td></tr>
	<c:forEach var="ad_rm" items="${Ad_rm}">
		<tr>
		<td>월별 매출 : ${ad_rm.r_money}</td>
		</tr>
	</c:forEach>
	</table>
	<hr>
	<center>
	<table>
	<tr><td>환과대 인기메뉴</td></tr>
	<c:forEach var="Insung" items="${Insung_no}">
		<tr>
		<td>${Insung.mn_name}</td>
		</tr>
	</c:forEach>
	</table>
	</center>
</center>
</body>
</html>