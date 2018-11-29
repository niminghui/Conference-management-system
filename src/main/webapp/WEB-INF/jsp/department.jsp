<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>部门信息</title>
		<link rel="stylesheet" type="text/css" href="css/department.css" />
		<script type="text/javascript" src="js/department.js"></script>

	</head>

	<body>
		<div class="head">首页>>部门管理</div>
		<div class="head-2">
			<form method="post" action="findOneDepartment">
				<select class="selectClazz" name="conditions">
					<option value="0">部门ID</option>
					<option value="1">部门名称</option>
					<option value="2">部门简称</option>
				</select> <input class="searchInput" name="searchString" placeholder="记得检查查找条件哦" />
				<button type="submit" class="searchSubmit">查找</button>
			</form>

		</div>
		<div class="headLine"></div>
		<div class="toBeCenter">
			<c:if test="${!empty msg}">
				<p style="text-align: center; color: red;">${msg}</p>
			</c:if>
			<c:if test="${!empty department}">

				<div class="detailDep">
					<form action="updateNewDepartment" method="post">
					    <input name="departmentId" value="${department.departmentId}" style="display: none;">
						<a>部门名称：<input type="text" disabled="disabled" class="departmentInput1" name="departmentName" value="${department.departmentName}" /></a><br>
						<a>部门缩写：<input type="text" disabled="disabled" class="departmentInput1" name="departmentAbbreviation" value="${department.departmentAbbreviation}" /></a><br>
						<a>部门领导：<input type="text" disabled="disabled" class="departmentInput1" name="departmentHead" value="${department.departmentHead}" /></a><br>

						<a class="inputDep">上级部门：<input type="text" disabled="disabled" class="departmentInputPid" value="${department.departmentPid}" /></a>

						<nobr><a class="selectDep">上级部门：<select class="pidSelect" name="departmentPid">

								<c:forEach items="${findAllDepartmentToSelect}" var="DepartmentToSelect">
									<%-- <option value="${DepartmentToSelect.departmentId}"> ${DepartmentToSelect.departmentName}</option> --%>
									<c:if test="${department.departmentPid eq DepartmentToSelect.departmentName}">
									<option value="${DepartmentToSelect.departmentId}" selected="selected"> ${DepartmentToSelect.departmentName}</option>
									</c:if>
									<c:if test="${department.departmentPid != DepartmentToSelect.departmentName}">
									<option value="${DepartmentToSelect.departmentId}" > ${DepartmentToSelect.departmentName}</option>
									</c:if>

								</c:forEach>
							</select>

						</a></nobr><br />

						<a>部门电话：<input type="text" disabled="disabled" class="departmentInput1" name="departmentPhone" value="${department.departmentPhone}" /></a><br />
						<a>部门邮箱：<input type="text" disabled="disabled" class="departmentInput1" name="departmentEmail" value="${department.departmentEmail}" /></a><br />
						<a>部门信息创建人：${department.departmentCreatedUser}</a><br />
						<a>部门信息创建时间：
							<fmt:formatDate value="${department.departmentCreatedTime}" pattern="yyyy-MM-dd" />
						</a><br />
						<a>部门信息修改人：${department.departmentUpdatedUser} </a><br />
						<a>部门信息修改时间：
							<fmt:formatDate value="${department.departmentUpdatedTime}" pattern="yyyy-MM-dd" /> </a><br />
						<a>下属部门: ${fn:length(departments)}个</a>

						<div class="buttionDiv"><input type="button" id="shanchuId" value="删除">
							<input type="button" onclick="xiugai()" id="xiugaiAndChexiaoId" value="修改">
							<input type="submit" style="visibility: hidden;" id="tijiaoxiugaiId" value="提交修改"></div>
					</form>
				</div>
			</c:if>
			<div class="mainContent">
				<c:forEach items="${departments}" var="departmentS">
					<a href="findOneDepartmentById?searchString=${departmentS.departmentId}">
						<div class="createDiv">
							<p class="p1">${departmentS.departmentName}</p>
							<p>(${departmentS.departmentAbbreviation})</p>
							<p class="p2">${departmentS.departmentDetail}</p>
						</div>
					</a>
				</c:forEach>

			</div>
			<div style="height: 100px;">

			</div>
		</div>

	</body>

</html>