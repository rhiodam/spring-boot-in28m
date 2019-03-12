<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Todo's for ${name}</title>
    <link href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <%--Here are the list of your todos:--%>
    <%--${todos}--%>

    <div>
        <BR/>
        ${name} 's Todo List
        <br>
        <table class="table table-striped">
            <caption>Your Todos are :</caption>
            <thead>
        <tr>
            <th>Id</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Is it Done?</th>
        </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                    <td><a href="/edit-todo?id=${todo.id}" type="button" class="btn btn-info">Edit</a></td>
                    <td><a href="/delete-todo?id=${todo.id}" type="button" class="btn btn-warning">Delete</a></td>
                        <%--<td></td>--%>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>
    <div>
        <a href="/add-todo"><span class="glyphicon-fast-forward"></span>Add new Todo</a>
    </div>
</div>

<script src="webjars/jquery/3.2.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>