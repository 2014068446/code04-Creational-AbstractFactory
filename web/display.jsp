<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<jsp:useBean id="behikulo" type="demo.model.vehicle.ToyotaVehicle"
	scope="request"></jsp:useBean>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Toyota Trucks</title>
</head>
<body>
	<h2>Welcome to UST Toyota Vehicles</h2>
	<h2>Selected Vehicle Details</h2>
	<p>
		Vehicle Model: <b><%=behikulo.viewModel()%></b>
	</p>
	<p>
		Vehicle Price: <b><%=behikulo.viewModel()%></b>
	</p>
	<!-- Now on Engine Display -->
	<p>Engine Details</p>
	<p>
		Engine Name: <b> <%=behikulo.getEngine().displayEngineType()%></b>
	</p>
	<p>
		Engine Details: <b> <%=behikulo.getEngine().literAndHorsePower()%></b>
	</p>
	<form action="index.jsp">
		<input type="submit" value="<< GO BACK >> ">
	</form>
</body>
</html>