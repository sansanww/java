<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<!--收集customerId,age,gender,style信息，并跳转到showGift-->
<html>
<head>
    <title>挑选礼物</title>
</head>

<body>
    <h2>个性化定制礼物</h2>
    <form action="/GiftRecommend/showGift" method="post">
        <table>
            <tr>
                <td>问题</td>
                <td>答案</td>
            </tr>
            <tr>
                <td>对方年龄：</td>
                <td>
                    <select name="age">
                        <option value="1">18-25岁</option>
                        <option value="2">26-40岁</option>
                        <option value="3">40岁以上</option>
                    </select>
                </td>
            </tr>
             <tr>
                <td>对方性别：</td>
                <td>
                    <select name="gender">
                        <option value="1">男性</option>
                        <option value="2">女性</option>
                    </select>
                </td>
             </tr>
              <tr>
                 <td>礼物风格：</td>
                 <td>
                     <select name="style">
                         <option value="1">中式</option>
                         <option value="2">西式</option>
                     </select>
                 </td>
              </tr>
              <tr>
                <td>你的用户ID：</td>
                <td>
                    <input type="text" name="customerId">
                </td>
              </tr>
        </table>
        <button type="submit" class="btn btn-success">提交个性化定制信息</button>
    </form>
</body>
</html>