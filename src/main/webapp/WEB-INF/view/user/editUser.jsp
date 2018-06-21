<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>录入用户信息</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		
		var chkAll = $('#chkAll');
		var chkNone = $('#chkNone');
		var chkReverse = $('#chkReverse');
		var checkbox = $('#div_userHobbiesList :checkbox');

		
		chkAll.click(function(){
			checkbox.attr('checked',true);
			
		});

		chkNone.click(function(){
			checkbox.attr('checked',false);
		});

		chkReverse.click(function(){
			checkbox.each(function(){
				$(this).attr('checked',!$(this).attr('checked'));
			});
		});
		
		// 客户端发送JSON数据，服务器端返回JSON数据
		/*$('#userRegionProvinceCode').change(function(){
			var options=$("#userRegionProvinceCode option:selected");
			var selectUserRegionCityCode=$("#userRegionCityCode");
			var selectUserRegionCountyCode=$("#userRegionCountyCode");
			
			selectUserRegionCityCode.empty();
			selectUserRegionCountyCode.empty();
			selectUserRegionCityCode.append("<option>请选择</option>");
			selectUserRegionCountyCode.append("<option>请选择</option>");
			selectUserRegionCityCode.attr("disabled",false);
     		selectUserRegionCountyCode.attr("disabled",false);
			if(options.val() != null && options.val() != "请选择"){
					 var region = {
							"regionKind":"2",
							"regionProvinceCode":options.val()
					 };
					 $.ajax({ 
					     type : "POST", //提交方式 
					     async: true, //异步执行
					     url : "${pageContext.request.contextPath}/user/getRegion1",//路径 
					     contentType:"application/json;charset=utf-8",
					     //一定要写上JSON.stringify，不然报错
					     //Caused by: com.fasterxml.jackson.core.JsonParseException: Unrecognized token '——属性名————': 
					     //was expecting ('true', 'false' or 'null')
					     data : JSON.stringify(region), //数据，这里使用的是Json格式进行传输 
					     dataType:"json",
					     success : function(data) {//返回数据根据结果进行相应的处理 
				    		//把获取到的数据转换成对象。
							var result = eval(data);
							if(result.length ==0){
								selectUserRegionCityCode.attr("disabled",true);
					     		selectUserRegionCountyCode.attr("disabled",true);
					     	}
							for(var i=0;i<result.length;i++){
								selectUserRegionCityCode.append(
										"<option value='" + result[i].regionCityCode + "'>" + result[i].regionName + "</option>");
							}
					     } 
					  }); 
			}
		 });*/
		 
		 // 客户端发送key/value数据，服务器端返回JSON数据
		 $('#userRegionProvinceCode').change(function(){
			var options=$("#userRegionProvinceCode option:selected");
			var selectUserRegionCityCode=$("#userRegionCityCode");
			var selectUserRegionCountyCode=$("#userRegionCountyCode");
			
			selectUserRegionCityCode.empty();
			selectUserRegionCountyCode.empty();
			selectUserRegionCityCode.append("<option value='000'>请选择</option>");
			selectUserRegionCountyCode.append("<option value='000'>请选择</option>");
			selectUserRegionCityCode.attr("disabled",false);
     		selectUserRegionCountyCode.attr("disabled",false);
			if(options.val() != null && options.val() != "000"){
					 var region = "regionKind=2&regionProvinceCode="+ options.val();
					 $.ajax({ 
					     type : "POST", //提交方式 
					     async: true, //异步执行
					     url : "${pageContext.request.contextPath}/user2/getRegion2",//路径 
					     data : region, //数据，这里使用的是key/value格式进行传输 
					     success : function(data) {//返回数据根据结果进行相应的处理 
				    		//把获取到的数据转换成对象。
							var result = eval(data);
							if(result.length ==0){
								selectUserRegionCityCode.attr("disabled",true);
					     		selectUserRegionCountyCode.attr("disabled",true);
					     	}
							for(var i=0;i<result.length;i++){
								selectUserRegionCityCode.append(
										"<option value='" + result[i].regionCityCode + "'>" + result[i].regionName + "</option>");
							}
					     } 
					  }); 
			}
		 });
		 
		 //客户端发送JSON数据，服务器端返回JSON数据
		$('#userRegionCityCode').change(function(){
			var options01=$("#userRegionProvinceCode option:selected");
			var options02=$("#userRegionCityCode option:selected");
			var selectUserRegionCountyCode=$("#userRegionCountyCode");
			
			selectUserRegionCountyCode.empty();
			selectUserRegionCountyCode.append("<option value='000'>请选择</option>");
			selectUserRegionCountyCode.attr("disabled",false);
			if(options02.val() != null && options02.val() != "000"){
					var region = {
							"regionKind":"3",
							"regionProvinceCode":options01.val(),
							"regionCityCode":options02.val()
						 };
					 $.ajax({ 
					     type : "POST",//提交方式 
					     async: true, //异步执行
					     url : "${pageContext.request.contextPath}/user2/getRegion1",//路径 
					     contentType:"application/json;charset=utf-8",
					     data : JSON.stringify(region), //数据，这里使用的是Json格式进行传输 
					     dataType:"json",
					     success : function(data) {//返回数据根据结果进行相应的处理 
				    		//把获取到的数据转换成对象。
							var result = eval(data);
					     	if(result.length ==0){
					     		selectUserRegionCountyCode.attr("disabled",true);
					     	}
							for(var i=0;i<result.length;i++){
								selectUserRegionCountyCode.append(
										"<option value='" + result[i].regionCountyCode + "'>" + result[i].regionName + "</option>");
							}
					     } 
					  }); 
			}
		 });
		 
		 //check用户名称是否已经被使用
		$('#userName').blur(function(){
			var varobject = $('#userName');
			if(varobject.val() != null && varobject.val() != ""){
					 var queryString = "userName="+ varobject.val();
					 $.ajax({ 
					     type : "POST", //提交方式 
					     async: true, //异步执行
					     url : "${pageContext.request.contextPath}/user2/checkUser",//路径 
					     data : queryString, //数据，这里使用的是key/value格式进行传输 
					     success : function(data) {//返回数据根据结果进行相应的处理 
				    		//把获取到的数据转换成对象。
							var result = JSON.parse(data);
							if(result.used == "1"){
								$('#userName_error').html("用户名称已经被使用！");
					     	}else{
					     		$('#userName_error').html("");
					     	}
					     } 
					  }); 
			}
		 });
		 
		 //check手机号码是否被使用
		$('#userMobilephone').blur(function(){
			var varobject = $('#userMobilephone');
			if(varobject.val() != null && varobject.val() != ""){
					 var queryString = "userMobilephone="+ varobject.val();
					 $.ajax({ 
					     type : "POST", //提交方式 
					     async: true, //异步执行
					     url : "${pageContext.request.contextPath}/user2/checkUser",//路径 
					     data : queryString, //数据，这里使用的是key/value格式进行传输 
					     success : function(data) {//返回数据根据结果进行相应的处理 
				    		//把获取到的数据转换成对象。
							var result = JSON.parse(data);
							if(result.used == "1"){
								$('#userMobilephone_error').html("手机号码已经被使用！");
					     	}else{
					     		$('#userMobilephone_error').html("");
					     	}
					     } 
					  }); 
			}
		 });
		 
		 //当生年月日check错误时，加上error class
		 if($('#label_userBirthday').hasClass('error') == true){
			 $('#input_userBirthday').addClass('error');
		 }
		 
		 //增加图片选择按钮
		 $("#btn_addpic").click(function(){  
			 $('#div_pic').append(
					"<div><input type='file' name='pictureFile'/><input type='button' value='删除'"
					+ " onclick='javascript:this.parentNode.parentNode.removeChild(this.parentNode);'/></div> ");
	     }); 
		 
	});
	

</script>
</head>
<body> 

<form:form id="userForm" commandName="userCustom">
<form:hidden path="userId"/>
用户信息：
<!--<form:errors path="*" element="div" cssClass="errors" />-->
<table style="width: 100%;" border=1>
<tr>
	<td width="150px"><form:label path="userName" cssErrorClass="error">用户名称  *</form:label></td>
	<td><form:input path="userName"  cssErrorClass="error"/>
		<form:errors path="userName"  cssClass="error" />
		<label id="userName_error" class="error"></label></td>
</tr>
<tr>
	<td><form:label path="userPassword" cssErrorClass="error">用户密码  *</form:label></td>
	<td><form:password path="userPassword"  cssErrorClass="error"/>
		<form:errors path="userPassword"  cssClass="error" />
		<label id="userPassword_error" class="error"></label></td>
</tr>
<tr>
	<td><form:label path="userConfirmation" cssErrorClass="error">确认密码  *</form:label></td>
	<td><form:password path="userConfirmation" cssErrorClass="error"/>
		<form:errors path="userConfirmation"  cssClass="error" />
		<label id="userConfirmation_error" class="error"></label></td>
</tr>
<tr>
	<td><form:label path="userBirthday" cssErrorClass="error" id="label_userBirthday">生年月日 *</form:label></td>
	<td><input type="date" id="input_userBirthday" name="userBirthday" 
		value="<fmt:formatDate value='${userCustom.userBirthday}' type='date' pattern='yyyy-MM-dd'/>"/>
		<form:errors path="userBirthday"  cssClass="error" />
		<label id="userBirthday_error" class="error"></label></td>
</tr>
<tr>
	<td>性别  *</td>
	<td>
		<form:radiobuttons path="userSex" items="${userCustom.userSexMap}" delimiter="&nbsp;"/>
	</td>
</tr>
<tr>
	<td><form:label path="userMobilephone" cssErrorClass="error">手机号码  *</form:label></td>
	<td><form:input path="userMobilephone" cssErrorClass="error"/>
		<form:errors path="userMobilephone"  cssClass="error" />
		<label id="userMobilephone_error" class="error"></label></td>
</tr>
<tr>
	<td>用户图片</td>
	<td>
		<form:hidden path="userImg"/>
		<c:if test="${not empty userCustom.userImg}">
			<c:forTokens items="${userCustom.userImg}" delims="," var="item" >
				<img src="/pic/${item}" style="width:100px;height:100px"/>
			</c:forTokens>
		</c:if>
		<div id="div_pic">
				<input type="file"  name="pictureFile"/>
		</div>
		<div>
		<input type="button" id="btn_addpic" value="增加图片"></div>
	</td>
</tr>
<tr>
	<td>兴趣爱好 </td>
	<td>
	<div id="div_userHobbiesList">
		<form:hidden path="userHobbies"/>
		<form:checkboxes items="${userCustom.userHobbiesMap}" path="userHobbiesList"/>
		<div id="btn_userHobbiesList">
				<input type="button" id="chkAll" value="全选" />
				<input type="button" id="chkNone" value="全不选" />
				<input type="button" id="chkReverse" value="反选" />
		</div>
	</div>
	</td>
</tr>
<tr>
	<td>用户地址 </td>
	<td>
		<form:select path="userRegionProvinceCode">  
             <option value="000">请选择</option>  
             <form:options items="${userCustom.userRegionProvinceCodeList}" itemLabel="regionName" itemValue="regionProvinceCode"/>  
         </form:select>
         <form:select path="userRegionCityCode">  
             <option value="000">请选择</option>  
             <form:options items="${userCustom.userRegionCityCodeList}" itemLabel="regionName" itemValue="regionCityCode"/>  
         </form:select>
         <form:select path="userRegionCountyCode">  
             <option value="000">请选择</option>  
             <form:options items="${userCustom.userRegionCountyCodeList}" itemLabel="regionName" itemValue="regionCountyCode"/>  
         </form:select>
	</td>
</tr>
<tr>
	<td>详细地址</td>
	<td><form:input  path="userAddressdetail"/></td>
</tr>
<tr>
	<td>用户邮箱</td>
	<td>
		<input name="userEmail" type="email" value="${userCustom.userEmail}"/>
	</td>
</tr>
<tr>
	<td>喜欢颜色</td>
	<td>
	<input name="userFavoritecolor" type="color" value="${userCustom.userFavoritecolor}"/>
	</td>
</tr>
<tr>
	<td>用户收入</td>
	<td>
	<input name="userSalary" type="number" value="${userCustom.userSalary}" min="0" max="10000" step="1000"/>
	</td>
</tr>
<tr>
	<td>喜欢网址</td>
	<td>
	<input name="userFavoriteurl" type="url" value="${userCustom.userFavoriteurl}"/>
	</td>
</tr>
<tr style="height: 40px;">
	<td>用户等级</td>
	<td>
	<input name="userGrade" type="range" value="${userCustom.userGrade}" min="0" max="10" step="1"/>
	</td>
</tr>
<tr>
	<td>用户描述</td>
	<td>
	<form:textarea path="userDetail" rows="3" cols="20"/>
	</td>
</tr>
<tr>
<td colspan="2" align="center">
<input id = "btn_back"  type="submit" value="Back"
	formaction="${pageContext.request.contextPath }/" formmethod="get"/>&nbsp;&nbsp;&nbsp;
<c:choose>
	<c:when test="${empty userCustom.userId || userCustom.userId == 0}">
		<input id = "btn_add" type="submit" value="Add"
			formaction="${pageContext.request.contextPath }/user2/add" formmethod="post" formenctype="multipart/form-data"/>
	</c:when>
	<c:otherwise>
		<input id = "btn_update" type="submit" value="Update"
					formaction="${pageContext.request.contextPath }/user/update" formmethod="post" formenctype="multipart/form-data"/>
	</c:otherwise>
</c:choose>
</td>
</tr>
</table>
</form:form>
</body>
</html>