<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.lunch_rec.Menu" %>
<%@ page import="java.util.List" %>
<%
    List<Menu> menuList = (List<Menu>) request.getAttribute("menuList");
%>

<html>
<head>
    <title>메뉴 목록</title>
</head>
<body>
<h1>등록된 메뉴</h1>
<table border="1" cellpadding="5">
    <tr>
        <th>메뉴 이름</th>
        <th>맵기</th>
        <th>가격</th>
    </tr>

    <%
        if (menuList != null && !menuList.isEmpty()) {
            for (Menu m : menuList) {
    %>
    <tr>
        <td><%= m.getM_name() %></td>
        <td><%= m.getSpice() %></td>
        <td><%= m.getPrice() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="3">등록된 메뉴가 없습니다.</td>
    </tr>
    <%
        }
    %>
</table>
<a href="/form.jsp">메뉴 추가하기</a>
</body>
</html>
