<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>新增职位</title>
        
         <link rel="stylesheet" href="css/position_add.css" />
        
    </head>
    <body>
    	
    	<div>
    		<div class="row">
				<h2 style="text-align: center;color: #0099CC;">新增职位信息</h2>
			</div>
			<div style="text-align: center;" class="addForm">
				<form action="${basepath }/sms/positionCreate" method="post">
					<div><span>职位ID：</span><input type="text" placeholder="请输入职位ID"/ name="positionId"></div><br />
					<div><span>职位名称：</span><input type="text" placeholder="请输入职位名称" name="positionName"/></div><br />
					<div><span>创建人：</span><input type="text" placeholder="请输入你的姓名" name="positionCreatedUser"/></div><br />
					<div>
						<input type="submit" value="提交" class="position_add_button"/>
						<input type="reset" value="重置" class="position_add_button"/>
					</div>
					
				</form>
			</div>
    	</div>
    	
 	</body>
</html>