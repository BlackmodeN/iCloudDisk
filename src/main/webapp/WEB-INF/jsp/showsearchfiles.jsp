<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>iCloud搜索结果</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>

	<a href="${pageContext.request.contextPath}/index">首页</a>
	<div style="text-align: center">
		<style type="text/css">
.even {
	background-color: pink
}

.old {
	background-color: yellow
}
</style>

		<br /> <font size="60px">iCloud搜索结果</font><br /> <br />

		<table class="table table-hover table-borderless" frame="border"
			width="100%" align="center">
			<thead class="thead bg-info">
				<tr>
					<th scope="col">文件名</th>
					<th scope="col">文件大小</th>
					<th scope="col">创建日期</th>
					<th scope="col">下载文件</th>
				</tr>
			</thead>

			<c:forEach var="c" items="${requestScope.pagebean.list}"
				varStatus="stat">
				<tr class="table-success">
					<td>${c.filename }</td>
					<td>${c.filesize }kb</td>
					<td>${c.createtime }</td>
					<td><a class="btn btn-success"
						href="${pageContext.request.contextPath}/download.action?id=${c.id }&filename=${c.filename }">下载</a>
					</td>
				<tr>
			</c:forEach>

		</table>
		<br /> 共[${requestScope.pagebean.totalrecord}]条记录, 每页 <input
			type="text" id="pagesize" value="${pagebean.pagesize }"
			onchange="gotopage(${pagebean.currentpage})" style="10px"
			maxlength="5">条 共[${requestScope.pagebean.totalpage}]页,
		当前是第[${requestScope.pagebean.currentpage}]页, <a class="btn btn-outline-primary"
			href="javascript:void(0)" onclick="gotopage(1)">回到首页</a> <a class="btn btn-outline-success"
			href="javascript:void(0)"
			onclick="gotopage(${requestScope.pagebean.previouspage})">上一页</a>
		<c:forEach var="pagenum" items="${requestScope.pagebean.pagebar}">
			<c:if test="${pagenum==pagebean.currentpage }">
				<font color="red">${pagenum }</font>
			</c:if>
			<c:if test="${pagenum!=pagebean.currentpage }">
				<a href="javascript:void(0)" onclick="gotopage(${pagenum})">${pagenum}</a>
			</c:if>
		</c:forEach>
		<a href="javascript:void(0)" class="btn btn-outline-success"
			onclick="gotopage(${requestScope.pagebean.nextpage})">下一页</a> <input
			class="btn btn-outline-info" type="button" value="跳转至第"
			onclick="gotopage1(document.getElementById('pagenum').value)" /> <input
			type="text" style="10px" maxlength="5" id="pagenum">页 <input
			type="hidden" id="searchcontent" value="${searchcontent}">

		<script type="text/javascript">
      function gotopage(currentpage){
    	  
    	  var pagesize = document.getElementById("pagesize").value;
    	  var searchcontent = document.getElementById("searchcontent").value;
    	  
    	  if(pagesize > 10 || pagesize >= ${pagebean.totalrecord - pagebean.pagesize * ( pagebean.currentpage - 1 )}){
    		  pagesize = Math.min(pagesize,${pagebean.totalrecord});
    		  currentpage = 1 ;
    	  }else if(pagesize < 1){
    		  pagesize = 1;
    	  }
    	  
    	  window.location.href = '${pageContext.request.contextPath}/listfiles.action?currentpage='+currentpage+'&pagesize='+ pagesize+'&searchcontent='+searchcontent;
      }
  
      function gotopage1(currentpage){
    	  
    	  var pagesize = document.getElementById("pagesize").value;
    	  var searchcontent = document.getElementById("searchcontent").value;
    	  
    	  if(currentpage > ${pagebean.totalpage}){
    		  currentpage = ${pagebean.totalpage};
    		  pagesize = ${pagebean.pagesize};
    	  }else if(currentpage < 1){
    		  currentpage = 1 ;
    		  pagesize = ${pagebean.pagesize};
    	  }
    	  
    	  window.location.href = '${pageContext.request.contextPath}/listfiles.action?currentpage='+currentpage+'&pagesize='+ pagesize+'&searchcontent='+searchcontent;
      }
  </script>
	</div>
</body>
</html>
