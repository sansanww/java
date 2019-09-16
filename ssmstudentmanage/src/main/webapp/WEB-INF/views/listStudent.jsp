<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <%-- 引入JQ和Bootstrap --%>
    <script src="js/jquery/2.0.0/jquery.min.js"></script>
    <link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet">

    <title>学生管理系统 - 首页</title>

    <script>
        function del() {
            var msg = "您真的确定要删除吗？\n\n请确认！";
            if (confirm(msg) == true) {
                return true;
            } else {
                return false;
            }
        }
    </script>
</head>

<body>
    <!--表格展示视图-->
    <div class="listDIV">
    <table class="table table-striped table-bordered table-hover table-condensed">
        <caption>学生列表 - 共${page.total}人
         &nbsp;
         <a href="/ssmstudentmanage/showAddStudent">新增学生</a>
         </caption>
        <thead>
        <tr class="success">
            <th>学号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>编辑</th>
            <th>删除</th>
            <th>心理测试</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${students}" var="s" varStatus="status">
            <tr>
                <td>${s.student_id}</td>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td>${s.sex}</td>
                <td>${s.birthday}</td>

                <td><a href="/ssmstudentmanage/editStudent?id=${s.id}"><span class="glyphicon glyphicon-edit"></span> </a></td>
                <td><a href="/ssmstudentmanage/deleteStudent?id=${s.id}" onclick="javascript:return del();"><span
                        class="glyphicon glyphicon-trash"></span> </a></td>
                <td><a href="/ssmstudentmanage/ResultOfQuestionnaire?student_id=${s.student_id}"><span
                        class="glyphicon glyphicon-credit-card"></span></a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

    <!--分页展示控件-->
    <nav class="pageDIV">
        <ul class="pagination">
            <li <c:if test="${!page.hasPreviouse()}">class="disabled"</c:if>>
                <a href="?page.start=0">
                    <span>«</span>
                </a>
            </li>

            <li <c:if test="${!page.hasPreviouse()}">class="disabled"</c:if>>
                <a href="?page.start=${page.start-page.count}">
                    <span>‹</span>
                </a>
            </li>

            <c:forEach begin="0" end="${page.totalPage-1}" varStatus="status">

                <c:if test="${status.count*page.count-page.start<=30 && status.count*page.count-page.start>=-10}">
                    <li <c:if test="${status.index*page.count==page.start}">class="disabled"</c:if>>
                        <a
                                href="?page.start=${status.index*page.count}"
                                <c:if test="${status.index*page.count==page.start}">class="current"</c:if>
                        >${status.count}</a>
                    </li>
                </c:if>
            </c:forEach>

            <li <c:if test="${!page.hasNext()}">class="disabled"</c:if>>
                <a href="?page.start=${page.start+page.count}">
                    <span>›</span>
                </a>
            </li>
            <li <c:if test="${!page.hasNext()}">class="disabled"</c:if>>
                <a href="?page.start=${page.last}">
                    <span>»</span>
                </a>
            </li>
        </ul>
    </nav>
</body>
</html>