<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/Head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${basepath }/css/pintuer.css">
<link rel="stylesheet" href="${basepath }/css/admin.css">
<script src="${basepath }/js/jquery.js"></script>
<script src="${basepath }/js/pintuer.js"></script>
</head>
<body>
<form method="post" action="" id="listform">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="${basepath }/sm/goAddEmployee"> 添加内容</a> </li>
        
      </ul>
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th>姓名</th>
        <th>英文名</th>
        <th>性别</th>
        <th>职位</th>
        <th>部门</th>
        <th>公司</th>
        <th>座机号</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>操作</th>
      </tr>
      <volist name="list" id="vo">
     <c:forEach items="${employees }" var="employee">
        <tr>
          <td>${employee.employeeName }</td>
          <td>${employee.employeeNickname }</td>
          <td>${employee.employeeGender }</td>
          <td>${employee.positionId }</td>
          <td>${employee.departmentId }</td>
          <td>${employee.employeeCompany }</td>
          <td>${employee.employeeContactInfo.employeeLandline }</td>
          <td>${employee.employeeContactInfo.employeePhone }</td>
          <td>${employee.employeeContactInfo.employeeEmail }</td>
          <td><div class="button-group"> <a class="button border-main" href="${basepath }/sm/goEditEmployee?employeeId=${employee.employeeId}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" onclick="return del('${employee.employeeId}')"><span class="icon-trash-o"></span> 删除</a> </div></td>
        </tr>
        </c:forEach>
      
    </table>
  </div>
</form>
<script src="${basepath }/js/page.js"></script>
		<div id="pagelist" class="pagelist"></div>
		
<script type="text/javascript">
	$(function(){
		 $("#pagelist").mypage({
			pageNo:${pagingVO.curentPageNo},
			params:"",
			url:"${basepath }/sm/employeeList",
			totalPage:${pagingVO.totalCount} 
		}); 
	});
</script>
		
<script type="text/javascript">

//搜索
function changesearch(){	
		
}

//单个删除
function del(id){
	if(confirm("您确定要删除吗?")){
		window.location.href="${basepath}/sm/editEmployeeToLeave?employeeId="+id;
	}
}


</script>
</body>
</html>