<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Admin Landing Page</title>
<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	background-color:  #e0ebeb;
}

.topnav {
  overflow: hidden;
  background-color: #333;

 
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
   padding-right:170px;
   width:20%;
    background-color: #ff9900;
}

.topnav a:hover {
  background-color: brown;
  color: black;
}

.topnav a.active {
  background-color: brown;
     color: brown;
}
  .head{
		height:70px;
		width:100%;
		background-color:#5c96f2;
		text-align:center;
		font-size:30px;
		}



.bord {
	
	height: 600px;
	width: 100%;
	margin-left: 45px;
	
}


th{
padding-left:500px;
padding-bottom:20px;}
.bton{
padding-left:500px;
}
table#table1 {
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	width: 100px;
	margin-top: 70px;
}

</style>
</head>
<body>
	<div class="head">
		<marquee>Stock Market Charting</marquee>
	</div>
	<p style="text-align: center; font-size: 32px;">Create New Company</p>
	<br>
	<div class="bord">
		
		<div class="topnav">
			 <a  href="companyList">Import Data</a>
          <a href="addCompany">Manage Company</a>
          <a href="stockexchangelist">Manage Exchange</a>
          <a href="ipoDetailsList">Update IPO details</a><a  href="/login">Logout</a>
		</div><br><br>

	<form:form method="POST" action="/addIpodetails" modelAttribute="ipo1"><br><br>
			<table id="#table1 ">
		
			<tr>
				<th>Id</th>
				<td><form:input path="id" type="text" />
				<br>
				<form:errors path="id" class="text-danger" /></td></tr>
			
			<tr>
			<tr>
				<th>Company Code:</th>
				<td><form:input path="companyCode" type="text" />
				<br>
				<form:errors path="companyCode" class="text-danger" /></td></tr>
			
			<tr>
				<th>StockExchange:</th>
				<td><form:input path="stockexchange" type="text" />
				<br>
				<form:errors path="stockexchange" class="text-danger" /></td></tr>
			
			<tr>
				<th>Price:</th>
				<td><form:input path="price" type="text" />
				<br>
				<form:errors path="price" class="text-danger" /></td>
			</tr>


			<tr>
				<th>Total:</th>
				<td><form:input path="total" type="text" />
				<br>
				<form:errors path="total" class="text-danger" /></td>
			</tr>
			<tr>
				<th>DateTime:</th>
				<td><form:input path="datetime" type="text" />
				<br>
			
			<form:errors path="datetime" class="text-danger" /></td></tr>
			<tr>
				<th>Remarks:</th>
				<td><form:input path="remarks" type="text" />
				<br>
			
			<form:errors path="remarks" class="text-danger" /></td></tr>
			</table>
		<div class="bton"><input type="submit" name="submit"  value="submit"> </div>
		</form:form>
	</div>
	
</body>
</html>

