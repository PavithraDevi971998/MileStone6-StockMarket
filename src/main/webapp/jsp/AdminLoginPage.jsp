<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<head>
	<title>stockMarket</title>
	<style>
            .button {
              color: white;
              padding: 10px;
              padding-left:25px;
            padding-right:25px;
              text-align: center;
              text-decoration: none;
              display: inline-block;
              font-size: 16px;
              margin: 4px 4px;
              cursor: pointer;
              color:black;
            }
            .button4 {border-radius: 55px;
            padding-right:200px;
            padding-bottom:15px;
            text-align:center;
            color:black;
            }
            .button5 {border-radius: 55px;
            padding-bottom:15px;
            padding-right:200px;
            text-align:center;
            
            }
            .button6 {border-radius: 12px;
            
            padding-bottom:10px;
            padding-right:70px;}
            .divide
            {
            width:1350px;
            text-align:center;
            margin-left:150px;
            }
            
            </style>
	
	</head>
	<body>
	<form name="login"  action="AdminLandingPage.html">
    
        <h1 style="text-align: center;padding-top: 200px;padding-bottom: 10px;">LOGIN</h1>
	<div class="divide">
	
    <hr width="50%"><br>
    
	<tr><th><h3>User Name</h3></th><td><input type="text" class="button button4" align="middle" name="User name" placeholder="User name"></button></td></tr><br>
	<tr><th><h3>Password</h3></th></th><td><input type="password" class="button button5" align="middle" name="Password" placeholder="password"></button></td></tr><br><br>
	<tr><button class="button button6" align="middle" >Login</button></tr><br>
	</div>
	</form>
	</body>
	</html>
