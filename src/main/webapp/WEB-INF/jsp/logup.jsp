<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
  <div><a href="${pageContext.request.contextPath}/requestin.action" >log in</a>  &nbsp;
       <a href="${pageContext.request.contextPath}/index.jsp" >首页</a> 
  </div>
   <center>
	   <form action="${pageContext.request.contextPath}/logup.action" method="post" style="margin: 200px">
	   <table>
	       <tr>
	          <td>用户名</td><td><input type="text" name="username" >${usernameerror}</td>
	       </tr>
	       <tr>
	          <td> 密码</td><td><input type="password" name="password" >${passworderror}</td>
	       </tr>
	       <tr>
	          <td><input type="submit" value="注册"></td>
	       </tr>
	   </table>
	   </form>
   </center>
</body>
</html>