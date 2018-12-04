<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/position_edit.css" />
    </head>
    <body>
    	
    	<div>
    		
    		<form action="${basepath }/sms/positionUpdate1" method="post" style="text-align: center;" class="form">
    			<h1 style="color: #0099CC;">修改职位信息</h1>
    			<table style="text-align: center;" class="table">
    				<tr>
    					<td>职位ID：</td>
    					<td><input type="text" value="${position.positionId}" name="positionId"/></td>
    				</tr>
    				<tr>
    					<td>职位名称：</td>
    					<td><input type="text" value="${position.positionName}" name="positionName"/></td>
    				</tr>
    				<tr>
    					<td>创建人：</td>
    					<td><input type="text" value="${position.positionCreatedUser}" name="positionCreatedUser"/></td>
    				</tr>
    				<tr>
    					<td>创建时间：</td>
    					<td><input type="text" value="${position.positionCreatedTime}" name="positionCreatedTime"/></td>
    				</tr>
    				<tr>
    					<td>修改人：</td>
    					<td><input type="text" value="${position.positionUpdatedUser}" name="positionUpdatedUser"/></td>
    				</tr>
    				<tr>
    					<td>修改时间：</td>
    					<td><input type="text" value="${position.positionUpdatedTime}" name="positionUpdatedTime"/></td>
    				</tr>
    			</table>
    				<div class="div_button">
						<input type="submit" value="修改" class="position_edit_button"/>
						<input type="reset" value="重置" class="position_edit_button"/>
					</div>
    		</form>
    	</div>
    	
 	</body>
</html>