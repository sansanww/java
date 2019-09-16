<%--解析参数questionnaire--%>
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

    <title>心理问卷-首页</title>

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
    <a href="/ssmstudentmanage/doQuestionnaire?student_id=${requestScope.questionnaire.student_id}">
                    没有结果？戳这里填写问卷！</a>
                    <br>
    <table class="table table-striped table-bordered table-hover table-condensed">

        <thead>
        <tr class="success">
            <th>学号</th>
            <th>外向性</th>
            <th>社交能力</th>
            <th>测试结果</th>
            <th>重测</th>
            <th>删除</th>
        </tr>
        </thead>

        <tbody>
            <tr>
                <td>${requestScope.questionnaire.student_id}</td>
                <td>${requestScope.questionnaire.extraversion}</td>
                <td>${requestScope.questionnaire.socialSkills}</td>
                <td>${requestScope.questionnaire.extraversion}${requestScope.questionnaire.socialSkills}</td>
                <td><a href="/ssmstudentmanage/editQuestionnaire?student_id=${requestScope.questionnaire.student_id}"><span
                        class="glyphicon glyphicon-edit"></span> </a></td>
                <td><a href="/ssmstudentmanage/deleteQuestionnaire?student_id=${requestScope.questionnaire.student_id}" onclick="javascript:return del();"><span
                        class="glyphicon glyphicon-trash"></span> </a></td>

            </tr>
        </tbody>
    </table>

    <a href="/ssmstudentmanage/listStudent">戳这里返回学生列表</a>
</div>
</body>
</html>