<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details!</h2>

<br>
<br>

<form:form action="showDetail" modelAttribute="employee">

    Name <form:input path="name"/>

    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Age <form:input path="age"/>
    <br>
    <input type="submit" value="ok"/>
</form:form>





</body>

</html>