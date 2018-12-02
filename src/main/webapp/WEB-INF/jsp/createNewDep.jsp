<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Create a new department</title>
<link rel="stylesheet" type="text/css" href="css/createNewDep.css" />
<script type="text/javascript" src="js/createNewDep.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
</head>

<body>

	<div class="detailDep">
		<a style="text-align: center; font-size: 30px; display: block;">创建部门</a>
		<c:if test="${!empty msg}">
				<p style="text-align: center; color: red;">${msg}</p>
			</c:if>
		<form action="FinishCreateNewDepartment" method="post" autocomplete="off">

			<a>部门名称：<input type="text" class="departmentInput1" id="departmentName" required="required" name="departmentName"  onchange="selectNameConflict()"/>
			</a><a class="" id="MSGdepartmentName"></a><br>
			<a>部门缩写：<input type="text" class="departmentInput1" id="departmentAbbreviation" required="required" name="departmentAbbreviation"  onchange="selectAbbreviConflict()"/></a>
			<a class="" id="MSGdepartmentAbbreviation"></a><br>
			<a>部门领导：<input type="text" class="departmentInput1" name="departmentHead"  /></a><br> 
			<a class="selectDep">上级部门： <select class="pidSelect" name="departmentPid">

					<c:forEach items="${findAllDepartmentToSelect}"
						var="DepartmentToSelect">

						<option value="${DepartmentToSelect.departmentId}">
							${DepartmentToSelect.departmentName}</option>

					</c:forEach>
			</select>
			</a> <br /> 
			<a>部门电话：<input type="text" required="required" class="departmentInput1" name="departmentPhone"  /></a><br /> 
			<a>部门邮箱：<input type="email" required="required" class="departmentInput1" name="departmentEmail" /></a><br />
			<a>部门简介：<input type="text" style="width: 800px;"name="departmentDetail" ></input></a><br /><br /> 
			<input type="submit" id="tijiaoxiugaiId" style="border: 1px solid darkgray; width: 100px; background-color: white; border-radius: 5px;  margin-left: 50px; "
				value="创建">
			<a href="findParentDepartments">
				<input type="button" style="border: 1px solid darkgray; width: 100px; background-color: white; border-radius: 5px;  margin-left: 50px;" value="取消">
			</a>
	</div>
	</form>
	</div>
</body>

</html>