<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
    th {
      text-align: left;
      padding: 10px;

    }

    .butn {
      width: 90%;
      height: 30px;
    }

  </style>
</head>

<body>
  <div class="head">
    <marquee>Stock Market Charting</marquee>
  </div>
  <p style="text-align: center;font-size: 32px;">Admin -Upload Excel to import Data</p><br>
  
  <div class="bord"><br>
    
    <div class="topnav">
      <a href="companyList">Import Data</a>
          <a href="addCompany">Manage Company</a>
          <a href="stockexchangelist">Manage Exchange</a>
          <a href="addIpodetails">Update IPO details</a>
          <a href="login">Logout</a>
    </div>
    <div style="margin-left: 50px;padding-top: 75px;">
      <h3 style="text-align: center;">Summary of Upload</h3>
      <table>
        <tr>
          <th> Company Name</th>
          <td>Abc LTD</td>
        </tr>
        <tr>
          <th>Stock Exchange</th>
          <td>BSE(Bombay Stock Exchange)</td>
        </tr>
        <tr>
          <th> No.of Recorde Imported</th>
          <td>80</td>
        </tr>
        <tr>
          <th>From Period</th>
          <td>To Period</th>
          <td></td>
        </tr>
        <tr>
          <th><input type="button" class="butn" name="save" value="OK"></th>
        </tr>
      </table>

    </div>
  </div>
  <div class="footer"></div>
</body>

</html>