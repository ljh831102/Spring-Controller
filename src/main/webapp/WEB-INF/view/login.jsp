<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>用户登录</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btn_login').click(function(){
			$('#userForm').attr('action','${pageContext.request.contextPath }/user2/login');
			$('#userForm').attr('method','post');
			$('#userForm').submit();
		});
		
		$('#btn_register').click(function(){
			$('#userForm').attr('action','${pageContext.request.contextPath }/user2/register');
			$('#userForm').attr('method','post');
			$('#userForm').submit();
		});
		
	});
	

</script>
</head>
<body> 

<form id="userForm">
用户登录：
<table width="100%" border=1>
<tr>
	<td>用户名称</td>
	<td><input type="text" name="userName" value="${userCustom.userName }"/></td>
</tr>
<tr>
	<td>用户密码</td>
	<td><input type="password" name="userPassword" value="${userCustom.userPassword }"/></td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input id = "btn_login"  type="button" value="Login"/>&nbsp;&nbsp;&nbsp;
	<input id = "btn_register"  type="button" value="Register"/>
	</td>
</tr>
</table>
</form>
</body>
</html>