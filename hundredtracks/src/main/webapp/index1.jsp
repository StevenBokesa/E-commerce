<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="eng">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-compatible" content="IE=edge" />
        <meta name="viewpoint" content="width=device-width, initial-scale=1.0" />
		<link href="assets/css/login.css" rel="stylesheet" />
		<script type="text/javascript" src="assets/css/javascript.js"></script>
        <title>Game Rental Company</title>
    </head>

<body> 
<div class="logo"><img alt="logo" src="assets/images/sllogo.png"></div>
  <div class="login-page">
    <div class="form">
      <form class="login-form" action="profile/controller/SignInController.jsp" >
        <input type="text" placeholder="username" name="username"/>
        <input type="password" placeholder="password" name="password"/>
        <button>login</button>
        <p class="message">Not registered? <a href="Registration.jsp">Create an account</a></p>
      </form>
    </div>

	<%  String message =(String)session.getAttribute("login_message"); 
    String failedLogin;
     if(message!=null){
		out.println(message);
		session.removeAttribute("login_message");
     }
    %>
</div>
<footer>
	</footer>
		

</body>
</html>
