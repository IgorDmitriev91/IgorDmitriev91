<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h1>Thank you</h1>
<form:form action= "check">
    <input type="submit" value="check"/>
<input type = "button" value="new order"
       onclick="window.location.href = 'start'"/>
</form:form>
</body>
</html>