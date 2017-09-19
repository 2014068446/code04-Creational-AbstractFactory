<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Toyota Trucks</title>
</head>
<body>
	<h2>Welcome to USt Toyotaa Vehicles</h2>
	<h2>Select and pick and get a 50% discount if you will pass
		ITELEC4C</h2>
	<fieldset>
		<legend>List of Toyota Vehicles</legend>
		<form action='processvehicleselection.html' method='post'>
			<p>
				Select your 2017 preferred vehicle: <select name='preferredVehicle'>
					<option value="FORTUNER">Fortuner</option>
					<option value="PRADO">Prado</option>
					<option value="HILUX">HiLux</option>
					<option value="LAND CRUISER">Land Cruiser</option>
					<option value="WIGO">Wigo</option>
				</select>
			</p>
			<p>
				<input type='submit' value='Show Vehicle Information' />
				&nbsp;&nbsp;&nbsp; <input type='reset' />
			</p>
		</form>
	</fieldset>
</body>
</html>