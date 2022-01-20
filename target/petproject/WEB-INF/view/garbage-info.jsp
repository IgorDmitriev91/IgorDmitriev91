<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Garbage</h2>

<form:form  modelAttribute="allPizzas">
    <c:if test="${allPizzas.size()>0}">

    <c:forEach var="pizza" items="${allPizzas}">
    ${pizza.description}
    ${pizza.size}
    cost: ${pizza.cost}<br>

    </c:forEach>
    </c:if>
</form:form>


<form:form  modelAttribute="allDrinks">
    <c:if test="${allDrinks.size()>0}">
    <c:forEach var="drink" items="${allDrinks}">
        ${drink.description}
        ${drink.size}
        cost: ${drink.cost}<br>
    </c:forEach>
    </c:if>
</form:form>

<form:form action= "start" >
  AllCost: ${allCost}
    <br>
    <br>
    <input type="submit" value="MainMenu"/>
    <input type = "button" value="Payment"
           onclick="window.location.href = 'payment'"/>
</form:form>




</body>
</html>