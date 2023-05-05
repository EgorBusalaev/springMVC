<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h2> Dear employee WELCOME! </h2>
<br>
<br>
<br>

<%--<h3> Your name: ${param.employeeName} </h3>--%>

Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your age: ${employee.age}
<br><br>

Your Department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br><br>
language(s)
<ul>
<c:forEach var="lang" items="${employee.language}">
    <li>  ${lang}    </li>
</c:forEach>
</ul>
</body>

</html>