<%@page contentType="text/html; charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/jsp/common/Head.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Position Page</title>
        <link rel="stylesheet" href="${basepath}/css/log.css" />
        <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
        
        <!--   <script type="text/javascript">		
			$(function(){     
 			
 				$("#shanchu").click(
 					function(){
 						alert(document.getElementById("${employeelog.logEmployeeId }").value);
 						var str = {name:document.getElementById("log_employee_id").value};
 						var JsonStr = JSON.stringify(str);
 						
 						$.ajax({
 							url: "${basepath}/log/deleteEmployeeList",
							type: "POST",
							async : false,  //同步请求
							datatype: "JSON",
							contentType :'application/json',
							data: JsonStr,
							success: function(data){
								if(data == "success")
									{
										alert("删除成功！");
										
									}
									
								else
									alert("删除失败！");
							},
							error: function(){
								alert("操作失败");
							}
						});
 					}
 				);
 				
			});
		</script>-->
        
    </head>
    <body>
    	<div>   		
    		<div >
				
				<form style="margin-top: 60px;" action="${basepath}/log/showEmployeeList" id="form1" method="post">
					<div>
						<select class="selected" id="leixing" name="leixing">
							<option value="账号">账号</option>
							<option value="部门">部门</option>
							<option value="职员">职员</option>
							<option value="登录记录">登录记录</option>
							<option value="菜单">菜单</option>
							<option value="职位">职位</option>
							<option value="系统参数">系统参数</option>
						</select>
						<input type="submit" id="chaxun" value="查询" class="button_chaxun"/>
					</div>
				</form>	
			</div>
			
			<table class="position_table" border="1" cellspacing="0" style="border-color: lightblue;">
				 <tr style="text-align: center;">
				 	<td><span class="position_word"><b>操作ID</b></span></td>
					<td><span class="position_word"><b>操作类型</b></span></td>
					<td><span class="position_word"><b>操作账户</b></span></td>
					<td><span class="position_word"><b>操作时间</b></span></td>
					<td><span class="position_word"><b>操作</b></span></td>
				</tr>
				 <c:forEach items="${employeeLog }" var="employeelog">
					<tr class="sp_1">
						<td><span class="position_word_1">${employeelog.logEmployeeId }</span></td>
						<td><span class="position_word_1">${employeelog.logEmployeeOperatorType }</span></td>
						<td><span class="position_word_1">${employeelog.logEmployeeOperatorEid}</span></td>
						<td><span class="position_word_1">${employeelog.logEmployeeOperatorTime}</span></td>
						
						<td width="120px"><a id="${employeelog.logEmployeeId }" href="javascript:void(0)" class="delbutton"><button id="shanchu" class="position_list_button">删除</button></a></td>
					</tr>
				</c:forEach>
			</table>
    	</div>
    	
    	<form id="toleave" action="" method="post">
			<input type="hidden" name="_method" /><br/>
		</form>
		
		<script type="text/javascript">
			$(".delbutton").click(function(){
				if(confirm("您确定要删除吗?")){
					var employeeId=$(this).attr("id");
					$("#toleave").attr("action","${basepath}/log/deleteEmployeeList/"+employeeId);
					$("#toleave").submit();
				}
			});
		</script>
 	</body>
</html>