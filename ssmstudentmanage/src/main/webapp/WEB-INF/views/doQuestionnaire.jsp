<!--跳转到addQuestionnaire-->
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
    <title>问卷填写</title>
</head>
<body>


    <div class="addDIV">
        <div class="panel panel-success">
            <div class="panel-heading">
                <h3 class="panel-title">心理问卷</h3>
            </div>
            <div class="panel-body">
               <form action="/ssmstudentmanage/addQuestionnaire" method="post">
                    <table>

                       <tr>
                           <td>学号：</td>

                           <td><input type="text" name="student_id" value="${requestScope.student_id}" readonly="true"></td>
                       </tr>
                       <tr>
                            <td>你的性格内向还是外向：</td>
                            <td>
                           <select name="extraversion">
                               <option value="内向">内向</option>
                               <option value="外向">外向</option>
                           </select>
                           </td>
                       </tr>
                       <tr>
                            <td>你的社交能力高还是低：</td>
                            <td>
                       <select name="socialSkills">
                          <option value="高社交能力">高社交能力</option>
                          <option value="低社交能力">低社交能力</option>
                       </select>
                            </td>

                      <tr class="submitTR">
                          <td colspan="2" align="center">
                              <button type="submit" class="btn btn-success">提 交</button>
                          </td>
                      </tr>
                    </table>
               </form>
            </div>
        </div>
    </div>


</body>

