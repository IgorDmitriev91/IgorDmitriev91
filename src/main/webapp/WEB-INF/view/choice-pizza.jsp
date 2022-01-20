<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Menu</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Cost</th>
    </tr>
<c:forEach var ="pizza" items ="${allPizzas}">
    <c:url  var="size" value="/sizePizza">
     <c:param name="pizzaId" value="${pizza.id}">
     </c:param>
 </c:url>

    <tr>
        <td>${pizza.name}</td>
        <td>${pizza.cost}</td>
        <td>
            <input type="button" value="select"
                   onclick="window.location.href = '${size}'"/>

        </td>
    </tr>


</c:forEach>

</table>

</body>
</html>