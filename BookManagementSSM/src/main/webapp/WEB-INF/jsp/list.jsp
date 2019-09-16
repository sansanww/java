<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书列表</title>
</head>
<body>
	<h2>图书列表</h2>
	<table border="1">
		<tr>
			<td>图书ID</td>
			<td>图书名称</td>
			<td>剩余数量</td>
		</tr>
		<c:forEach items="${list }" var="book">
			<tr>
				<td>${book.bookId }</td>
				<td>${book.name }</td>
				<td>${book.number }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/BookManagementSSM/book/doAppoint">预约图书</a>
	<br>
	<a href="/BookManagementSSM/record">有奖问卷，阅读行为调查，奖品丰厚</a>
</body>
</html>