<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.css">
</head>
<body>
<table class="table table-bordered">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>工资</th>
        <th>部门</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="employee">
        <tr>
            <td>${employee.empId}</td>
            <td>${employee.empName}</td>
            <td>${employee.gender}</td>
            <td>${employee.email}</td>
            <td>${employee.deptName}</td>
            <td><a href="${APP_PATH}/employee/getEmpById?id=${employee.empId}" class="btn btn-success btn-sm">修改</a></td>
        </tr>
    </c:forEach>
</table>

</body>
<script src="static/js/jquery-1.12.4.min.js"></script>
<script src="static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</html>