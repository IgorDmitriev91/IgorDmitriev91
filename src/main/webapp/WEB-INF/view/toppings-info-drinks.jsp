<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Select Toppings</h2>

You select:${drink.description }<br>
size:${drink.size}<br>
cost:${drink.cost}<br><br>


<form:form action="garbage" modelAttribute="drink">
    ADD Toppings?<br><br>
    Lemon  <form:checkbox path="lemon" value="lemon"/><br>
    Syrop <form:checkbox path="syrup"  value="syrup" />  <br>
    Cream<form:checkbox path="cream" value="cream"/><br><br><br>
    <input type="submit" value="inGarbage">
</form:form>
</body>
</html>