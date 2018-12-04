<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>会议管理系统</title>
<link rel="stylesheet" type="text/css" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" />
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js" charset="utf-8"></script>
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
if(${not empty updatePWDMessage})
	alert("${updatePWDMessage}");
</script>
</head>
<body>
	<div class="container" style="margin: 0 auto;">
		<h1 class="page-header">修改密码</h1>
		<form action="/scb.sms/Account/${account_id}" method="post" class="form-horizontal">
			<input type=hidden name="opt" value="updatePWD" />
			<div class="form-group">
				<div class="col-md-4">
					<div class="input-group">
						<div class="input-group-addon">原密码</div>
						<input type="password" class="form-control" name="pwd"
							placeholder="请输入原密码" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-4">
					<div class="input-group">
						<div class="input-group-addon">新密码</div>
						<input type="password" class="form-control" name="newPwd1"
							placeholder="请输入新密码" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-4">
					<div class="input-group">
						<div class="input-group-addon">确认密码</div>
						<input type="password" class="form-control" name="newPwd2"
							placeholder="请确认密码" />
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-4">
					<input type="submit" value="提交" class="btn btn-primary" />
				</div>
			</div>
		</form>
		<form action="/scb.sms/user" id="cancel" method="get">
			<input type="submit" value="取消" class="btn btn-info" />
		</form>
	</div>
</body>
</html>
