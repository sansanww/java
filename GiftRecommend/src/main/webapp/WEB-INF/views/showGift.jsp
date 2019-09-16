<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<!--解析传入的参数record的内容，展示给用户-->

<html>
<head>
    <title>个性化礼物</title>
</head>
<body>
    <h2>你的个性化需求是：${record.gift.description}</h2>
    <h2>推荐礼物：${record.gift.gift}</h2>
</body>
</html>