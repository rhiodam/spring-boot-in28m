<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Todo's for ${name}</title>
</head>

<body>
Here are the list of your todos:
${todos}
<BR/>
<%--Your Name is : ${name}--%>
<br>
<table>
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
            <%--<td></td>--%>
            <%--<td></td>--%>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a href="/add-todo">add new Todo</a>
</body>

<footer>C</footer>
</html>