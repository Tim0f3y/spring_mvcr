<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>

<body>
<center>
    <table>
        <thead><h1>${resLang.getString("table")}</h1></thead>
        <c:forEach var="crs" items="${cars}">
            <colgroup>
                <col span="2" style="background:Khaki">
                <col style="background-color:LightCyan">
            </colgroup>

            <tr>
                <th>Id</th>
                <th>Model</th>
                <th>Number</th>
            </tr>
            <tr>
                <td>${crs.id}</td>
                <td>${crs.model}</td>
                <td>${crs.number}</td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
