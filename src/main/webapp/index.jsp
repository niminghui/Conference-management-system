<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8">
<title>会议管理系统</title>
<link rel="stylesheet" href="css/index.css" />
<link rel="stylesheet" href="css/login.css" />
<script type="text/javascript" src="js/index.js"></script>
<script>
			function changeYZM(){
				document.getElementById("yzmImg").setAttribute('src','/scb.sms/yzm?'+Math.random());
			}
			if(${not empty message})
				alert("${message}");
		</script>
</head>
<body>
	<div class="slider">
		<div class="main " id="template_main">
			<div class="main-i {{css}}" id="main_{{index}}">
				<div class="caption ">
					<h2>{{h2}}</h2>
					<h3>{{h3}}</h3>
				</div>
				<img src="img/{{index}}.jpg" class="picture" />
			</div>
		</div>
	</div>

	<div class="operation">
		<h2 id="title">会议管理系统</h2>
		<br />
		<form action="wpServlet" id="indexForm" method="post" onsubmit="">
			<input type="hidden" name="opt" value="login" />
			<div class="input">
				<img src="img/login-id.png" alt="用户密码" class="loginImg" /> &nbsp; <input
					type="text" name="uid" id="uid" autocomplete="off"
					placeholder="请输入登录帐号" />
			</div>
			<div class="input">
				<img src="img/login-pwd.png" alt="用户密码" class="loginImg" /> &nbsp; <input
					type="password" name="upwd" id="upwd" placeholder="请输入登录密码" />
			</div>
			<div class="input">
				<img src="img/login-yzm.jpg" alt="验证码" class="loginImg" /> &nbsp;
				&nbsp; <input type="text" name="uyzm" id="uyzm" placeholder="请输入验证码">
				&nbsp; <img border=0 id="yzmImg" alt="点击重新加载"
					src="/scb.sms/yzm" onclick="changeYZM();" />
			</div>
			<br /> <input type="submit" name="submit" class="btn" value="登录" />
			<div class="fillAreas"></div>
			<input type="submit" name="submit" class="btn" value="立即注册" />
		</form>
	</div>

	<div class="ctrl" id="template_ctrl">
		<a class="ctrl-i" id="ctrl_{{index}}"
			href="javascript:switchSlider({{index}});"> </a>
	</div>
	<div class="bottom">
		<h3>这里显示已有的会议信息（待完善）</h3>
	</div>
</body>
</html>
