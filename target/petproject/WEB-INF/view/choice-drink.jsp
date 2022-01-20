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
    <c:forEach var ="drink" items ="${allDrinks}">
        <c:url  var="size" value="/sizeDrink">
            <c:param name="drinkId" value="${drink.id}">
            </c:param>
        </c:url>

        <tr>
            <td>${drink.name}</td>
            <td>${drink.cost}</td>
            <td>
                <input type="button" value="select"
                       onclick="window.location.href = '${size}'"/>

            </td>
        </tr>


    </c:forEach>

</table>

</body>
</html>