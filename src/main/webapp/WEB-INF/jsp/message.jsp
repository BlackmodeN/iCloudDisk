<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error</title>
</head>
<body>
	<script type="text/javascript">
		var time = 5; //时间,秒
		function Redirect() {
		    window.location = "${pageContext.request.contextPath}/index";
		}
		var i = 0;
		function dis() {
		    document.all.s.innerHTML = "****** 错误信息： ${globalmessage} ******   " + (time - i) + "秒后自动跳往主页";
		    i++;
		}
		timer = setInterval('dis()', 1000); //显示时间
		timer = setTimeout('Redirect()', time * 1000); //跳转
	</script>
      <span id="s"></span>
</body>
</html>