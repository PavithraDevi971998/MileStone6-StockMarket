<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.example.stockspring.model.Company"    pageEncoding="UTF-8"%>%>
<html lang="en">

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
            border: 1px solid black;
            height: 600px;
            width: 93%;
            margin-left: 45px;
            background-color: #b3b3b3;
            margin-top:80px;
        }

        section {
            border: 1px solid black;
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

        .col {
            padding: 150px;
        }
        
		.footer {
    width: auto%;
    height: 50px;
    background-color:gray;
    bottom: 0;
    position: fixed;
}
    </style>
</head>

<body>
        <div class="head"><marquee>Stock Market Charting</marquee></div>
    <div class="bord"><br>

    
        <div class="topnav">
            <a  href="companyList">Import Data</a>
          <a href="addCompany">Manage Company</a>
          <a href="stockexchangelist">Manage Exchange</a>
          <a href="ipoDetailsList">Update IPO details</a>
          <a href="login">Logout</a>
        </div>
        <div class="container">
            <h3 style="text-align: center;">List of Companies</h3><br>
            <table style="text-align:center;width:100%">
<tr style="font-weight:bold;color:red">

<td>Company name</td>
<td>Turn over</td>
<td>BriefWrite Up</td>
<td>Ceo</td>
<td>Action</td>

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>
<td><%= e.getCompanyCode() %></td>
<td><%= e.getCompanyName() %></td>
<td><%= e.getTurnOver() %></td>
<td><%= e.getBriefWriteup() %></td>
<td><%= e.getCeo() %></td>
<td><%=e.getSectorid() %>
<td><%= e.getBoardOfDirectors() %></td>
<td><%=e.getStockCode() %></td>
</tr>
<% }%>


</table></div>
            <section class="row">
                <img src="images/one.jfif" alt="company-one" class="img col-md-3">
                <p class="col-md-2 ptext">Company 1</p>
                <p class="col-md-2 ptext">BSE,NSE</p>
                <p class="col-md-3 ptext">Brief Writeup</p>
                <p class="col-md-2 ptext"><input type="button" name="save" value="Edit" class="edit"></p>
            </section>
            <br>
            <section class="row">
                <img src="images/two.jfif" alt="company-one" class="img col-md-3">
                <p class="col-md-2 ptext">Company 2</p>
                <p class="col-md-2 ptext">BSE</p>
                <p class="col-md-3 ptext">Brief Writeup</p>
                <p class="col-md-2 ptext"><input type="button" name="save" value="Edit" class="edit"></p>
            </section>
        </div>
    </div>
    <div class="footer"></div>
</body>

</html>