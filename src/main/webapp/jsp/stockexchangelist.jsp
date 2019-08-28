<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.stockspring.model.StockExchange"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
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
            width: 93%;
            margin-left: 45px;
           
            margin-top:80px;
        }

        .img {
            height: 50px;
            width: 80px;
            margin-top: 20px;
        }

        .ptext {
            margin-top: 60px;
        }

        .edit {
            width: 60px;
        }
.bords{
width:100%;
}
        .col {
            padding: 100px;
        }
        
			.footer {
    width: auto;
    height: 50px;
    background-color:gray;
    bottom: 0;
    position: fixed;
}
td{
padding-left:120px;}	
    </style>
</head>
<body style="background-color:#deeded">

   <div class="head"><marquee>Stock Market Charting</marquee></div>
    <div class="bord"><br>
        <div class="topnav">
           <a  href="companyList">Import Data</a>
          <a href="addCompany">Manage Company</a>
          <a href="stockexchangelist">Manage Exchange</a>
          <a href="ipoDetailsList">Update IPO details</a>
          <a href="login">Logout</a>
        </div><br>
     <br>  <h1 style="text-align:center">Stock Exchange Details</h1><br><br>
<%
List stockexchangelist=(List)request.getAttribute("stockexchangelist");
System.out.println(stockexchangelist);
%>

<div class="bords">
<table style="text-align:center;width:100%">
<tr style="font-weight:bold;color:red">
<td>StockExchange Id</td>
<td >Stock Exchange Name</td>
<td>Brief</td>
<td>Address</td>
<td>Remarks</td>
<td>Action</td>
</tr>
<% for(int i=0;i<stockexchangelist.size();i++){
	StockExchange e=(StockExchange)stockexchangelist.get(i);
	%>
<tr>
<td><%=e.getStockexchangeid() %></td>
<td><%= e.getStockexchangename() %></td>
<td><%= e.getBrief() %></td>
<td><%= e.getAddress() %></td>
<td><%= e.getRemarks() %></td>
<td><a href="update1?stockexchangeid=<%= e.getStockexchangeid() %>"><input type="submit" value="update"></a></td>
<td><a href="delete1?stockexchangeid=<%= e.getStockexchangeid() %>"><input type="submit" value="delete"></a></td>
<% }%>


</table></div>
<div class="footer"></div>
</body>
</html>