<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>stock exchange</title>
<style>
div.container {
	width: 45%;
	margin-top: 6%;
	margin-left: 400px;
	border: 1px solid black;
	position: relative;
}
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


        .bord{
           height:600px;
           width:93%;
          margin-left: 45px;
         
        }
		
table#table1 {
	text-align: center;
	margin-left: auto;
	margin-right: auto;
	width: 100px;
	margin-top: 70px;
}
  
tr, td {
	text-align: left;
	padding: 10px;
}
</style>
</head>
<body style="background-color:	#deeded	">
	
  <div class="head"><marquee>Stock Market Charting</marquee></div><br><br>
      <div class="bord"><br>
        
        <div class="topnav">
          <a href="companyList">Import Data</a>
          <a href="addCompany">Manage Company</a>
          <a href="stockexchangelist">Manage Exchange</a>
          <a href="ipoDetailsList">Update IPO details</a>
          <a href="login">Logout</a>
        </div>
	
				<form:form method="POST" action="/addstockPrice" modelAttribute="sp1">
				<h1 style="text-align: center;">SignUp Form</h1>
					<table id="table1">
						
						<tr>
							<th>Company code</th>
							<td><form:input path="companyCode" type="text" /></td>
						</tr>
						<tr>
							<th>Stock Exchange</th>
							<td><form:input path="stock_exchange" type="text" /></td>
						</tr>
						<tr>
							<th>current_Price</th>
							<td><form:input path="current_price" type="text" /></td>
						</tr>

						<tr>
							<th>Date</th>
							<td><form:input path="date" type="date" /></td>
						</tr>
						<tr>
							<th> Time</th>
							<td><form:input path="time" type="text" /></td>
						</tr>
						
						<tr>
							<td><input type="submit" value="submit"></td>
							<td><input type="reset" value="reset"></td>
						</tr>
						
					</table>
				</form:form></div>
				
</body>
</html>