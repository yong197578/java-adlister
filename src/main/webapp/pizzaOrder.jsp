<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/17/23
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form</title>
</head>
<body>
<form action="/pizza-order" method="post">
<label for="pizzaCrust">Choose your crust:</label>
    <select name="pizzaCrust" id="pizzaCrust">
        <option value="thin">Thin</option>
        <option value="normal">Normal</option>
        <option value="thick">Thick</option>
    </select>

<label for="cheese">Cheese</label>
<input type="checkbox" id="cheese" name="topping" value="cheese">
<label for="pepperoni">Pepperoni</label>
<input type="checkbox" id="pepperoni" name="topping" value="pepperoni">
<label for="sausage">Sausage</label>
<input type="checkbox" id="sausage" name="topping" value="sausage">

<label for="address">Please enter your address:</label>
<input type="text" name="address" id="address">
<button type="submit">Submit Your Order</button>
</form>
</body>
</html>
