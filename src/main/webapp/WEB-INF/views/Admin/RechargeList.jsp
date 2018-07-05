<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생 충전 내역 관리</title>
</head>
<body>
<center>
	<form method="post" action="R_ID_Search">
	<input type="text" name="stu_id">
	<input type="submit" value="검색">
	<h5>원하는 학번 입력</h5>
	</form>
	<%-- <h2>${message}</h2> --%>
</center>
<br><br><br><br>
<table style="width=2000; table-layout:fixed;" borderColor=#000000 cellSpacing=0 cellPadding=0 border=1 align="center">
   	<tr height="50">
	<th>학번</th><th>일자</th><th>장소</th><th>메뉴명</th><th>사용금액</th>
</tr>
<c:forEach var="r_list" items="${r_list}">
<tr height=50>
<td width=100>${r_list.stu_id}</td>
<td width=100>${r_list.date}</td>
<td width=100>${r_list.chain}</td>
<td width=100>${r_list.mn_name}</td>
<td width=100>${r_list.mn_price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>