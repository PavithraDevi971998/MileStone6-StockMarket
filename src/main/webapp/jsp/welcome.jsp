<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>welcome to Movie Cruiser</title>
  <style>
  .header {
    background-color:rgb(61, 130, 242);
    color: white;
    width: 100%;
    height: auto;
}

#s {
    float: right;
    color: white;
    display: inline-block;
    width: auto;
    height: auto;
    color: white;
    margin-right: 250px;
    font-size: 25px;
}

#n {
    width: 400px;
    height: auto;
    font-size: 30px;
    color: white;
    margin-left: 100px;
    display: inline-block;
}
.footer {
    width: 100%;
    height: 50px;
    background-color: #b3b3b3;
    bottom: 0;
    position: fixed;
}
  </style>
</head>
<body>
        <div class="header">
            <p id="n">Stock Market Charting</p>
            <p id=s><a href="/login" id=a>Admin</a>
                <a href="/login" id=a>User</a></p></div>
        </div>
         <form:form method="POST" action="/welcome" modelAttribute="welcome">
         </form:form>
        <div class="footer">
            <p >Copyright&copy; 2019
        </div>
        
    </body>
</html>