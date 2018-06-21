<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#search').click(function(){
			$('#itemsForm').attr('action','${pageContext.request.contextPath }/items/search');
			$('#itemsForm').attr('method','post');
			$('#itemsForm').submit();
		});
		
		$('#reset').click(function(){
			$('#itemsForm').attr('action','${pageContext.request.contextPath }/items/reset');
			$('#itemsForm').attr('method','get');
			$('#itemsForm').submit();
		});
		
		$('#add').click(function(){
			$('#itemsForm').attr('action','${pageContext.request.contextPath }/items/edit');
			$('#itemsForm').attr('method','post');
			$('#itemsForm').submit();
		});
	});
</script>
</head>
<body> 
<form id="itemsForm">
<table width="100%" border=1>
<tr>
	<td>语言</td>
    <td><a href="${pageContext.request.contextPath }/items/?lang=zh_CN">中文</a> &nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath }/items/?lang=en_US">English</a></td>
    <td>用户名</td>
    <td><c:out value="${loginUserCustom.userName}" />
    <a href="${pageContext.request.contextPath }/user/edit/${loginUserCustom.userId}">用户修改</a>
    <a href="${pageContext.request.contextPath }/user/logout">LogOut</a>
    </td>
</tr>   
</table>
<hr/>
查询条件：
<spring:hasBindErrors name="items">  
	<hr/>
    <c:if test="${errors.fieldErrorCount > 0}">  
        字段错误：<br/>  
        <c:forEach items="${errors.fieldErrors}" var="error">  
            <spring:message var="message" code="${error.code}" arguments="${error.arguments}" text="${error.defaultMessage}"/>  
            ${error.field}------${message}<br/>  
        </c:forEach>  
    </c:if>  
  
    <c:if test="${errors.globalErrorCount > 0}">  
        全局错误：<br/>  
        <c:forEach items="${errors.globalErrors}" var="error">  
            <spring:message var="message" code="${error.code}" arguments="${error.arguments}" text="${error.defaultMessage}"/>  
            <c:if test="${not empty message}">  
                ${message}<br/>  
            </c:if>  
        </c:forEach>  
    </c:if>  
    <hr/>
</spring:hasBindErrors>  
<table width="100%" border=1>
<tr>
<td>商品名称：<input type="text" name="items_name" value="${items.items_name}"/></td>
<td><input id="search" type="button" value="Search"/></td>
<td><input id="reset" type="button" value="Reset"/></td>
<td><input id="add" type="button" value="Add"/></td>
</tr>
</table>
商品列表：
<table width="100%" border=1>
<tr>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>适用人群</td>
	<td>销售级别</td>
	<td>商品种类</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemsQueryVo.itemsCustomVoList }" var="itemsCustomVo">
<tr>
	<td>
		<c:out value="${itemsCustomVo.itemsName}" />
	</td>
	<td>
		<fmt:formatNumber value='${itemsCustomVo.itemsPrice}' type='number' pattern='#,###.00'/>
	</td>
	<td>
		<fmt:formatDate value='${itemsCustomVo.itemsCreatetime}' type='date' pattern='yyyy-MM-dd'/>
	</td>
	<td>
		<c:out value="${itemsCustomVo.itemsDetail}" />
	</td>
	<td>
		<c:out value="${itemsCustomVo.view_itemsFitpeople}" />
	</td>
	<td>
		<c:out value="${itemsCustomVo.view_itemsSellinglevel}" />
	</td>
	<td>
		<c:out value="${itemsCustomVo.view_itemsItemtype}" />
	</td>
	<td><a href="${pageContext.request.contextPath }/items/edit?items_id=${itemsCustomVo.itemsId}">修改</a></td>
</tr>
</c:forEach>
</table>  
</form>
</body>
</html>