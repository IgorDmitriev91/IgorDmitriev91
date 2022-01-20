<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h1>Check</h1>

<form:form modelAttribute="checkPizzas">
    <c:forEach var="pizza" items="${checkPizzas}" >
        ${pizza.description}
        ${pizza.size}
        cost: ${pizza.cost}<br>

</c:forEach>
</form:form>
<form:form modelAttribute="checkDrinks">
    <c:forEach var="drink" items="${checkDrinks}" >
        ${drink.description}
        ${drink.size}
        cost: ${drink.cost}
        <br>

    </c:forEach>
    AllCost: ${allCost}
</form:form>
</body>
</html>