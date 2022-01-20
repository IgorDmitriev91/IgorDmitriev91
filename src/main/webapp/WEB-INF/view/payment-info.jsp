<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html/>
<html>
<body>
<h1>Payment</h1>
<form:form action= "theEnd">
    AllCost: ${allCost}<br><br>
    <input type="submit" value="Payment"/>
</form:form>
</body>
</html>
