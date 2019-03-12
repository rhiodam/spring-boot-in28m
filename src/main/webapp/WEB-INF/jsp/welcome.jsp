<%--
  Created by IntelliJ IDEA.
  User: W
  Date: 3/12/2019
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<%--<!DOCTYPE html>--%>

<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>

<%--<html lang="en">--%>

<%--<body>--%>
<%--<c:url value="/resources/text.txt" var="url"/>--%>
<%--<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />--%>
<%--Spring URL: ${springUrl} at ${time}--%>
<%--<br>--%>
<%--JSTL URL: ${url}--%>
<%--<br>--%>
<%--Message: ${message}--%>
<%--</body>--%>

<%--</html>--%>


<html>

<head>
    <title>First Web Application</title>
</head>

<body>
Welcome ${name}!!
<p>${password}</p>
<a href="/list-todos">Click here</a> to manage your todo's.
</body>

</html>