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
    <br>


    Department<form:select path="department">
    <form:options items="${employee.departments}"/>


</form:select>
    <br>
    Which car do you want?
    <br>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <br> <br>

    Foreign language(s)
    EN <form:checkbox path="language" value="English"/>
    GE <form:checkbox path="language" value="German"/>
    FR <form:checkbox path="language" value="Fraanch"/>


    <br> <br>
    <input type="submit" value="ok"/>
    <br>


</form:form>


</body>

</html>