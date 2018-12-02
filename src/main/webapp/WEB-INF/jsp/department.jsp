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
		<script type="text/javascript" src="js/jquery-3.1.1.js"></script>

	</head>

	<body>
		<!---->
		<div class="head-2">
			<a href="findParentDepartments" style="text-decoration:none;color: black;"><div class="leftHead">部门管理</div></a>
			<form method="post" action="findOneDepartment" class="formClazz">
				<select class="selectClazz" name="conditions">
					<option value="0">部门ID</option>
					<option value="1">部门名称</option>
					<option value="2">部门简称</option>
				</select> <input class="searchInput" name="searchString" placeholder="记得检查查找条件哦" />
				<button type="submit" class="searchSubmit">查找</button>
			</form>

		</div>
		<!--<div class="headLine"></div>-->
		<div class="toBeCenter">
			<c:if test="${!empty msg}">
				<p style="text-align: center; color: red;">${msg}</p>
			</c:if>
			<!-- <c:if test="${empty department }">
				<a style="text-align: center; display: block;">没有任何部门信息，看看数据库是不是被攻击了</a>
			</c:if> -->
			<c:if test="${!empty department }">

				<div class="detailDep">
					<form action="updateNewDepartment" method="post">
						<input name="departmentId" id="departmentId" value="${department.departmentId}" style="display: none;">
						<a>部门名称：<input type="text" disabled="disabled" class="departmentInput1" name="departmentName" value="${department.departmentName}" /></a><br>
						<a>部门缩写：<input type="text" disabled="disabled" class="departmentInput1" name="departmentAbbreviation" value="${department.departmentAbbreviation}" /></a><br>
						<a>部门领导：<input type="text" disabled="disabled" class="departmentInput1" name="departmentHead" value="${department.departmentHead}" /></a><br>

						<a class="inputDep">上级部门：<input type="text" disabled="disabled" class="departmentInputPid" value="${department.departmentPid}" /></a>

						<nobr>
							<a class="selectDep">上级部门：
								<select class="pidSelect" name="departmentPid">

									<c:forEach items="${findAllDepartmentToSelect}" var="DepartmentToSelect">
										<%-- <option value="${DepartmentToSelect.departmentId}"> ${DepartmentToSelect.departmentName}</option> --%>
										<c:if test="${department.departmentPid eq DepartmentToSelect.departmentName}">
											<option value="${DepartmentToSelect.departmentId}" selected="selected"> ${DepartmentToSelect.departmentName}</option>
										</c:if>
										<c:if test="${department.departmentPid != DepartmentToSelect.departmentName}">
											<option value="${DepartmentToSelect.departmentId}"> ${DepartmentToSelect.departmentName}</option>
										</c:if>

									</c:forEach>
								</select>

							</a>
						</nobr><br />

						<a>部门电话：<input type="text" disabled="disabled" class="departmentInput1" name="departmentPhone" value="${department.departmentPhone}" /></a><br />
						<a>部门邮箱：<input type="text" disabled="disabled" class="departmentInput1" name="departmentEmail" value="${department.departmentEmail}" /></a><br />
						<a>部门简介：<input type="text" style="width: 800px;" id="inDepartmentDetail"  disabled="disabled" name="departmentDetail" value="${department.departmentDetail}"/></a><br />
						<a>创建人：${department.departmentCreatedUser}</a><br />
						<a>创建时间：
							<fmt:formatDate value="${department.departmentCreatedTime}" pattern="yyyy-MM-dd" />
						</a><br />
						<a>修改人：${department.departmentUpdatedUser} </a><br />
						<a>修改时间：
							<fmt:formatDate value="${department.departmentUpdatedTime}" pattern="yyyy-MM-dd" /> </a><br />
						<a>下属部门: ${fn:length(departments)}个</a>

						<div class="buttionDiv">
							
							<input type="button" id="shanchuId" value="删除"  onclick="deleteWarning()">
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
				<a href="CreateNewDepartment">
					<div class="createDep">
						<p style="margin-top: 160px;">添加部门</p>
					</div>
				</a>
			</div>

			<div style="height: 100px;">

			</div>
		</div>

	</body>

</html>