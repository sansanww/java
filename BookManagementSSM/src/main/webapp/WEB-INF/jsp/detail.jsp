<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<td>图书ID</td>
			<td>图书名称</td>
			<td>剩余数量</td>
		</tr>
		<tr>
			<td>${book.bookId }</td>
			<td>${book.name }</td>
			<td>${book.number }</td>
		</tr>
	</table>
	<a href="/BookManagementSSM/book/doAppoint">返回</a>

</body>
</html>