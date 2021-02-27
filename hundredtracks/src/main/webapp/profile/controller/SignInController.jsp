<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Login_Model" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Game Rental Company</title>
</head>
<body>
<jsp:useBean id="obj_Login_Bean" class="bean.Login_Bean"></jsp:useBean>
<jsp:setProperty property="*" name="obj_Login_Bean" />
<%
	System.out.println(obj_Login_Bean.getUsername());
    System.out.println(obj_Login_Bean.getPassword());

    Login_Model obj_Login_Model = new Login_Model();
    
    boolean flag= obj_Login_Model.check_user_name(obj_Login_Bean);
    
    if(flag){
    	   %>
    	    
    	    <script type="text/javascript">
    	     window.location.href = "http://localhost:8080/FridayAndCo/index.jsp";
    	    </script>
    	    <%
    }
    else{
    	out.println(flag + " login failed");
   
    	session.setAttribute("login_message", "Log in failed. Username and password is wrong");
    %>
    
    <script type="text/javascript">
     window.location.href = "http://localhost:8080/FridayAndCo/Index.jsp";
    </script>
    <%
    }
%>
</body>
</html>