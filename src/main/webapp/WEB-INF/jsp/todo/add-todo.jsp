<%--
  Created by IntelliJ IDEA.
  User: W
  Date: 3/12/2019
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Todo's for ${name}</title>
    <link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <form:form method="post" action="/add-todo" modelAttribute="todo">
        <fieldset class="form-group">
            <form:label path="desc">Description</form:label>
            <form:input path="desc" class="form-control" type="text" required="required"/>
            <br>
        </fieldset>
        <button class="btn btn-success" type="submit" name="submit" value="Add">Add</button>
    </form:form>
</div>

<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
