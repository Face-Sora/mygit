<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<% pageContext.setAttribute("APP_PATH",request.getContextPath()); %>>
<title>Insert title here</title>
</head>
<body>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${allCat.list}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
        </tr>
    </c:forEach>
</table>
<div>
	<ul>
		<c:forEach items="${allCat.navigatepageNums}" var="n">
        <li>
            <a href="${APP_PATH}/show?pn=${n}">${n}</a>
        </li>
    </c:forEach>
	</ul>
</div>
</body>
</html>