<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>录入商品信息</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/ajaxfileupload.js"></script>
<script type="text/javascript">
	$(function(){
		$('#btn_update').click(function(){
			$('#itemForm').attr('action','${pageContext.request.contextPath }/items/update');
			$('#itemForm').attr('method','post');
			$('#itemForm').attr('enctype','multipart/form-data');
			$('#itemForm').submit();
		});
		
		$('#btn_delete').click(function(){
			$('#itemForm').attr('action','${pageContext.request.contextPath }/items/delete');
			$('#itemForm').attr('method','post');
			$('#itemForm').submit();
		});
		
		$('#btn_add').click(function(){
			$('#itemForm').attr('action','${pageContext.request.contextPath }/items/add');
			$('#itemForm').attr('method','post');
			$('#itemForm').attr('enctype','multipart/form-data');
			$('#itemForm').submit();
		});
		
		$('#btn_back').click(function(){
			$('#itemForm').attr('action','${pageContext.request.contextPath }/items/initial');
			$('#itemForm').attr('method','get');
			$('#itemForm').submit();
		});
		
		var chkAll = $('#chkAll');
		var chkNone = $('#chkNone');
		var chkReverse = $('#chkReverse');
		var checkbox = $('#div_fitpeople>:checkbox');

		chkAll.click(function(){
			// checkbox.attr('checked','checked');
			checkbox.attr('checked',true);
		});

		chkNone.click(function(){
			// checkbox.removeAttr('checked');
			checkbox.attr('checked',false);
		});

		chkReverse.click(function(){
			checkbox.each(function(){
				$(this).attr('checked',!$(this).attr('checked'));
			});
		});
			
		/*jquery对input file控件的onchange事件进行监听，就一直只生效一次。

	    1.原始方法：把事件写在file控件的onchange=""里面；
	    2.Jquery方法一: $('#fileId').live('change',function(){ //逻辑添加.... });
	    3.Jquery方法二: onchange后，生成一个新input type file代替旧的，
	       $('#inputFileID').replaceWith('<input name="fileToUpload" type="file" id="inputFileID"  />');
		*/
		$('#btn_detailpic').live('change',
				function(){  
			ajaxFileUpload(); });
		
        function ajaxFileUpload() {
            $.ajaxFileUpload
            ({
                    url: '${pageContext.request.contextPath}/items/uploadDetailpic?inputId=btn_detailpic', //用于文件上传的服务器端请求地址
                    secureuri: false, //是否需要安全协议，一般设置为false
                    fileElementId: 'btn_detailpic', //文件上传域的ID
                    dataType: 'content', //一定要设置为content，不然无法进入success函数
                    success: function (data, status)  //服务器成功响应处理函数
                    {
                    	var result = JSON.parse(data);
                    	
                    	//页面添加img显示已经保存的图片
                    	$("#div_detailpic>ul").append("<li><img class='show_pic' src='/pic/" + result.newFileName +
                    			"' style='width:100px;height:100px'/>" + 
                    			"<img class='delete_pic' src='${pageContext.request.contextPath}/assets/images/selectbutton.png'/></li>");
                    	
                    	//为了最终把图片信息保存在数据库
                    	var input_detailpic_value = $("#input_detailpic").val();
                    	if(input_detailpic_value != null && input_detailpic_value !=""){
                    		input_detailpic_value = input_detailpic_value + ",";
                    	}
                    	input_detailpic_value = input_detailpic_value + result.newFileName;
                    	
                    	$("#input_detailpic").val(input_detailpic_value);
                    	
                    },
                    error: function (data, status, e)//服务器响应失败处理函数
                    {
                        alert(e);
                    }
            });
            
            return false;
        }
        
        //文件删除
        function ajaxFileDelete(strFile) {
        	if(strFile != null && strFile != ""){
				 var region = "delete_file_name="+strFile;
				 $.ajax({ 
				     type : "POST", //提交方式 
				     async: true, //异步执行
				     url : "${pageContext.request.contextPath}/items/deletePic",//路径 
				     data : region, //数据，这里使用的是key/value格式进行传输 
				     success : function(data) {//返回数据根据结果进行相应的处理 
				     } 
				  }); 
			}
            return false;
        }
        
        //为了给新添加控件也适用事件，故用live
        $(".show_pic").live('click',function(){
            if($(this).parent().find(".delete_pic").css("display") == "none"){   
                //选中图片
            	$(this).parent().css("border-color","#33FF00").find(".delete_pic").show();
                //让删除图片按钮活性化
                $("#btn_detailpic_delete").removeAttr("disabled");
                //让下载图片按钮活性化
                $("#btn_detailpic_download").removeAttr("disabled");
            }else{  
            	//解除选中
                $(this).parent().css("border-color","#fff").find(".delete_pic").hide();
                //如果已经没有被选中的图片，则让删除图片按钮非活性
                $("#btn_detailpic_delete").attr("disabled","disabled");
                //如果已经没有被选中的图片，则让下载图片按钮非活性
                $("#btn_detailpic_download").attr("disabled","disabled");
                $(".show_pic").each(function(){
                	if($(this).parent().find(".delete_pic").css("display") != "none"){
                		$("#btn_detailpic_delete").removeAttr("disabled");
                		//让下载图片按钮活性化
                        $("#btn_detailpic_download").removeAttr("disabled");
                	}
                });
            }    
     	}); 
        
        //增加图片按钮按下时，打开文件选择框
        $("#btn_detailpic_add").click(function(){
        	$('#btn_detailpic').click();
        });
        
        //删除图片按钮按下时，删除选中的图片
        $("#btn_detailpic_delete").click(function(){
        	
        	var delete_file_name ="";
        	$(".show_pic").each(function(){
        		if($(this).parent().find(".delete_pic").css("display") != "none"){
        			if(delete_file_name != null && delete_file_name !=""){
        				delete_file_name = delete_file_name + ",";
        			}
        			delete_file_name = delete_file_name + $(this).attr("src").substring(5);
        			
        			//相应修改最后要更新数据库的图片名字符串
        			var input_detailpic_value = $("#input_detailpic").val();
        			input_detailpic_value = input_detailpic_value.replace(
        					$(this).attr("src").substring(5),"").replace(",,",",");
        			
        			//删除的第一张图片时，需要把最前面的逗号去除
        			if(input_detailpic_value.length > 0 && input_detailpic_value.substring(0,1) == ","){
        				input_detailpic_value = input_detailpic_value.substring(1);
        			}
        			
        			//删除的最后一张图片时，需要把最后面的逗号去除
        			if(input_detailpic_value.length > 0 && input_detailpic_value.substring(input_detailpic_value.length-1) == ","){
        				input_detailpic_value = input_detailpic_value.substring(0,input_detailpic_value.length-1);
        			}
        			
                	$("#input_detailpic").val(input_detailpic_value);
                	
        			$(this).parent().remove();
        			
        			//删除文件
        			ajaxFileDelete(delete_file_name);
        		}
        	});
        	//如果已经没有被选中的图片，则让下载图片按钮非活性
            $("#btn_detailpic_download").attr("disabled","disabled");
        	//使删除按钮非活性
        	$("#btn_detailpic_delete").attr("disabled","disabled");
        });
        
        //下载图片按钮按下时，下载选中的图片（页面无刷新）
        $("#btn_detailpic_download").click(function(){
        	var selectedFileNum = 0;
        	var download_file_name ="";
        	
        	$(".show_pic").each(function(){
        		if($(this).parent().find(".delete_pic").css("display") != "none"){
        			selectedFileNum += 1;
        			download_file_name = $(this).attr("src").substring(5);
        		}
        	});
        	
        	if(selectedFileNum >1){
        		alert("一次只能下载一张图片！");
        		return false;
        	}else{
	        	$('#itemForm').attr('action','${pageContext.request.contextPath }/items/downloadPic?download_file_name=' + download_file_name);
				$('#itemForm').attr('method','post');
				$('#itemForm').submit();
        	}
        });
	});
</script>
</head>
<body> 

<form id="itemForm">
<input type="hidden" name="itemsId" value="${itemsCustom.itemsId }"/>
商品信息：
<spring:hasBindErrors name="itemsCustom">  
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
	<td width="150px">商品名称  *</td>
	<td><input type="text" name="itemsName" value="${itemsCustom.itemsName }"/></td>
</tr>
<tr>
	<td>商品价格  *</td>
	<td><input type="text" name="itemsPrice" value="<fmt:formatNumber value='${itemsCustom.itemsPrice}' type='number' pattern='#,##0.00'/>"/></td>
</tr>
<tr>
	<td>商品生产日期  *</td>
	<td><input type="text" name="itemsCreatetime" value="<fmt:formatDate value='${itemsCustom.itemsCreatetime}' type='date' pattern='yyyy-MM-dd'/>"/></td>
</tr>
<tr>
	<td>商品图片</td>
	<td>
		<input type="hidden" name="itemsPic" value="${itemsCustom.itemsPic }" />
		<c:if test="${not empty itemsCustom.itemsPic}">
			<img src="/pic/${itemsCustom.itemsPic}" style="width:100px;height:100px"/>
			<br/>
		</c:if>
		<input type="file"  name="pictureFile"/> 
	</td>
</tr>
<tr>
	<td>详细图片</td>
	<td>
		<input id="input_detailpic" type="hidden" name="itemsDetailpic" value="${itemsCustom.itemsDetailpic }" />
		<div id="div_detailpic" class="pic_box">
			<ul>
				<c:if test="${not empty itemsCustom.itemsDetailpic}">
					<c:forTokens items="${itemsCustom.itemsDetailpic}" delims="," var="item" >
						<li>
							<img class="show_pic" src="/pic/${item}" style="width:100px;height:100px"/>
							<img class="delete_pic" src="${pageContext.request.contextPath}/assets/images/selectbutton.png"/>
						</li>
					</c:forTokens>
				</c:if>
			</ul>
		</div>
		<div style="clear: both;">
			<input id="btn_detailpic" type="file"  name="btn_detailpic" style="display: none;"/>
			<input id="btn_detailpic_add" type="button" value="增加图片"/>
			<input id="btn_detailpic_delete" type="button" value="删除图片" disabled="disabled"/>
			<input id="btn_detailpic_download" type="button" value="下载图片(页面无刷新)" disabled="disabled"/>
		</div>
	</td>
</tr>
<tr>
	<td>商品描述</td>
	<td>
	<textarea rows="3" cols="30" name="itemsDetail" >${itemsCustom.itemsDetail }</textarea>
	</td>
</tr>
<tr>
	<td>适用人群  *</td>
	<td>
		<div id="div_fitpeople">
			<input type="checkbox" name="itemsFitpeople" value="01" 
		    <c:if test="${fn:contains(itemsCustom.itemsFitpeople,'01')}">checked="checked"</c:if>/>男人
		    <input type="checkbox" name="itemsFitpeople" value="02"  
		    <c:if test="${fn:contains(itemsCustom.itemsFitpeople,'02')}">checked="checked"</c:if>/>女人
		    <input type="checkbox" name="itemsFitpeople" value="03" 
		    <c:if test="${fn:contains(itemsCustom.itemsFitpeople,'03')}">checked="checked"</c:if>/>小孩
		    <div id="btn_fitpeople">
				<input type="button" id="chkAll" value="全选" />
				<input type="button" id="chkNone" value="全不选" />
				<input type="button" id="chkReverse" value="反选" />
			</div>
		</div>
	</td>
</tr>
<tr>
	<td>销售级别  *</td>
	<td>
		<input type="radio" name="itemsSellinglevel" value="01" id="sellinglevel_01" 
	   		<c:if test="${itemsCustom.itemsSellinglevel=='01'|| empty itemsCustom.itemsSellinglevel}">checked="checked"</c:if>/><label for="sellinglevel_01">特销品</label>
	   <input type="radio" name="itemsSellinglevel" value="02" id="sellinglevel_02" 
	   		<c:if test="${itemsCustom.itemsSellinglevel=='02'}">checked="checked"</c:if>/><label for="sellinglevel_02">畅销品</label>
	   <input type="radio" name="itemsSellinglevel" value="03" id="sellinglevel_03" 
	   		<c:if test="${itemsCustom.itemsSellinglevel=='03'}">checked="checked"</c:if>/><label for="sellinglevel_03">滞销品</label>
	</td>
</tr>
<tr>
	<td>商品种类  *</td>
	<td>
		<select name="itemsItemtype" style="vertical-align:top;width: 120px;">
			<c:forEach items="${itemtypes }" var="var_itemtype">
				<option value="${var_itemtype.key }" 
					<c:if test="${var_itemtype.key eq itemsCustom.itemsItemtype}">selected</c:if>> ${var_itemtype.value }</option>		
			</c:forEach>
		</select>
	</td>
</tr>
<tr>
<td colspan="2" align="center">
<input id = "btn_back"  type="button" value="Back"/>&nbsp;&nbsp;&nbsp;
<c:choose>
	<c:when test="${empty itemsCustom.itemsId || itemsCustom.itemsId == 0}">
		<input id = "btn_add" type="button" value="Add"/>
	</c:when>
	<c:otherwise>
		<input id = "btn_delete"  type="button" value="Delete"/>&nbsp;&nbsp;&nbsp;
		<input id = "btn_update" type="button" value="Update"/>
	</c:otherwise>
</c:choose>
</td>
</tr>
</table>
</form>
</body>
</html>