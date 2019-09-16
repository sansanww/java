<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>阅读行为调查</title>
</head>
<body>
    <h2>问卷填写</h2>
    <form action="/BookManagementSSM/addRecord">
    <table>
        <tr>
            <td>问题</td>
            <td>答案</td>
        </tr>
        <tr>
            <td>你每周阅读频率（输入整数）：</td>
            <td><input type="text" name="frequency"></td>
        </tr>
         <tr>
            <td>你每周阅读时长（输入整数）：</td>
            <td><input type="text" name="hours"></td>
        </tr>
         <tr>
            <td>你的称呼：</td>
            <td><input type="text" name="name"></td>
        </tr>
         <tr>
            <td>你的电话，方便中奖后联系：：</td>
            <td><input type="text" name="phoneNumber"></td>
        </tr>

    </table>
    <button type="submit" class="btn btn-success">提交，参与抽奖</button>
    </form>
</body>
</html>