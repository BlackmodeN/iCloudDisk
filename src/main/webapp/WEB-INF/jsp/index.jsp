<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>iCloud云网盘</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">

<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/nav.css">

</head>
<body>

	<div id="top-image">
	<nav class="top-right">
	<a class="disc l1" href="${pageContext.request.contextPath}/login">
		<div>登陆</div>
	</a>
	<a class="disc l2" href="${pageContext.request.contextPath}/login#toregister">
		<div>注冊</div>
	</a>
	<a class="disc l3" href="${pageContext.request.contextPath}/searchUserfile">
		<div>用户主页</div>
	</a>
	<a class="disc l4" href="${pageContext.request.contextPath}/help">
		<div>Help</div>
	</a>
	<a class="disc l5 toggle">
		Menu
	</a>
</nav>
		<div id="content" class="container center-block">
			<div class="jumbotron">
				<div class="container">
					<h1>iCloud</h1>
					<p>这是一个兴趣使然的免费个人网盘。欢迎保存和分享。</p>
					<form action="${pageContext.request.contextPath}/searchFile"
						method="post">
						<div class="input-group input-group-lg">
							<span class="input-group-addon" id="sizing-addon1"><span
								class="glyphicon glyphicon-plus" aria-hidden="true"></span></span> <input
								type="text" name="searchcontent" class="form-control"
								placeholder="输入关键词" aria-describedby="sizing-addon1" /> <span
								class="input-group-btn">
								<button class="btn btn-default" type="submit">搜 索</button>
							</span>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
<script src="js/jquery.min.js"></script>

	<script src="js/ios-parallax.js"></script>
	<script src="js/nav.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#top-image').iosParallax({
				movementFactor : 50
			});
		});
	</script>

</body>
</html>