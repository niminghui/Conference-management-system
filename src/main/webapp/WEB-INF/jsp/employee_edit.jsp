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
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加员工</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${basepath }/sm/editEmployee">  
    	<input type="hidden" name="employeeId" value="${employee.employeeId }">
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="${employee.employeeName }" name="employeeName" data-validate="required:请输入员工姓名" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>英文名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="${employee.employeeNickname }" name="employeeNickname" data-validate="required:请输入员工英文名" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
          <div class="label">
            <label>性别：</label>
          </div>
          <div class="field">
            <select name="employeeGender" class="input w50">
              <option value="男" <c:if test="${employee.employeeGender=='男' }">selected="selected"</c:if>>男</option>
              <option value="女" <c:if test="${employee.employeeGender=='女'  }">selected="selected"</c:if>>女</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        
        <div class="form-group">
          <div class="label">
            <label>职位：</label>
          </div>
          <div class="field">
            <select name="positionId" class="input w50" data-validate="required:请选择职位" >
              <option value="">请选择职位</option>
              
              <c:forEach items="${positions }" var="position">
              	<option value="${position.positionId }"<c:if test="${employee.positionId==position.positionName }">selected="selected"</c:if>>${position.positionName }</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        <div class="form-group">
          <div class="label">
            <label>部门：</label>
          </div>
          <div class="field">
            <select name="departmentId" class="input w50" data-validate="required:请选择部门" >
              <option value="">请选择部门</option>
              <c:forEach items="${departments }" var="department">
              	<option value="${department.departmentId }" <c:if test="${employee.departmentId==department.departmentName }">selected="selected"</c:if>>${department.departmentName }</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        
        <div class="form-group">
          <div class="label">
            <label>公司：</label>
          </div>
          <div class="field">
            <select name="employeeCompany" class="input w50" data-validate="required:请选择公司" >
              <option value="">请选择公司</option>
              <option value="渣打" <c:if test="${employee.employeeCompany=='渣打' }">selected="selected"</c:if>>渣打</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        
        <div class="form-group">
        <div class="label">
          <label>座机号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="${employee.employeeContactInfo.employeeLandline }" name="employeeLandline" data-validate="required:请输入员工座机号" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>手机号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="${employee.employeeContactInfo.employeePhone }" name="employeePhone" data-validate="required:请输入员工手机号" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="${employee.employeeContactInfo.employeeEmail }" name="employeeEmail" data-validate="required:请输入员工邮箱" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>住址：</label>
        </div>
        <div class="field">
          <textarea class="input"  name="employeeAddressStr" style=" height:90px;">${employee.employeeAddress.employeeAddressStr }</textarea>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>籍贯：</label>
        </div>
        <div class="field">
          <textarea class="input" name="employeeNativeplace" style=" height:90px;">${employee.employeeAddress.employeeNativeplace }</textarea>
          <div class="tips"></div>
        </div>
      </div>
	  <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>