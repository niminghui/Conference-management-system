
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/jsp/common/Head.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Position Page</title>
        <link rel="stylesheet" href="${basepath }/css/position.css" />
    </head>
    <body>
    	<div >   		
    		<div style="text-align: center;">
				<h1 class="tittle">职位信息显示</h1>
				<form style="margin: 20px 0 60px 550px; float: left;" action="${basepath }/sms/positionSelect" id="form1" method="post">
					<div>
						<input type="text" placeholder="请输入职位名称" name="positionName" class="chaxunkuang">
						<input type="submit" value="查询" class="button_chaxun"/>
					</div>
				</form>	
				<a href="${basepath }/sms/positionAdd" style="float: left;"><button style="margin-top: 20px" class="button_chaxun">新增职位</button></a>
			</div>
			<div style="float:left">
			<table class="position_table">
				 <tr style="text-align: center;">
					<td><span class="position_word"><b>职位ID</b></span></td>
					<td><span class="position_word"><b>职位名称</b></span></td>
					<td><span class="position_word"><b>创建人</b></span></td>
					<td><span class="position_word"><b>创建时间</b></span></td>
					<td><span class="position_word"><b>修改人</b></span></td>
					<td><span class="position_word"><b>修改时间</b></span></td>	
				</tr>
				<c:forEach items="${positions}" var="position">
					<tr style="text-align: center;">
						<td><span class="position_word_1">${position.positionId}</span></td>
						<td><span class="position_word_1">${position.positionName}</span></td>
						<td><span class="position_word_1">${position.positionCreatedUser}</span></td>
						<td><span class="position_word_1">${position.positionCreatedTime}</span></td>
						<td><span class="position_word_1">${position.positionUpdatedUser}</span></td>
						<td><span class="position_word_1">${position.positionUpdatedTime}</span></td>
						<td><a href="${basepath }/sms/positionUpdate"><button class="position_list_button">编辑</button></a></td>
						<td><a href="${basepath }/sms/positionDelete"><button class="position_list_button">删除</button></a></td>
					</tr>
				</c:forEach>
			</table>
			</div>
    	</div>
    	
 	</body>
</html>