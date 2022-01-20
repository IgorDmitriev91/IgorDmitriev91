<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>Select size drink</h2>
<form:form action = "selectToppingsDrinks" modelAttribute="drink">
    Select size pizza
    <br>
    <br>

    small<form:radiobutton  path="size" value = "small"  />${drink.flag=true}
    big<form:radiobutton  path="size" value="big" disabled="false"  />${drink.flag=true}
    <br>
    <br>
    <c:if test="${drink.flag==false}" >
   <input type="submit" value="ok" disabled />
     </c:if>
    <c:if test="${drink.flag==true}" >
        <input type="submit" value="ok" />
    </c:if>
</form:form>
</body>
</html>