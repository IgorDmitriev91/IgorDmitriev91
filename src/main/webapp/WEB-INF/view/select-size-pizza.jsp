<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>Select size pizza</h2>
<form:form action = "selectToppingsPizza"  modelAttribute="pizza">
    Select size pizza
    <br>
    <br>
    small<form:radiobutton  path="size" value = "small"/>
    medium<form:radiobutton  path="size" value="medium"/>
    big<form:radiobutton  path="size" value="big"/>
    <br>
    <br>
<input type="submit" value="ok"/>
</form:form>
</body>
</html>