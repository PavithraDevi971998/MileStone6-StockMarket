<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*,com.example.stockspring.model.Company"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewCompanyPage</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css">
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

.para{
text-align:center;
font-weight:bold;
font-size:24px;
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
}</style>
</head>
<body>

	<div class="head">
		<p style="padding-top: 20px">STOCK MARKETING</p>
	</div><br><br>
	<div class="bord">
		<div class="topnav">
			 <a  href="companyList">Import Data</a>
          <a href="addCompany">Manage Company</a>
          <a href="stockexchangelist">Manage Exchange</a>
          <a href="ipoDetailsList">Update IPO details</a><a  href="/login">Logout</a>
		</div><br><br>
		<p class="para">Update Company</p>
		<%
			Company company = (Company) request.getAttribute("companyList");
		%>
		<form:form method="POST" action="/updateCompany" modelAttribute="company">


			<table id="#table1 ">
		<tr>
				<th>Company code</th>
				<td><form:input path="companyCode" type="text" value="<%=company.getCompanyCode() %>" readonly="true" />
				<br>
				<form:errors path="companyCode" class="text-danger" /></td></tr>
			
			<tr>
			<tr>
				<th>Company name:</th>
				<td><form:input path="companyName" type="text" value="<%=company.getCompanyName() %>" />
				<br>
				<form:errors path="companyName" class="text-danger" /></td></tr>
			
			<tr>
				<th>TurnOver:</th>
				<td><form:input path="turnOver" type="text" value="<%=company.getTurnOver() %>" />
				<br>
				<form:errors path="turnOver" class="text-danger" /></td></tr>
			
			<tr>
				<th>Ceo:</th>
				<td><form:input path="ceo" type="text" value="<%=company.getCeo() %>" />
				<br>
				<form:errors path="ceo" class="text-danger" /></td>
			</tr>


			<tr>
				<th>Boardofdirectors:</th>
				<td><form:input path="boardOfDirectors" type="text" value="<%=company.getBoardOfDirectors() %>" />
				<br>
				<form:errors path="boardOfDirectors" class="text-danger" /></td>
			</tr>
			<tr>
				<th>Sectorid:</th>
				<td><form:input path="sectorid" type="text" value="<%=company.getSectorid() %>" />
				<br>
			
			<form:errors path="sectorid" class="text-danger" /></td></tr>
			<tr>
				<th>briefWriteup:</th>
				<td><form:input path="briefWriteup" type="text" value="<%=company.getBriefWriteup() %>"/>
				<br>
			
			<form:errors path="briefWriteup" class="text-danger" /></td></tr>
			<tr>
				<th>Stock code:</th>
				<td><form:input path="stockCode" type="text" value="<%=company.getStockCode() %>" /></td>
				<br>
			
			<form:errors path="stockCode" class="text-danger" /></td></tr>
				
			</tr></table>
		<div class="bton"><input type="submit" name="submit"  value="submit"> </div>
		</form:form>	


</div>




</body>

</body>
</html>
