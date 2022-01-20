<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Select Toppings</h2>

You select:${pizza.description }<br>
size:${pizza.size}<br>
cost:${pizza.cost}<br><br>


<form:form action="garbage" modelAttribute="pizza">
    ADD Toppings?<br><br>
    DoubleCheese  <form:checkbox path="cheese" value="DoubleCheese"/><br>
    DoubleMashrooms <form:checkbox path="mashrooms"  value="DoubleMashrooms" />  <br>
    DoubleTomatoPaste<form:checkbox path="tomato" value="DoubleTomatoPaste"/><br><br><br>
<input type="submit" value="inGarbage">
</form:form>
</body>
</html>