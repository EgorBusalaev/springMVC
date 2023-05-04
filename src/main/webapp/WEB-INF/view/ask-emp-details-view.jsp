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
    <form:option value="Infirmation tehnologies" label="IT"/>
    <form:option value="Human Resourses" label="HR"/>
    <form:option value="Sales" label="Sales"/>



</form:select>
    <br>
    <br>
    <input type="submit" value="ok"/>
    <br>
</form:form>





</body>

</html>