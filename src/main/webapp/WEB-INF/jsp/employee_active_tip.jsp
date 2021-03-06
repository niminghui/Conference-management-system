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
        <i class="icon-smile-o"></i>系统已向您的邮箱${email }发送了一封邮件，请前往邮箱激活账户   
        <span style="display:none;"><i class="icon-frown-o"></i>操作失败!</span>
  
   </div>
    <h4 class="smaller"><a id="href" href="${basepath }/sm/employee/list">返回员工列表</a></h4> 
   
</div>

</body>
</html>
