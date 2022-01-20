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

    small<form:radiobutton  path="size" value = "small"  />
    big<form:radiobutton  path="size" value="big" disabled="false"  />
    <br>
    <br>

   <input type="submit" value="ok" />

</form:form>
</body>
</html>