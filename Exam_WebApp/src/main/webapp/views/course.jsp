<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Nam An
  Date: 17/05/2025
  Time: 4:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh Sách khóa học</title>
</head>
<body>
<h2>Danh sách khóa học</h2>
<a href="./courseController/initCreate">Thêm mới khóa học</a>
<br/><br/>
<table>
    <tr>
        <th>ID khóa học</th>
        <th>Tên khóa học</th>
        <th>Mô tả</th>
        <th>Hành động</th>
    </tr>
    <c:choose>
        <c:when test="${not empty listCourses}">
            <c:forEach var="kh" items="${listCourses}">
                       <tr>
                           <td>${kh.id}</td>
                           <td>${kh.name}</td>
                           <td>${kh.description}</td>
                       </tr>
            </c:forEach>
        </c:when>
    </c:choose>

</table>
</body>
</html>
