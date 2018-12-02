<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/Head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>系统信息</title>
<link rel="stylesheet" href="${basepath}/css/pintuer.css">
<style type="text/css">
*{ margin:0px; padding:0px;}
.error-container{ background:#fff; border:1px solid #0ae;  text-align:center; width:450px; margin:250px auto; font-family:Microsoft Yahei; padding-bottom:30px; border-top-left-radius:5px; border-top-right-radius:5px;  }
.error-container h1{ font-size:16px; padding:12px 0; background:#0ae; color:#fff;} 
.errorcon{ padding:35px 0; text-align:center; color:#0ae; font-size:18px;}
.errorcon i{ display:block; margin:12px auto; font-size:30px; }
.errorcon span{color:red;}
h4{ font-size:14px; color:#666;}
a{color:#0ae;}
</style>
</head>
<body class="no-skin">
<div class="error-container"> 
    <h1> 邮箱注册激活</h1>   
    <div class="errorcon">     
        <i class="icon-smile-o"></i>您好，${userName } 请修改密码
        <input id="eid" type="hidden" value="${employeeId }">
    <form action="${basepath }/sm/employee/active/${employeeId}" onsubmit="return checkForm()">   
        <input type="hidden" name="_method" value="PUT"/><br/>
       
                          旧密码：&nbsp;&nbsp;&nbsp;<input id="op" type="password" name="oldPassword" required="required"><br/>
       <span id="opr"></span><br/>
                          新密码：&nbsp;&nbsp;&nbsp;<input id="newPassword" type="password" name="newPassword" required="required"><br/><br/>
                          确认密码：<input id="confirmPassword" type="password" name="confirmPassword" required="required"><br/>
       <span id="same"></span><br/>
       <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
  	</form>
   </div>
    
   
</div>
<script src="${basepath }/js/jquery-3.1.1.js"></script>
<script>

var submit=false;
var opr=false;
var same=false;
var eid=$("#eid").val();

$("#op").blur(function(){
	var op=$("#op").val();
	$.ajax({
		url:"${basepath}/sm/employee/checkOldPassword",
		data:{"employeeId":eid,
			"oldPassword":op},
		dataType:"json",
		type:"GET",
		success:function(data){
			if(data=="success"){
				opr=true;
				$("#opr").html("");
			}
			else{
				opr=false;
				$("#opr").html("旧密码不正确");
			}
		},
		error:function(data){
			alert("请求失败");
		}
	
	});
});
$("#newPassword").keyup(function(){
	var np=$("#newPassword").val();
	var cp=$("#confirmPassword").val();
	if(np==cp){
		same=true;
		$("#same").html("");
	}
	else{
		same=false;
		$("#same").html("两次密码不一致");
	}
});
$("#confirmPassword").keyup(function(){
	var np=$("#newPassword").val();
	var cp=$("#confirmPassword").val();
	if(np==cp){
		same=true;
		$("#same").html("");
	}
	else{
		same=false;
		$("#same").html("两次密码不一致");
	}
});
function　checkForm(){
	submit=opr&&same;
	return submit;
}

</script>
</body>
</html>
