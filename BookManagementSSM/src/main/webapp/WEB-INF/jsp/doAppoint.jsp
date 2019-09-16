<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>预约图书</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		var url,bookId;
		$("#doAppoint_submit").click(function(){
			bookId = $("select option:checked").attr("value");
			url = "/BookManagementSSM/book/"+bookId+"/appoint";
			$("form").attr("action",url);
			$.post(url, $("form").serialize(), function(jsonData){
				var isSuccess = jsonData.success;
				if(isSuccess){
					var state = jsonData.data.state;
					var stateInfo = jsonData.data.stateInfo;
					if(state == -1){ //重复预约
						alert(stateInfo);
					}else if(state == 1){ //预约成功
						alert(stateInfo);
					}else if(state == 0){ //库存不足
						alert(stateInfo);
					}else{ //系统异常
						alert(stateInfo);
					}
				}else{
					var error = jsonData.error;
					alert(error);
				}
			})
			return false;
		})

		$("#doQuery_submit").click(function(){
			bookId = $("select option:checked").attr("value");
			url = "/BookManagementSSM/book/"+bookId+"/detail";
			$("form").attr("action",url);
			return true;
		})
	})

</script>
</head>
<body>
	<h2>预约图书</h2>
	<form action="">
		书名:<select>
			<c:forEach items="${list }" var="book">
				<option value="${book.bookId }">
					${book.name }
				</option>
			</c:forEach>
		</select>
		&nbsp;
		<button type="submit" id="doQuery_submit" >查询图书余量</button>
		<br><br>
		学号:<input type="text" name="studentId" />
		<br><br>
		<input type="button" value="确定预约" id="doAppoint_submit"/>
	</form>

	<br>
	<a href="/BookManagementSSM/book/list">返回</a>
</body>
</html>